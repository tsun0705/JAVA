package p996;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:/temp/test.txt");
		int readData;
		while(true) {
			readData = reader.read();
			if(readData==-1) break;
			System.out.print((char)readData);
		}
		reader.close();
	}

}
