package reader;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class Reader {

	// TODO: Put this into a configuration file
	public static final String MAIN_PATH = "C:" + IOUtils.DIR_SEPARATOR
			+ "Users" + IOUtils.DIR_SEPARATOR + "Ags" + IOUtils.DIR_SEPARATOR
			+ "AppData" + IOUtils.DIR_SEPARATOR + "Local"
			+ IOUtils.DIR_SEPARATOR + "Discovery Freelancer 4.87.0";

	public static long getFile(File f) {
		return FileUtils.sizeOf(f);
	}

	public static long getFileFromMainDirectory(String fileName) {
		return FileUtils.sizeOf(new File(MAIN_PATH + IOUtils.DIR_SEPARATOR
				+ fileName));
	}
}
