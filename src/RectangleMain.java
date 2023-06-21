//Object Oriented Programming(객체지향언어) - 자바
class Student{
	int age;
	char gender;
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}

class Circle{
	double radius;
	//final double PI = 3.14;

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

class Rectangle2{
	double width, height;
	
	void setWidthHeight(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height;
	}
}
// 클래스와 객체=인스턴스의 차이: 객체는 .class를 메모리에 올린 것
public class RectangleMain {
	public static void main(String[] args) {
		Student kim = new Student(); //객체(인스턴스)
		Student lee = new Student();
		
		kim.setAge(40);
		kim.setGender('M');
		
		char gender = kim.getGender();
		int age = kim.getAge();
		System.out.println(gender);
		System.out.println(age);
		
		lee.setAge(30);
		age = lee.getAge();
		System.out.println(age);
		
		kim.age = 30;
		lee.age = 25;
		
		System.out.println(kim.age);
		System.out.println(lee.age);
		
		Rectangle rec = new Rectangle(); //Rectangle.java 파일이랑 연결
		rec.width = 3;
		rec.height = 5;
		System.out.println(rec.width);
		System.out.println(rec.height);

		Circle circle = new Circle();
		circle.setRadius(10);
		System.out.println(circle.getArea());
		
		Rectangle2 rec2 = new Rectangle2();
		rec2.setWidthHeight(10, 5);
		System.out.println(rec2.getArea());
}
}