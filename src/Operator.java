
public class Operator {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		System.out.println(num1 * num2); // 21
		System.out.println(num1 / num2); // 2(원래 2.333..인데 int라서 소수점 다 날라감)
		System.out.println(num1 % num2); // 1(나누고 남은 나머지)
		
//      복합대입연산자
		num1 += 7; // num1 = num1 + 7;
		System.out.println(num1);
		
		
		short num = 10;
		num = (short)(num + 77L);
		int rate = 3;
		rate = (int)(rate * 3.5);
		System.out.println(num); // 87
		System.out.println(rate); // 10 (int라서 소수점 다 날라감)
		
		num = 10;
		num += 77L; // 형 변환 필요하지 않다.(복합대입연산자는 지가 알아서 형 변환 시켜버림)
		rate = 3;
		rate *= 3.5; // 형 변환 필요하지 않다. (복합대입연산자는 지가 알아서 형 변환 시켜버림)
		System.out.println(num); // 87
		System.out.println(rate); // 10 (int라서 소수점 다 날라감)
		
//		관계연산자
		System.out.println(3 >= 2);
		System.out.println(3 <= 2);
		System.out.println(7.0 == 7);
		System.out.println(7.0 != 7);
		
//		논리연산자 ( &&: and, ||: or, !: not)
		int num3 = 11;
		int num4 = 22;
		boolean result;
		// 변수 num3에 저장된 값이 1과 100 사이의 수인가?
		result = (1 < num3) && (num3 < 100);
		System.out.println("1 초과 100 미만인가? " + result);
		// 변수 num4에 저장된 값이 2 또는 3의 배수인가?
		result = ((num4 % 2)==0) || ((num4 %3) == 0);
		System.out.println("2 또는 3의 배수인가? " + result);
		// 변수 num3이 0인가?
		result = !(num3 != 0);
		System.out.println("0 인가? " + result);
		
		int num5 = 0;
		int num6 = 0;
		boolean resultt;
		resultt = ((num5 += 10) < 0) && ((num6 += 10) > 0); // false
		System.out.println("resultt = " + resultt);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6 + '\n'); //앞에거가 false니까 굳이 연산 안해서 0 나옴
		resultt = ((num5 += 10) > 0) || ((num6 += 10) > 0); // true
		System.out.println("resultt = " + resultt);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6); //앞에거가 True니까 굳이 연산 안해서 0 나옴

//		print를 쓰면 개행이 일어나지 않는다.
		System.out.print("**********");
		System.out.print("++++++++++" + '\n');
		
//		부호연산자
		short num7 = 7;
		short num8 = (short)(+num7); // +,-가 붙으면 연산이 되어버려서 int로 바뀜
		short num9 = (short)(-num7); // 그래서 명시적 형 변환을 시켜줘야됨
		System.out.println(num8);
		System.out.println(num9);
		
//      증가 감소 연산자
		int num10 = 7; // 전위연산(연산을 먼저 하고 출력)
		System.out.println(++num10); // num10의 값 하나 증가 후 출력
		System.out.println(++num10); // num10의 값 하나 증가 후 출력
		System.out.println(num10); // 9가 나온다.
	    int num11 = 5; // 후위연산(출력 후에 연산이 된다.)
	    System.out.print((num11++) + " ");
	    System.out.print((num11++) + " ");
	    System.out.print(num11 + "\n");
	    System.out.print((num11--) + " ");
	    System.out.print((num11--) + " ");
	    System.out.println(num11);
	}

}
