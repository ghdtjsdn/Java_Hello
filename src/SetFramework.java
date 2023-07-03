import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
// hash의 개념 = 임의의 길이의 데이터를 고정된 길이로 변환
// hash의 특징 = 단방향 암호화, 충돌이 일어나면 곤란
// Set: 저장 순서X, 중복 X	= List와 반대
class Num{
	private int num;
	public Num(int n) {num = n;}
	@Override
	public String toString() {return String.valueOf(num);}
	@Override
	public int hashCode() {return num % 3;}
	@Override
	public boolean equals(Object obj) {
		if(num == ((Num)obj).num)
			return true;
		else
			return false;
	}
}
class Peerson{
	private String name;
	private int age;
	public Peerson(String name, int age) {
	this.name = name;
	this.age = age;
}
	@Override
	public boolean equals(Object obj) {
	Peerson peerson = (Peerson) obj;
	if(name.equals(peerson.name) && age == peerson.age)
		return true;
	return false;
}
	@Override
	public String toString() {return name + "(" + age + "세)";}
	@Override
	public int hashCode() {return age;}
}

public class SetFramework {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy"); set.add("Box"); // Box가 중복되서 하나 빠짐
		set.add("Robot"); set.add("Box");
		System.out.println("인스턴스 수: " + set.size());
		//반복자를 이용한 전체 출력
		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		//for-each문을 이용한 전체 출력
		for(String s : set)
			System.out.print(s + '\t');
		System.out.println();
		
		Set<Num> sett = new HashSet<>();
		sett.add(new Num(3));
		sett.add(new Num(3));
		System.out.println(sett.size());
		
		HashSet<Peerson> hSet = new HashSet<Peerson>();
		hSet.add(new Peerson("LEE", 10));
		hSet.add(new Peerson("LEE", 10));
		hSet.add(new Peerson("PARK", 35));
		hSet.add(new Peerson("PARK", 35));
		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
		
		Set<Integer> setLotto = new HashSet<>();
		while(setLotto.size() != 6) {
			int num = (int)(Math.random() * 45) + 1;
			setLotto.add(num);
		}
		System.out.println(setLotto);
		
		HashSet<Num> sset = new HashSet<>();
        sset.add(new Num(7799));
        sset.add(new Num(9955));
        sset.add(new Num(7799));
        System.out.println("인스턴스 수: " + sset.size());
        for(Num n : sset)
            System.out.print(n.toString() + '\t');
        System.out.println();
        
        //트리셋은 정렬 상태가 유지된다.
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(3); tree.add(1);
        tree.add(2); tree.add(4);
        System.out.println("인스턴스 수: " + tree.size());
        //for-each문에 의한 반복
        for(Integer n : tree)
        	System.out.print(n.toString() + '\t');
        System.out.println();
        //Iterator 반복자에 의한 반복
        for(Iterator<Integer> itr = tree.iterator(); itr.hasNext();)
        	System.out.print(itr.next().toString() + '\t');
        System.out.println();
	}
}
