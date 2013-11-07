package reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.File;
import objects.GoodsLookup;
import objects.ini.Base;
import objects.ini.Commodity;
import objects.ini.Good;
import java.io.FileReader;
import objects.ini.Ship;

import org.apache.commons.io.IOUtils;

public class IniReader {
	public static final String MARKET_COMMODITIES = Reader.MAIN_PATH
			+ IOUtils.DIR_SEPARATOR + "DATA" + IOUtils.DIR_SEPARATOR
			+ "EQUIPMENT" + IOUtils.DIR_SEPARATOR + "market_commodities.ini";

	public static final String GOODS = Reader.MAIN_PATH + IOUtils.DIR_SEPARATOR
			+ "DATA" + IOUtils.DIR_SEPARATOR + "EQUIPMENT"
			+ IOUtils.DIR_SEPARATOR + "goods.ini";

	public static final String SYSTEM_LOOKUP = Reader.MAIN_PATH
			+ IOUtils.DIR_SEPARATOR + "IONCROSS" + IOUtils.DIR_SEPARATOR
			+ "GAMEDATA_systems.txt";

	public static final String BASES_LOOKUP = Reader.MAIN_PATH
			+ IOUtils.DIR_SEPARATOR + "IONCROSS" + IOUtils.DIR_SEPARATOR
			+ "GAMEDATA_bases.txt";

	public static final String CARGO_LOOKUP = Reader.MAIN_PATH
			+ IOUtils.DIR_SEPARATOR + "IONCROSS" + IOUtils.DIR_SEPARATOR
			+ "GAMEDATA_cargo.txt";
	
	
	

	@SuppressWarnings("unused")
	public List<Good> readGoodsIni() throws IOException {
		String contents = Reader.readFile(GOODS);
		String[] lines = contents.split("\n");
		System.out.println("Lines.length : " + lines.length);

		boolean sameGood = false;
		boolean isCommodity = false;
		boolean isShip = false;
		List<Good> goodList = new ArrayList<Good>();
		Commodity commodity = null;
		Ship ship = null;
		String nickname = "";
		String equipment = "";
		String idPrefix = "";

		int count = 0;
		for (String line : lines) {
			if (count++ < 10)
				System.out.println("Line: " + line);
			if (line.startsWith("[Good]")) {
				if (isCommodity) {
					goodList.add(commodity);
				}
				sameGood = false;
				isCommodity = false;
				isShip = false;
			} else {
				sameGood = true;
			}
			if (sameGood) {
				if (line.startsWith("nickname")) {
					nickname = line.substring(line.indexOf("=") + 1).trim();
				} else if (line.startsWith("equipment")) {
					equipment = line.substring(line.indexOf("=") + 1).trim();
				} else if (line.startsWith("msg_id_prefix")) {
					idPrefix = line.substring(line.indexOf("=") + 1).trim();
				} else if (line.startsWith("category")) {
					// If it is a ship, ignore for now
					// if it is a equipment, ignore
					if (line.contains("commodity")) {
						commodity = new Commodity();
						commodity.setEquipmentName(equipment);
						commodity.setNickname(nickname);
						commodity.setIdPrefix(idPrefix);
						commodity.setCategoryType(line.substring(
								line.indexOf("=") + 1).trim());
						isCommodity = true;
					}
				} else if (line.startsWith("price")) {
					if (isCommodity)
						commodity.setBasePrice(new Double(line.substring(
								line.indexOf("=") + 1).trim()));
				}
			}
		}
		return goodList;
	}

	@SuppressWarnings("unused")
	public void readMarketCommoditiesIni(Map<String, Base> baseMap)
			throws IOException {

		String contents = Reader.readFile(MARKET_COMMODITIES);
		String[] lines = contents.split("\n");
		System.out.println("\n\nMARKET_COMMODITIES Lines.length : "
				+ lines.length);
		boolean sameGood = false;

		int count = 0;
		String baseName = "";

		for (String line : lines) {
			// System.out.println("Line: " + line);
			if (line.length() > 1 && !line.contains("null")) {
				if (!line.startsWith("[BaseGood]")) {
					if (line.startsWith("base")) {
						baseName = line.substring(line.indexOf("=") + 1).trim();
					} else {
						Commodity commodity = new Commodity();
						commodity.parseMarketCommodityIni(line);

						Base base = baseMap.get(baseName);
						if (base == null)
							base = new Base();
						base.addToCommodityList(commodity);
						baseMap.put(baseName, base);
					}
				}
				count++;
			}
		}
	}

	public void readAllLookups(GoodsLookup goodsLookup) throws IOException {
		readSystemLookup(goodsLookup);
		readBaseLookup(goodsLookup);
		readCargoLookup(goodsLookup);
	}

	public void readSystemLookup(GoodsLookup goodsLookup) throws IOException {
		String contents = Reader.readFile(SYSTEM_LOOKUP);
		String[] lines = contents.split("\n");
		for (String line : lines) {
			if (line.length() > 1 && !line.contains("null")) {
				String[] data = line.split("=");
				goodsLookup.addToSystemsMap(data[0], data[1]);
			}
		}
	}

	public void readBaseLookup(GoodsLookup goodsLookup) throws IOException {
		String contents = Reader.readFile(BASES_LOOKUP);
		String[] lines = contents.split("\n");
		for (String line : lines) {
			if (line.length() > 1 && !line.contains("null")) {
				String[] data = line.split("=");
				goodsLookup.addToBaseMap(data[0], data[1]);
			}
		}
	}

	public void readCargoLookup(GoodsLookup goodsLookup) throws IOException {
		String contents = Reader.readFile(CARGO_LOOKUP);
		String[] lines = contents.split("\n");
		for (String line : lines) {
			if (line.length() > 1 && !line.contains("null")) {
				String[] data = line.substring(line.indexOf("=") + 1).trim()
						.split(",");
				goodsLookup.addToCargoMap(data[0], data[1]);
			}
		}
	}

}
