public class Method3 {

	public static void main(String[] args) {
		showAge(28, 183); // () - 변수값(Value)
		showAge(29, 190);
		
		int height = 179;
		showAge(25 , height);
		
		System.out.println(add(3,5));
		System.out.println(sub(3,5));
		System.out.println(mul(3,5));
		System.out.println(gradChar(90.8)); // 수
		System.out.println(gradChar(80.0)); // 우
		System.out.println(gradChar(50.0)); // 가
		
		showStar(1);
		showStar(2);
		showStar(5);
	}
	// (int age) - 변수 선언 = 인자 = Parameter
	public static void showAge(int age, int tall) {
		System.out.println("제나이는 " + age + "입니다.");
		System.out.println("제키는 " + tall + "입니다.");
	}
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public static int sub(int num3, int num4) {
		return num3 - num4;
	}
	public static int mul(int num5, int num6) {
		return num5 * num6;
	}
	public static char gradChar(double avg) {
		char ch = '가';
		if(avg >= 90) {
			ch = '수';
		}else if(avg >= 80) {
			ch = '우';
		}else if(avg >= 70) {
			ch = '미';
		}else if(avg >= 60) {
			ch = '양';
		}else{
			ch = '가';
		}
		return ch;
	}	 
	public static void showStar(int num) {
		for(int i = 1; i <= num; i++) {
	         for(int j = 1; j <= i; j++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	   }
}
// 함수 만드는 법! -
// 리턴타입 함수명(파라미터){
// return 리턴값
// }