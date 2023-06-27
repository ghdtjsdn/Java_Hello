// 상속
// 상속관계를 가지려면 반드시 두 대상은 IS-A 관계를 가져야 한다.
// 애매하다 싶으면 has-A 관계라서 상속을 쓰지 않는 것이 좋다.
class AA{
	private int a;
	public AA() {}
	public AA(int a) {
		this.a = a;
	}
	public void aaa() {
		System.out.println(a);
	}
}
// reuse: 재사용하기 위해 상속이 나왔다.
class BB extends AA{	
	private int b;
	public BB() {}
	// 기본적으로 부모의 함수 및 변수의 접근 방법은 super = 부모
	public BB(int a, int b) {
		super(a); // 부모 멤버변수 접근 방법 = super 생성자를 통해 기본적으로 접근한다.
		this.b = b;
	}
	public void bbb() {
		System.out.println(b);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		AA a = new AA();
		System.out.println(a.a);

		BB b = new BB();
		b.aaa();
		System.out.println(b.a);
		System.out.println(b.b);
	}
}