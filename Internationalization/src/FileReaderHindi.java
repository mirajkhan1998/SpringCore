import java.io.FileReader;
import java.io.IOException;

public class FileReaderHindi {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("hindi.txt");
		int c=fr.read();
		while(c!=-1) {
			System.out.print((char)c);
			c=fr.read();
		}
		

	}

}
