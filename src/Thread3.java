// 동기화
class Accountt{
	int balance = 1000;
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			balance = balance - money;
		}
	}
}
class RunnableAccount implements Runnable{
	Accountt acc = new Accountt();
	@Override
	public void run() {
		while(acc.balance > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("::balance: " + acc.balance);
		}
	}
}
public class Thread3 {
	public static void main(String[] args) {
		Runnable r = new RunnableAccount();
		Thread t1 = new Thread(r, "첫 번째");
		Thread t2 = new Thread(r, "두 번째");
		t1.start();
		t2.start();
	}
}