import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase {

	public static void main(String[] args) throws IOException{
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;
        //아래 문장에서 IOException 발생 가능
        writer = Files.newBufferedWriter(file);
	}

}
