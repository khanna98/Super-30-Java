package dynamicStorage;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		File f1 = new File("xyz.txt");
		f.createNewFile();
		f1.createNewFile();
		FileReader r = new FileReader(f);
		FileWriter w = new FileWriter(f1);
		try {
			int ptr;
			while ((ptr = r.read()) != -1) {
				System.out.print((char) ptr);
				w.write((char) ptr);
			}
			w.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (r != null) {
				r.close();
			}
			System.out.println("Files Copied !");
		}

	}

}
