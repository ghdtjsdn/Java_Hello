import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {

	public static void main(String[] args)throws IOException {
		OutputStream out = new FileOutputStream("data.dat");
		out.write(7);
		out.close();
		
		InputStream in = new FileInputStream("data.dat");
		int dat = in.read();
		in.close();
		System.out.println(dat);
	}
}
