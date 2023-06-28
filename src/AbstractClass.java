import java.util.Scanner;

// 추상 클래스와 인터페이스의 차이: Abstract는 일반 메소드를 사용할 수 있지만, interface는 메소드 선언만 가능하다.
// interface = abstract - 자식이 구현해'줘'
// abstract는 구현부가 없어서 객체생성이 안된다.
abstract class House{
	abstract public void build2();
	public void build() {
		System.out.println("집을 짓습니다.");
	}
}
class House2 extends House{
	@Override
	public void build2() {
		System.out.println("집을 짓습니다2.");
	}
}
abstract class Calc{
	protected int a;
    protected int b;
    void setValue(int a, int b) {this.a = a; this.b = b;}
    abstract int calculate();
}
class Add extends Calc{
	@Override
	int calculate() {
		return a + b;
	}
}
class Sub extends Calc{
	@Override
	int calculate() {
		return a - b;
	}
}
class Mul extends Calc{
	@Override
	int calculate() {
		return a * b;
	}
}
class Div extends Calc{
	@Override
	int calculate() {
		return a / b;
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		House house = new House2();
		house.build2();
		
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0); // ex) 7 8 +

        if(c == '+'){
            Add add = new Add();
            add.setValue(a, b);
            System.out.println(add.calculate());
        }
        else if(c == '-'){
            Sub sub = new Sub();
            sub.setValue(a, b);
            System.out.println(sub.calculate());
        }
        else if(c == '*'){
            Mul mul = new Mul();
            mul.setValue(a, b);
            System.out.println(mul.calculate());
        }
        else if(c == '/'){
            Div div = new Div();
            div.setValue(a, b);
            System.out.println(div.calculate());
        }
	}
}