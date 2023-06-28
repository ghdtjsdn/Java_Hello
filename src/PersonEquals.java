class Personn{
	private String name;
	private int age;
public Personn(String name, int age) {
	this.name = name;
	this.age = age;
}
@Override
public boolean equals(Object obj) {
	Personn personn = (Personn) obj;
	if(name.equals(personn.name) && age == personn.age)
		return true;
	return false;
}
}
public class PersonEquals {
	public static void main(String[] args) {
		Personn kim = new Personn("홍길동",35);
		Personn park = new Personn("홍길동",35);
		Personn heo = new Personn("홍길동",34);
		      
		if(kim.equals(park))
		    System.out.println("같은 사람입니다.");
		else
		    System.out.println("다른 사람입니다.");
		      
		if(kim.equals(heo))
		    System.out.println("같은 사람입니다.");
		else
		    System.out.println("다른 사람입니다.");
	}
}
