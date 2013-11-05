package reader;

import static org.junit.Assert.fail;

import java.io.File;

import org.apache.commons.io.IOUtils;
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
	public void test() {
		StringBuilder sb = new StringBuilder();
		sb.append("DATA");
		sb.append(IOUtils.DIR_SEPARATOR);
		sb.append("EQUIPMENT");
		sb.append(IOUtils.DIR_SEPARATOR);
		sb.append("market_commodities.ini");
		File f = new File(Reader.getFileName(sb.toString()));
		IniReader.testReadIni(f);
		fail("Not yet implemented"); // TODO
	}

}
