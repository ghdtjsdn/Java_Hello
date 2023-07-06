class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println(getName());
		
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println(getName());
		
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}
public class Thread1 {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		th1.start();
		th2.start();
	}
}
// Thread - 프로그램(프로세스) 안에 또다른 프로그램(쓰레드)
// 쓰레드의 실행 시점을 알 수 없음 - 전적으로 OS의 스케쥴링 알고리즘에 따라 움직이므로
// 프로그램은 기본적으로 쓰레드를 기준으로 context switching된다.
// 싱글 프로세스는 기본적으로 main 쓰레드가 있다.