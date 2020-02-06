package util;

import java.io.File;
import java.io.IOException;

public class FIleUtil {
	
	public static void createFile(String path) throws IOException {
		File file = new File(path);
		file.createNewFile();
	}

}
