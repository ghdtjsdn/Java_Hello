
public class Constants {

	public static void main(String[] args) {
//      초기화(선언하자마자 값 넣는걸 초기화라고 함)
//		int a = 1; //X
//		int b;
//		b = 1; //O
		
		int countMax = 1; // 낙타표기법 = camel 표기법
//		상수의 이름은 모두 대문자로 하는게 국룰, 둘 이상 단어면 언더바로 연결하는게 국룰
//		final double MAX_SIZE = 3.14; // 뱀표기법 = snake 표기법
//		PI = 3.15; 컴파일 안됨
		System.out.println(countMax);
		
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12;
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
		
//		리터럴(Literals) - 자료형을 기반으로 표현이 되는 상수
//		int m = 5 + 7; // 정수형 리터럴(int가 디폴트)
//		double n = 3.3 + 4.5; // 실수형 리터럴(double이 디폴트)
		int num1 = 123; // 10진수 표현
		int num2 = 0123; // 8진수 표현
		int num3 = 0x123; // 16진수 표현
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
		System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
		System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
//		System.out.println(3147483647 + 3147483648); Int 범위를 넘어가서 에러남
		System.out.println(3147483647L + 3147483648L); //Long으로 바꾸면 ㄱㅊㄱㅊ
		
//		형 변환(Casting)
//		전제조건: 연산을 할 때 반드시 두 개의 피연산자의 datatype을 일치시킨다.
		int num4 = 50; //num4에 저장된 값이 long형으로 형 변환된다.(자동 형 변환)
		long num5 = 3147483647L;
		System.out.println(num4 + num5);
		
//		double pi = 3.1415; // 자동 형 변환 규칙에 부합하지는 않지만, 형 변환이 필요한 상황이면 사용(명시적 형 변환)
//		int wholeNumber = (int)pi;
//		
//		long num6 = 3000000007L;
//		int num7 = (int)num6;
	}

}
