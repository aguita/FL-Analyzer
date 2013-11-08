package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * 
 * This is a generic reader class.
 * @author Ags
 *
 */
public class Reader {

	// TODO: Put this into a configuration file
	public static final String MAIN_PATH = "C:" + IOUtils.DIR_SEPARATOR
			+ "Users" + IOUtils.DIR_SEPARATOR + "Ags" + IOUtils.DIR_SEPARATOR
			+ "AppData" + IOUtils.DIR_SEPARATOR + "Local"
			+ IOUtils.DIR_SEPARATOR + "Discovery Freelancer 4.87.0";

	public static long getFileSize(File f) {

		return FileUtils.sizeOf(f);
	}

	public static long getFileSizeFromMainDirectory(String fileName) {
		return FileUtils.sizeOf(new File(MAIN_PATH + IOUtils.DIR_SEPARATOR
				+ fileName));
	}

	public static String getFileName(String fileName) {
		return MAIN_PATH + IOUtils.DIR_SEPARATOR + fileName;
	}

	/**
	 * This reads in the file and puts each line into a StringBuffer which is
	 * then returned as a String.
	 * 
	 * @return A String representation of the file
	 * @throws IOException
	 */
	public static String readFile(String filePath) throws IOException {
		StringBuffer sb = new StringBuffer();
		String line = "";
		BufferedReader br = null;
		File file = new File(filePath);
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		while (line != null) {
			try {
				line = br.readLine();
				sb.append("\n" + line);
			} catch (NullPointerException e) {
				// if we reach this point, means we've reached the
				// end of the stream and should break out.
				break;
			}
		}
		try {
			br.close();
		} catch (IOException e) {
			// exception ignored

		}
		return sb.toString();
	}
}
