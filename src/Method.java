// 함수는 () 소괄호로 판단, 소괄호 앞에는 함수명
// 함수 -> 만드는법 + 써먹는법을 알아야한다.
public class Method {

	public static void hiEveryone() {
		System.out.println("안녕하세요.");
	}
	
	public static void hiCar() {
		System.out.println("안녕하세요 함수 입니다.");
	}
	
	public static void showFunction() {
		System.out.println("함수1");
		System.out.println("함수2");
	}
	
	public static void showStar1() {
		for(int i=1; i<=5; i++) {     
			for(int j=1; j<=i; j++) { 
			System.out.print("*");	 
		}							 
			System.out.println();	  
		}
	}
	public static void main(String[] args) {
		showFunction();
		hiCar();
		hiEveryone();
		System.out.println("드르륵끽끽");	
		showStar1();
	}
}
