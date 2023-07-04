import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedQuestion {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("정수(-1이 입력될 때까지)>>");
		while(true) {
			try {
				int num = sc.nextInt();
			if(num == -1)
				break;
			list.add(num);		
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
				sc = new Scanner(System.in);
				continue;
			}
		}
		int max = 0;
		for (int num : list) {
			if(num > max)
				max = num;
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		System.out.println(list);
	}
}