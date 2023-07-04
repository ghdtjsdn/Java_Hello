import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ChStream {
// FileWriter
	public static void main(String[] args) {
		try(Writer out = new FileWriter("data1.txt")){
			for(char ch = 'A'; ch <= 'Z'; ch++)
				out.write(ch); // ABCDEFGHIJKLMNOPQRSTUVWXYZ
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}