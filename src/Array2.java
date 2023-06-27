// new 객체를 생성하면 초기화 = 기본값을 가진다.
// 기본 자료형 배열은 모든 요소 0으로 초기화
// 인스턴스 배열(참조변수 배열)은 모든 요소 null로 초기화
public class Array2 {
	//
	static int sumOfAry(int[] ar) {
		int sum = 0;
		for(int i = 0; i < ar.length; i++)
			sum += ar[i];
		return sum;
	}
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7}; // = new int[7]; ar[0] = 1....
		int sum = sumOfAry(ar);
		System.out.println(sum);
		
		// enhanced for문 = 배열 요소를 전체로 출력한다. 읽는건 가능하지만 쓰는건 안됨, summ: 15
		int[] arr = {1, 2, 3, 4, 5};
		for(int e: arr) {
			System.out.println(e + " ");
		}
		int summ = 0;
		for(int e: arr) {
			summ += e;
		}
		System.out.println("summ: " + summ); 
		
		// 2차원 배열
		int [][] arrr = new int [3][4]; // 1  2  3  4
		int num = 1;					// 5  6  7  8
		for(int i = 0; i < 3; i++) {	// 9 10 11 12 이렇게 나와야되는데 \t가 안먹음
			for(int j = 0; j < 4; j++) {
				arrr[i][j] = num;
				num++;
			}
		}
		for(int i = 0; i< 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(arrr[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 2차원 배열 2 
		int[][] arrrr = {
				{11},
				{22, 33},
				{44, 55, 66} // 원래 이렇게 나와야되는데 \t가 안먹음
		};
		for(int i = 0; i < arrrr.length; i++) {
			for(int j = 0; j < arrrr[i].length; j++) {
				System.out.println(arrrr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}