// 인터페이스 안에 올 수 있는 것은 함수구현(X) -> 추상메서드와 상수만 올 수 있다.
// 인터페이스는 자손이 구현한다.
// 인터페이스를 사용하는 이유
//  - 선배들이 사용하기 때문에(표준 = 강제 = 규약 = 프린트드라이버)
//  - 다중 상속 지원
interface Printable{
	abstract public void print(String doc); // 함수 정의 = 함수 선언  = abstract = 추상메소드
}
interface Movable{
	abstract public void move();
}
class Printer implements Printable, Movable{
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
	@Override
	public void move() {
		System.out.println("움직입니다.");
	}
}
interface Printaable{
	abstract public void print(String doc);
	}
class SamsungPrinter implements Printaable{
	@Override
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}
}
class LGPrinter implements Printaable{
	@Override
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}
}
interface ICalculator{
	abstract public int add(int num1, int num2);
	abstract public int sub(int num1, int num2);
	abstract public int mul(int num1, int num2);
	abstract public int div(int num1, int num2);
}
class Calculator implements ICalculator{
	@Override
	public int add(int num1, int num2) {		
		return num1 + num2 ;
	}
	@Override
	public int sub(int num1, int num2) {		
		return num1 - num2 ;
	}
	@Override
	public int mul(int num1, int num2) {		
		return num1 * num2 ;
	}
	@Override
	public int div(int num1, int num2) {
		if(num2 == 0)
			return 0;
		return num1 / num2 ;
	}	
}
public class Interfacee {
	public static void main(String[] args) {
		Printer printer = new Printer(); // 인터페이스도 다형성이 적용됨
		printer.print("안녕하세요");
		printer.move();
		printer.print("드르륵");
		System.out.println();
		
		String myDoc = "This is a report about...";
		Printaable print = new SamsungPrinter();
		print.print(myDoc);
		System.out.println();
		print = new LGPrinter();
		print.print(myDoc);
		
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(3, 5));
		System.out.println(calculator.sub(3, 5));
		System.out.println(calculator.mul(3, 5));
		System.out.println(calculator.div(3, 5));
	}
}