
public class If {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 7;
//		if문
		if(n1 < n2) {
		System.out.println("n1 > n2 is true");
		}
		
//		if ~ else문
		if(n1 == n2) {
			System.out.println("n1 == n2 is true");	// false니까 출력이 되지 않는다.
		}
		else {
			System.out.println("n1 == n2 is false");
		}
		
//		if ~ else if ~ else문
		int num = 120;
		if(num < 0)
			System.out.println("0 미만");
		else if(num < 100)
			System.out.println("100 미만");
		else
			System.out.println("100 이상");
		
//		삼항연산자
		int result = (5 < 4) ? 50 : 40; // 5가 true라면 50이 출력, false이면 40이 출력
		System.out.println(result);
		
		int a; // 요거랑 똑같은 거임
		if (5 < 4)
			a = 50;
		else
			a = 40;
		System.out.println(a);
		
//		Switch 문: n값이 3이면 3이 출력되고, 그 밑으로 다 출력된다.
//		           break; 입력하면 해당 케이스만 출력된다.
		int n = 3;
		switch(n) {
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("God damn");
			break;
		case 3:
			System.out.println("I love you");
			break;
		default:
			System.out.println("I hate you");
		}	
		System.out.println("I want you");
		
//		while 문
		int numm = 1;
		while(numm <= 5) {
			System.out.println("Hello World!" + numm);
			numm++;
		} // 반복문: numm이 6이 되면 헬로월드가 멈춘다
		System.out.println(numm); // 6이 나온다
		
//		1부터 10까지의 합
		int nummm = 1;
		int sum = 0;
		while(nummm <= 10 ) {
			sum = sum + nummm;
			System.out.println(sum);
			nummm++;
		}
		System.out.println("합" + sum);
		
//		do ~ while 문 (처음에 무조건 한 번은 실행함) 위에 int 설정해놓은걸로 코딩한거임
		nummm = 1;
		sum = 0;
		do {
			sum = sum + nummm;
			nummm++;
		}while(nummm <= 10);
		System.out.println(sum);
		
//		for 문
		for(int i=0; i < 5; i++) { // 헬로월드 5번
			System.out.println("Hello World!!");
		}
		
		sum = 0; // 1부터 10까지의 합, 1부터 100까지 합은 5050임
		for(int i=1; i <= 10; i++) {
			sum = sum + i;}
			System.out.println(sum);
		
		sum = 0; // 1부터 100까지의 짝수의 합
		for(int i=1; i <= 100; i++) {
			if(i % 2 == 0) {
			sum = sum + i;}}
			System.out.println(sum);
			
		sum = 0; // 1부터 100까지의 홀수의 합
		for(int i=1; i <= 100; i++) {
				if(i % 2 == 1) {
			sum = sum + i;}}
			System.out.println(sum);
		
		for(int i=1; i <10; i++) { // 구구단 3단
			System.out.println("3*" + i + "=" + 3 * i);
		}
		
//		break 문(조건문하고 switch 문에 사용, if 문에는 사용 X)
		for (int i = 1; i <= 1000; i++) { //1부터 1000 중에 11배수이자 7배수인 첫 번째 숫자
			if((i % 7 == 0) && (i % 11 == 0)) {
			System.out.println(i);
			break; // if문이 아니라 for문에서 브레이크한거
			}
		}
//		continue 문
		
//		반복문의 중첩(2중 for문)
		for (int i = 1; i <= 9; i++) { // 구구단
			for(int j = 1; j <= 9; j++)
				System.out.println(i + " x " + j + " = " + (i * j));
		}
		for (int i = 1; i <= 9; i++) { // 구구단 짝수단
			for(int j = 1; j <= 9; j++)
				if(i % 2 == 0) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		
		for (int i = 1; i <= 9; i++) { // 구구단 결과값이 홀수인 것만 출력
			for(int j = 1; j <= 9; j++)
				if((i % 2 == 1) && (j % 2 == 1)) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		
	}
}
