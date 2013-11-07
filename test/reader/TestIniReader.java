package reader;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import objects.GoodsLookup;
import objects.ini.Base;
import objects.ini.Commodity;
import objects.ini.Good;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIniReader {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCanFindFile() {
		File f = new File(IniReader.MARKET_COMMODITIES);
		long size = Reader.getFileSize(f);
		assertTrue("Size should be 1807986, but is : " + size, size == 1807986);

	}

	@Test
	public void testCanFindGoodsFile() {
		File f = new File(IniReader.GOODS);
		long size = Reader.getFileSize(f);
		assertTrue("Size should be 438903, but is : " + size, size == 438903);
	}

	@Test
	public void testCanReadCommodities() throws IOException {
		IniReader inir = new IniReader();
		List<Good> goodsList = null;

		goodsList = inir.readGoodsIni();

		assertTrue("Size of the list should be 279, but came back as: "
				+ goodsList.size(), goodsList.size() == 279);

		System.out.println("Size of Goods List: " + goodsList.size());
		int count = 0;
		for (Good good : goodsList) {
			// System.out.println(good.toString());
			if (count == 0) {
				assertTrue(
						"Category Type should be commodity, but is: "
								+ good.getCategoryType(), good
								.getCategoryType()
								.equalsIgnoreCase("commodity"));
				assertTrue(good.getNickname().equalsIgnoreCase(
						"commodity_jump_fuel"));
				assertTrue(good.getIdPrefix().equalsIgnoreCase(
						"gcs_gen_commodity_moxfuel"));
				assertTrue(good.getBasePrice().doubleValue() == 500);
			}
			count++;
		}
	}

	@Test
	public void testCanReadMarketCommodities() throws IOException {
		IniReader inir = new IniReader();

		Map<String, Base> baseMap = new TreeMap<String, Base>();

		inir.readMarketCommoditiesIni(baseMap);
		assertTrue(baseMap.size() > 0);

		assertTrue(baseMap.size() == 597);
		Base base = baseMap.get("Br01_01_base");
		List<Commodity> commodityList = base.getCommodityList();
		assertTrue("Should be 113, but is: " + commodityList.size(),
				commodityList.size() == 113);
		Commodity commod = commodityList.get(0);
		assertTrue(
				commod.getNickname(),
				commod.getNickname().equalsIgnoreCase(
						"commodity_reinforced_alloys"));
	}

	@Test
	public void canReadCargoLookupFile() throws IOException {
		IniReader inir = new IniReader();

		GoodsLookup goodsLookup = new GoodsLookup();
		inir.readCargoLookup(goodsLookup);

		assertTrue(goodsLookup.getCommodityMap().size() > 0);
		assertTrue(
				"Should be 268, is: " + goodsLookup.getCommodityMap().size(),
				goodsLookup.getCommodityMap().size() == 268);
	}

	@Test
	public void canReadSystemsLookupFile() throws IOException {
		IniReader inir = new IniReader();

		GoodsLookup goodsLookup = new GoodsLookup();
		inir.readSystemLookup(goodsLookup);

		assertTrue(goodsLookup.getSystemMap().size() > 0);
		assertTrue("Should be 155, is: " + goodsLookup.getSystemMap().size(),
				goodsLookup.getSystemMap().size() == 155);
	}

	@Test
	public void canReadBaseLookupFile() throws IOException {
		IniReader inir = new IniReader();

		GoodsLookup goodsLookup = new GoodsLookup();
		inir.readBaseLookup(goodsLookup);

		assertTrue(goodsLookup.getBaseMap().size() > 0);
		assertTrue("Should be 599, is: " + goodsLookup.getBaseMap().size(),
				goodsLookup.getBaseMap().size() == 599);
	}

	@Test
	public void canReadAllLookupFile() throws IOException {
		IniReader inir = new IniReader();

		GoodsLookup goodsLookup = new GoodsLookup();
		inir.readAllLookups(goodsLookup);

		assertTrue(goodsLookup.getBaseMap().size() > 0);
		assertTrue("Should be 599, is: " + goodsLookup.getBaseMap().size(),
				goodsLookup.getBaseMap().size() == 599);
		
		assertTrue(goodsLookup.getSystemMap().size() > 0);
		assertTrue("Should be 155, is: " + goodsLookup.getSystemMap().size(),
				goodsLookup.getSystemMap().size() == 155);
		
		assertTrue(goodsLookup.getCommodityMap().size() > 0);
		assertTrue(
				"Should be 268, is: " + goodsLookup.getCommodityMap().size(),
				goodsLookup.getCommodityMap().size() == 268);
	}

}
