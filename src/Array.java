import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int num = 5;
		// 선언 방법 = 메모리 할당
		// 배열을 하면 메모리가 연속으로 잡힌다. ex) int[5]면 2000~2020이 할당됨
		int[] arrNum = new int[5];
		double[] arrDou = new double[5];
		long[] arrLong = new long[7];
		// 배열에서 length는 변수임
		System.out.println(arrNum.length);
		System.out.println(arrDou.length);
		System.out.println(arrLong.length);
		// 값 넣는 법(write)
		arrNum[0] = 5;
		arrNum[1] = 2;
		arrNum[2] = 3;
		arrNum[3] = 2;
		arrNum[4] = 5;
		// 값 출력 법(read)
		System.out.println(arrNum[2]);
		System.out.println(arrNum[1]);
		
		for(int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
		
		// 로또
		int[] arrLotto = new int[6]; // 변수선언
		for(int i=0; i <arrLotto.length; i++) { // 입력
			arrLotto[i] = (int)(Math.random() * 45 + 1);
			for(int j=0; j < i; j++) {
				if(arrLotto[i] == arrLotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<arrLotto.length;i++) { // 출력
			System.out.print(arrLotto[i] + "     ");
		}
		///////////////////////////////////////////////////
		System.out.println('\n');
		// 참조형
		String[] arrStr = new String[2];
		arrStr[0] = "String 1";
		arrStr[1] = "String 2";
		//arrStr의 문자열 갯수 세기
		int sum=0;
		for(int i=0; i<arrStr.length;i++) { 
			sum= sum + arrStr[i].length();
			System.out.println(arrStr[i]);
		}
		System.out.println(sum);
		
		// Circle (Console.java에 있는 Class)
		Ccircle[] arrCircle = new Ccircle[2];
		arrCircle[0] = new Ccircle(10.0);
		arrCircle[1] = new Ccircle(5);
		double area=0;
		for(int i=0; i<arrCircle.length;i++) { 
			area = area + arrCircle[i].getArea();
		} 
		System.out.println(area);
		
		// Rectanglee (Console.java에 있는 Class)
		Rectanglee[] arrRectangle = new Rectanglee[2];
		for(int i=0; i< arrRectangle.length; i++) {
			int width, height;
			Scanner sc = new Scanner(System.in);
			width = sc.nextInt();
			height = sc.nextInt();
			arrRectangle[i] = new Rectanglee(width,height);
		}
		double areaRec =0;
	      for(int i=0; i < arrRectangle.length;i++) {
	         areaRec = areaRec + arrRectangle[i].getAreaa();         
	      }
	      System.out.println(areaRec);
	}
}