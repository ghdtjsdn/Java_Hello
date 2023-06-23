import java.util.Scanner;

class Kimgrade{
	private String name;
	private int kor, eng, math;

	public Kimgrade(String name, int kor, int eng, int math) { 
	      this.name = name;
		  this.kor = kor;
	      this.eng = eng;
	      this.math = math; 
	   }
	public double getAvg() { 
	      return (kor + eng + math) / 3.0;
	   }
	public void showInfo() {
		System.out.println(name + "님의 평균은" + getAvg() + "성적은" + getGrade() + "입니다.");
	}
	public char getGrade() {
	      char ch = '가';
	      double avg = getAvg(); 
	      if(avg >=90) {
	         ch='수';
	      }
	      else if (avg >=80) {
	         ch='우';
	      }
	      else if (avg >=70) {
	         ch='미';
	      }
	      else if (avg >=60) {
	         ch='양';
	      }else {
	    	  ch='가';
	      }
	      return ch;
	   }
}
public class ConsoleScanner {

	public static void main(String[] args) {
		
			Scanner sc = null;
			Kimgrade grade = null;
			int kor, eng, math;
			String name;
			
			while(true) {
				sc = new Scanner(System.in);
				System.out.print("이름:");
				name = sc.next();
				System.out.print("국어:");
				kor = sc.nextInt();
				System.out.print("영어:");
				eng = sc.nextInt();
				System.out.print("수학:");
				math = sc.nextInt();
				grade = new Kimgrade(name, kor, eng, math);
				grade.showInfo();
				System.out.print("계속하시겠습니까?");
				String choice = sc.next();
				if(choice.equals(choice.compareToIgnoreCase("yes"))||choice.equals("y"))
					 continue;
				else
					break;
				}
				System.out.println("종료되었습니다.");
			}
	}