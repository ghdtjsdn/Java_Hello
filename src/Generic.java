//제너릭 - 타입을 컴파일 시점에서 미리 정하고 들어감.
class Box<T>{
	private T ob; 
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class Apple{}
class Orange{}

//제네릭 문법 = 데이터 타입을 파라미터화 시킴
class DBox<L, R>{
	private L left;
	private R right;
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	@Override
	public String toString() {
		return left + " & " + right;
	}
}

class Boxx<T extends Number>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory{
	public static<T> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}


public class Generic {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		aBox.set(new Apple());
		oBox.set(new Orange());
		Apple ap = aBox.get();
		Orange og = oBox.get();
		System.out.println(ap);
		System.out.println(og);
		System.out.println();
		
		DBox<String, Integer> dbox = new DBox<>();
		dbox.set("Apple", 25);
		System.out.println(dbox);
		System.out.println();
		
		Boxx<Integer> iBox = new Boxx<>();
		iBox.set(24);
		Boxx<Double> dBox = new Boxx<>();
		dBox.set(5.97);
		System.out.println(iBox.get());
		System.out.println(dBox.get());
		System.out.println();
		
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		System.out.println(sBox.get());
		Box<Double> uBox = BoxFactory.<Double>makeBox(7.59);
		System.out.println(uBox.get());
		System.out.println();
		
		Box<Integer> box1 = new Box<>();
	    box1.set(99);   //오토 박싱 
	    Box<Integer> box2 = new Box<>();
	    box2.set(55);   //오토 박싱 
	    System.out.println(box1.get() + " & " + box2.get()); // 99 & 55
	    swapBox(box1, box2);
	    System.out.println(box1.get() + " & " + box2.get()); // 55 & 99
	}
	public static <T> void swapBox(Box<T> box1, Box<T> box2) {
	    T temp = box1.get();
	    box1.set(box2.get());
	    box2.set(temp);
	}
}