
public class IfExercise4 {

	public static void main(String[] args) {
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		int result = (num1 > num2) ? num1: num2;
		result = (result > num3) ? result : num3;
		System.out.println(result);
	}
}
