// @ = 에너테이션은 기본적으로 일정한 기능을 가진 함수
// @Override = 부모에 해당 함수가 있어야 한다.
class AAAAA extends Object{
	@Override
	public String toString() {
		return "드르르르라";
	}
}
class Circlel{
	private double radius;
	public Circlel(){}
	public Circlel(double radius){
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
	@Override
	public String toString() {
		return "원의 넓이는 " + getArea() + "이고 반지름은 " + radius + "인 원";
	}
}
class Rectanglel {
	   private int width;
	   private int height;
	   public int getWidth() {      
	      return width;
	   }
	   public void setWidth(int width) {
	      this.width = width;
	   }
	   public int getHeight() {
	      return height;
	   }
	   public void setHeight(int height) {
	      this.height = height;
	   }
	   @Override
	   public String toString() {
	      return "가로:" + width + "세로:" + height;
	   }
	// 자식 = 부모 되는 케이스는 자식 =(자식)부모 시켜서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함	   
	   @Override
	   public boolean equals(Object obj){
		   Rectanglel rec = (Rectanglel) obj;
	      if( (this.width == rec.width) && (this.height == rec.height))
	         return true;
	      return false;
	   }  
	}
class Member{
	private String color;
	public Member(String color) {
		this.color = color;
	}
	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		if(color.equals(member.color))
			return true;
		return false;
	}
}

public class ObjectClass {
	public static void main(String[] args) {
	String str = new String("드르륵끽끽");
	System.out.println(str);
	
	AAAAA aaaaa = new AAAAA(); // null이 아니면 부모(Object)에 있는 toString 호출
	System.out.println(aaaaa);
	
	AAAAA bbbbb = new AAAAA(); // false , 오버라이딩이 안되있으면 주소값이 비교되서 false가 나온다.
	boolean a = aaaaa.equals(bbbbb);
	System.out.println(a);
	
	Circlel circlel = new Circlel(10);
    System.out.println(circlel); //원의 넓이는 314.1592...이고 반지름은 10.0인 원
    
    Rectanglel rec = new Rectanglel();
    Rectanglel rec2 = new Rectanglel();   
    boolean b = rec.equals(rec2);
    System.out.println(b);
    
    Member obj1 = new Member("Black");
    Member obj2 = new Member("Black");
    Member obj3 = new Member("White");
    System.out.println(obj1.equals(obj2)); // true가 출력
    System.out.println(obj1.equals(obj3)); // false가 출력
	}
}
