import java.util.Scanner;
public class ArrayPractice {
	 public static int getArr() {
	      Scanner sc = null;
	      int num =0;
	      while(true) {
	         sc = new Scanner(System.in);
	         num = sc.nextInt();
	      if(num < 1 || num >10 ) {
	            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
	            continue;
	         }else {
	            break;
	         }         
	      }
	      return num;
	   }
	   public static void main(String[] args) {
	      int row,col; // 변수 선언
	      int[][] arr;
	      System.out.print("행크기:");
	      row = getArr();
	      System.out.print("열크기:");
	      col = getArr();
	      arr = new int[row][col];
	      for (int i = 0; i < arr.length; i++) { // 알파벳 입력및 출력
	         for (int j = 0; j < arr[i].length; j++) {
	            arr[i][j] = (int)(Math.random() * 26 + 65);
	            System.out.print((char)arr[i][j] + " ");
	         }
	         System.out.println();
	      }    
	   }
}