import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOStream3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("대상 파일: ");
		String src = sc.nextLine();
		System.out.println("사본 이름: ");
		String dst = sc.nextLine();
		
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)){
			byte buf[] = new byte[1024];
			int len;
			int count = 1;
			while(true) {
					len = in.read(buf);
					if(len == -1)
						break;
					out.write(buf, 0, len);
					System.out.println("횟수: " + count++);
					}
				}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}