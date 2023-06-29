
public class WrapperClass {

	public static void main(String[] args) {
		Integer num1 = new Integer(29);
		Integer iobj = 10; // auto boxing
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int num3 = iobj.intValue(); // auto unboxing
		
		Double num2 = new Double(3.14);
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());
		
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1024");
		System.out.println("큰 수: " + Integer.max(n1, n2));
		System.out.println("작은 수: " + Integer.min(n1, n2));
		System.out.println("합: " + Integer.sum(n1, n2));
		
		System.out.println("12의 2진 표현: " + Integer.toBinaryString(12));
		System.out.println("12의 8진 표현: " + Integer.toOctalString(12));
		System.out.println("12의 16진 표현: " + Integer.toHexString(12));
	}

}
