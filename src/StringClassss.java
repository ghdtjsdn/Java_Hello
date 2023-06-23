// String 인스턴스는 immutable 인스턴스(한 번 선언하면 변경할 수 없다) -> for문 돌릴 때 주의
public class StringClassss {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if(str1.equals(str3)) // 글자가 동일한지 비교
			System.out.println("str1과 str3는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str3는 다른 인스턴스 참조");
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		if(str3 == str4)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		// str3과 st4가 다른 인스턴스인 이유는 메모리가 별개다.
		
		// .concat(); = 문자열 합치기
		// .substring(); = 문자열 일부 추출   ex)abcdefg가 있으면 .substring(2)라고 하면 cdefg가 답이다
		String st1 = "Coffee";
		String st2 = "Bread";
		String st3 = st1.concat(st2);
		System.out.println(st3);
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		
		// .valufeOf(); = 기본 자료형 값을 문자열로 바꾸기
		double e = 3.141517;
		String se = String.valueOf(e);	
		System.out.println(se);
		
		// StringBuilder
		// 문자열 "123"이 저장된 인스턴스의 생성
		StringBuilder stbuf = new StringBuilder("123");
		stbuf.append(45678); // 문자열 덧붙이기
		System.out.println(stbuf.toString());
		stbuf.delete(0, 2); // 문자열 일부 삭제
		System.out.println(stbuf.toString());
		stbuf.replace(0, 3, "AB"); // 문자열 일부 교체
		System.out.println(stbuf.toString());
		stbuf.reverse(); // 문자열 내용 뒤집기
		System.out.println(stbuf.toString());
		String sub = stbuf.substring(2, 4); // 일부만 문자열로 변환
		System.out.println(sub);
		}
}