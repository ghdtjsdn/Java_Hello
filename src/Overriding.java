// 메소드 오버라이딩 - 상속관계에서 똑같은 함수(이름, 리턴타입, 파라미터개수와 종류)로 바디{}(실행내용)만 달리하는 것 

//CheeseCake의 yummy 메소드가 Cake의 yummy 메소드를 오버라이딩 = 오버라이딩은 자식꺼
class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}
class CheeseCake extends Cake{
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}
// 다형성 + 오버라이딩 = 응용
class Robot{
	public void work() {}
}
class DanceRobot extends Robot{
	public void work() {
		System.out.println("춤추는 로봇입니다.");
	}
}
class DrawRobot extends Robot{
	public void work() {
		System.out.println("그림을 그리는 로봇입니다.");
	}
}
class WashRobot extends Robot{
	public void work() {
		System.out.println("세탁하는 로봇입니다.");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		c1.yummy();
		c2.yummy();
		
		Robot[] arrRobot = {new DanceRobot(), new DrawRobot(), new WashRobot()};
		for(Robot robot: arrRobot) {
			robot.work();
		}
	}
}