import javax.swing.JOptionPane;
class CountDownThread extends Thread{
	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {Thread.sleep(1000);} // 1초동안 delay
			catch(Exception e ) {}
		}
	}
}
public class Thread2 {
	public static void main(String[] args) {
		CountDownThread countdownthread = new CountDownThread();
		countdownthread.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}