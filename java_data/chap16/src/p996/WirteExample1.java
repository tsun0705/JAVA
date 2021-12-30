package p996;

import java.io.FileWriter;
import java.io.Writer;

public class WirteExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/Temp/text.txt");
		char[] data = "ȫ�浿".toCharArray();
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}

}
