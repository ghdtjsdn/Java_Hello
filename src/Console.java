import java.util.Scanner;
class Ccircle{
	private double radius;
	public Ccircle(){}
	public Ccircle(double radius){
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
class Rectanglee{
	private double width, height;
	public Rectanglee(){}	
	public Rectanglee(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double getAreaa() {
			return width * height;
		}
	}

public class Console {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in); // System.in = 키보드
		Rectanglee rectangle;
		System.out.print("가로:");
		double width = sc.nextDouble();
		System.out.print("세로:");
		double height = sc.nextDouble();
		rectangle = new Rectanglee(width, height);
		System.out.println("넓이는:" + rectangle.getAreaa());

		Ccircle circle;
		System.out.print("반지름:");
		double radius = sc.nextDouble();
		circle = new Ccircle(radius);
		System.out.println("넓이는:" + circle.getArea());
		
		System.out.print("국어:");
		int num1 = sc.nextInt();
		System.out.print("영어:");
		int num2 = sc.nextInt();
		System.out.print("수학:");
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		System.out.println("합은 " + sum);	
		
		System.out.println("계속하시겠습니까?");
		String choice = sc.next();
		if(choice.equals(choice.compareToIgnoreCase("yes"))||choice.equals("y"))
			 continue;
		else
			break;
		}
		System.out.println("종료되었습니다.");
	}
}
