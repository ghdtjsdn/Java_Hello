import java.util.Scanner;
public class CanYouSpeakEnglish {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("영어 단어를 입력하세요.");
	        String danUh = sc.nextLine();
	        int length = danUh.length();
	        System.out.println("총 글자 수는: " + length + "개 입니다.");
	        int moum = 0;
	        int jaum = 0;
	        for (int i = 0; i < length; i++) {
	            char ch = Character.toLowerCase(danUh.charAt(i));
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            	moum++;
	            } else if (Character.isLetter(ch)) {
	            	jaum++;
	            }
	        }
	        System.out.println("모음은: " + moum + "개 입니다.");
	        System.out.println("자음은: " + jaum + "개 입니다.");

	        sc.close();
	    }
	}