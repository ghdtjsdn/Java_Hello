public class Method2 {
	
	int count; // Instance - 함수 바깥에 클래스 안에  있는 변수
	
	public static void main(String[] args) { // 지역변수 - 함수 안에 있는 변수
	divide(4, 2);
	divide(6, 2);
	divide(9, 0);
	
	double area = getCircleArea(10);
	System.out.println(area); // 314.0
	
	area = getRectangleArea(10,20);
	System.out.println(area); // 200.0
	
	area = getTriangleArea(40,20);
	System.out.println(area); // 400.0
	}
	
	public static void divide(int num1, int num2) {
	if(num2 == 0 ) {
		System.out.println("0으로 나눌 수 없습니다.");
		return;
	}
	System.out.println("나눗셈 결과: " + (num1 / num2));
}
	public static double getCircleArea(int radius) {
		final double PI = 3.14;
		return radius * radius * PI;
	}
	
	public static double getRectangleArea(double width, double height) {
		return width * height;
	}
	
	public static double getTriangleArea(double width, double height) {
		return width * height / 2.0;
	}
		
}