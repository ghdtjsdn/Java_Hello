import java.util.Scanner;
// 에러처리 / 예외처리
// 1. try catch finally
// 2. throws
// 예외가 발생하면 기본적인 처리 매커니즘: JVM이 실행중단시키고, 예외 객체를 통해서 예외 문구를 보여준다.
public class ExceptionTry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int num = sc.nextInt();
			System.out.println(num);
//			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println("캐치 입니다.");
		} finally {
			System.out.println("파이널리 입니다.");
		}
		System.out.println("프로그램 종료입니다.");

	}

}
//