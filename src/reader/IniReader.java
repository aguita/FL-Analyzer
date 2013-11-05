package reader;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.ini4j.Profile.Section;
import org.ini4j.Wini;

public class IniReader {

	public static void testReadIni(File f) {
		try {
			Wini ini = new Wini(f);

			Set<Entry<String, Section>> iniSet = ini.entrySet();
			Iterator<Map.Entry<String, Section>> iniIter = iniSet.iterator();
			while (iniIter.hasNext()) {
				Map.Entry<String, Section> anEntry = iniIter.next();
				Section section = anEntry.getValue();
				System.out.println("Key: " + anEntry.getKey());

				Set<Entry<String, String>> sectionSet = section.entrySet();
				Iterator<Map.Entry<String, String>> sectionIter = sectionSet
						.iterator();

				while (sectionIter.hasNext()) {
					Map.Entry<String, String> sectionEntry = sectionIter.next();
					String value = sectionEntry.getValue();
					System.out.println("Key of Section: "
							+ sectionEntry.getKey());
					System.out.println("Value of Section: "
							+ sectionEntry.getValue());
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
