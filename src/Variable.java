
public class Variable {

	public static void main(String[] args) {
//		변수의 이름설정은 소문자가 국룰
		int num1;
		num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + num3);

//		오류(실수는 무한인데 메모리는 유한하기 때문에 근사값을 선택할 수 밖에 없다.)
		double nu1, nu2;
		double result;
		nu1 = 1.0000001;
		nu2 = 2.0000001;
		result = nu1 + nu2;
		System.out.println(result);
		
//		오류(JVM은 32비트가 기본값인데 Short는 16비트라서 바이트 안에 공간이 부족해서 컴파일이 안된다. int를 써라.)
//		short num4 = 11;
//		short num5 = 22;
//		short resultt = num4 + num5;
//		System.out.println(resultt);
		short num4 = 11;
		short num5 = 22;
		int resultt = num4 + num5;
		System.out.println(resultt);
		
//		오류(overflow, 결과를 int로 하면 약 21억인 int의 범위가 넘어버려서 연산오류가 된다. long을 써라.)
//		int num6 = 2100000000;
//		int num7 = 2100000000;
//		int resulttt = num6 + num7;
//		System.out.println(resulttt);
		long num6 = 2100000000;
		long num7 = 2100000000;
		long resulttt = num6 + num7;
		System.out.println(resulttt);
		
//		char는 문자를 입력할 때 쓰는 변수.
		char ch1 = '헐';
		char ch2 = '확';
		char ch3 = 54736; //문자 '헐'의 유니코드
		char ch4 = 54869; //문자 '확'의 유니코드
		char ch5 = 0xD5D0; //문자 '헐'의 16진수
		char ch6 = 0xD655; //문자 '확'의 16진수
		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
		
//		boolean은 참과 거짓으로만 표현한다.
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		int num8 = 10;
		int num9 = 20;
		System.out.println(num8 < num9);
		System.out.println(num8 > num9);// 자료형의 의미 - 메모리로 값을 올릴때, 해당 언어가 제공하는 자료형 하나로 잡아서 올라간다.
		
	}

}
