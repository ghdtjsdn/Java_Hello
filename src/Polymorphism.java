class AAA{
	public void aaa() {
		System.out.println("aaa 함수 입니다.");
	}
	public void ccc() {
		System.out.println("ccc 함수 입니다.");
	}
}
class BBB extends AAA{
	public void bbb() {
		System.out.println("bbb 함수 입니다.");
	}
	public void ccc() {
		System.out.println("ccc 함수 입니다.");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		System.out.println(aaa);
		
		BBB bbb = new BBB();
		System.out.println(bbb);
		bbb.aaa();
		
		AAA aaaa = new BBB();
		aaaa.aaa();
	//	aaaa.bbb(); 에러 발생
	//  BBB bbbb = new AAA(); 에러 발생
	}

}
