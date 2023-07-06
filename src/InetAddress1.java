import java.net.InetAddress;
import java.util.Scanner;

public class InetAddress1 {
	Scanner scanner;
	public InetAddress1() {
	      System.out.println("Host 이름을 입력 하세요.");	      
	      scanner = new Scanner(System.in);
	      try {
	         InetAddress inetAddress = InetAddress.getByName(scanner.next());	         
	         System.out.println("Computer NAME : " + inetAddress.getHostName());
	         System.out.println("Computer IP : " + inetAddress.getHostAddress());	         
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	      }
	   }
	
	public static void main(String[] args) {
		new InetAddress1();
	}
}