
public class Method4 {

	public static void main(String[] args) {
		int code = getAscCode('A'); // 65
		System.out.println(code); 
		code = getAscCode(' '); // 32
		System.out.println(code); 
		code = getAscCode('\n'); // 10
		System.out.println(code);
		code = getAscCode('1'); // 49
		System.out.println(code);
	}
	public static int getAscCode(char ch) {
		return (int)ch;
	}
}
