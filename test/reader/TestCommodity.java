package reader;

import static org.junit.Assert.assertTrue;
import objects.ini.Commodity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCommodity {

	Commodity commodity;

	@Before
	public void setUp() throws Exception {
		commodity = new Commodity();
	}

	@After
	public void tearDown() throws Exception {
		commodity = null;
	}

	@Test
	public void testParseMarketIniLine() {
		String line = "commodity_reinforced_alloys, 0, -1, 150, 500, 0, 2.500000";
		commodity.parseMarketCommodityIni(line);

		assertTrue(commodity.getNickname().equalsIgnoreCase(
				"commodity_reinforced_alloys"));
		assertTrue(commodity.getRankRequired() == 0);
		assertTrue(commodity.getRepNeeded() == -1);
		assertTrue(commodity.getMinStock() == 150);
		assertTrue(commodity.getMaxStock() == 500);
		assertTrue(commodity.getNoSell() == 0);
		assertTrue(commodity.getPriceMultiplier() == 2.5);
	}

	@Test
	public void testParseMarketIniLine2() {
		String line = "commodity_ablativearmor, 0, -1, 0, 0, 1, 5.540000";
		commodity.parseMarketCommodityIni(line);

		assertTrue(commodity.getNickname().equalsIgnoreCase(
				"commodity_ablativearmor"));
		assertTrue(commodity.getRankRequired() == 0);
		assertTrue(commodity.getRepNeeded() == -1);
		assertTrue(commodity.getMinStock() == 0);
		assertTrue(commodity.getMaxStock() == 0);
		assertTrue(commodity.getNoSell() == 1);
		assertTrue(commodity.getPriceMultiplier() == 5.540000);
	}

	@Test
	public void testParseMarketIniLine3() {
		String line = "commodity_samarium, 0, -1, 0, 0, 1, 30.430000";
		commodity.parseMarketCommodityIni(line);

		assertTrue(commodity.getNickname().equalsIgnoreCase(
				"commodity_samarium"));
		assertTrue(commodity.getRankRequired() == 0);
		assertTrue(commodity.getRepNeeded() == -1);
		assertTrue(commodity.getMinStock() == 0);
		assertTrue(commodity.getMaxStock() == 0);
		assertTrue(commodity.getNoSell() == 1);
		assertTrue(commodity.getPriceMultiplier() == 30.430000);
	}

	@Test
	public void testParseMarketIniLine3WithFullLine() {
		String line = "MarketGood = commodity_samarium, 0, -1, 0, 0, 1, 30.430000";
		commodity.parseMarketCommodityIni(line);

		assertTrue(commodity.getNickname(), commodity.getNickname()
				.equalsIgnoreCase("commodity_samarium"));
		assertTrue(commodity.getRankRequired() == 0);
		assertTrue(commodity.getRepNeeded() == -1);
		assertTrue(commodity.getMinStock() == 0);
		assertTrue(commodity.getMaxStock() == 0);
		assertTrue(commodity.getNoSell() == 1);
		assertTrue(commodity.getPriceMultiplier() == 30.430000);
	}

}
