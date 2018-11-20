package week9;

import java.io.*;

public class Utils {
	public static String readContentFromFile(String path) {

		File file = new File(path);
		String content = "";

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";

			while ((line = br.readLine()) != null) {
				content += line;
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}

	public static void writeContenttoFile(String path) {
		try {
			FileWriter fw = new FileWriter(path);
			fw.write("ghi noi dung moi! ");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void addContenttoFile(String path) {
		File file = new File(path);
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write("ghi moi noi dung");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static File findFileByName(String folderPath, String filename) {
		File folder = new File(folderPath);
		if (folder.isDirectory()) {
			File file = new File(filename);
			if (file.isFile()) {
				System.out.println("da thay");
				return file;
			}
			else {
				System.out.println("Khong tim thay");
				return null;
			}

		} else
		{
			System.out.println("Khong ton tai duong dan");
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(readContentFromFile("test.txt"));
		writeContenttoFile("test.txt");
		System.out.println(readContentFromFile("test.txt"));
		addContenttoFile("test.txt");
		System.out.println(readContentFromFile("test.txt"));
		System.out.println(findFileByName("F:\\GitHub\\oop2018", "test.txt"));
	}
}