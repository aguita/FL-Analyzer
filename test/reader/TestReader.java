/**
 * 
 */
package reader;

import static org.junit.Assert.*;

import java.io.File;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ags
 * 
 */
public class TestReader {
	Reader reader;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		reader = new Reader();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSizes() {
		assertTrue(Reader.MAIN_PATH
				.equalsIgnoreCase("C:\\Users\\Ags\\AppData\\Local\\Discovery Freelancer 4.87.0"));
		assertTrue(
				"Size should be 72361, but is : "
						+ Reader.getFile(new File(
								"C:\\Users\\Ags\\AppData\\Local\\Discovery Freelancer 4.87.0\\Uninstall.exe")),
				Reader.getFile(new File(
						"C:\\Users\\Ags\\AppData\\Local\\Discovery Freelancer 4.87.0\\Uninstall.exe")) == 72361);
		assertTrue(
				"Size should be 72361, but is : "
						+ Reader.getFileFromMainDirectory("Uninstall.exe"),
				Reader.getFileFromMainDirectory("Uninstall.exe") == 72361);
	}

	@Test
	public void testMarketCommoditiesIniSize() {
		StringBuilder sb = new StringBuilder();
		sb.append("DATA");
		sb.append(IOUtils.DIR_SEPARATOR);
		sb.append("EQUIPMENT");
		sb.append(IOUtils.DIR_SEPARATOR);
		sb.append("market_commodities.ini");
		assertTrue(
				"Size should be 1807986, but is : "
						+ Reader.getFileFromMainDirectory(sb.toString()),
				Reader.getFileFromMainDirectory(sb.toString()) == 1807986);
	}

	@Test
	public void testFlHookPluginsPrices() {
		StringBuilder sb = new StringBuilder();
		sb.append("EXE");
		sb.append(IOUtils.DIR_SEPARATOR);
		sb.append("flhook_plugins");
		sb.append(IOUtils.DIR_SEPARATOR);
		sb.append("prices.cfg");
		assertTrue(
				"Size should be 14740, but is : "
						+ Reader.getFileFromMainDirectory(sb.toString()),
				Reader.getFileFromMainDirectory(sb.toString()) == 14740);
	}

	@Test
	public void testShortestPath() {
		StringBuilder sb = new StringBuilder();
		sb.append("DATA");
		sb.append(IOUtils.DIR_SEPARATOR);
		sb.append("UNIVERSE");
		sb.append(IOUtils.DIR_SEPARATOR);
		sb.append("prices.cfg");
		assertTrue(
				"Size should be 14740, but is : "
						+ Reader.getFileFromMainDirectory(sb.toString()),
				Reader.getFileFromMainDirectory(sb.toString()) == 14740);
	}
}
