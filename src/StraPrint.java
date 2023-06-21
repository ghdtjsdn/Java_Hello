class StarPrint{
		void printTriangle(int num) {
			for(int i = 1; i <= num; i++) {
				for(int j= 1; j<= i; j++) {
					System.out.print("*");
				} System.out.println();
			}
		}
	    void printReverseTriangle(int num) {
	    	for(int i = 1; i <= 5; i++) {
				for(int j= i; j<=num; j++) {
					System.out.print("*");
				} System.out.println();
			}
		}
	}
class GetSum{
	int num;
	void setNum(int num1) {
		num = num1;
	}
	int sum() {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

class Gugudan{
	void printGugu(int num) {
		for (int i = 1; i <= num; i++) {
			for(int j = 1; j <= 9; j++)
				System.out.println(i + " x " + j + " = " + (i * j));
		}
	}
}

class Grade{
	int kor, eng, math;
	void setGrade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	double getAvg() {
		return (kor + eng + math) / 3.0;
	}
	char getGrade() {
		char ch = '가';
		double avg = getAvg();
		if(avg >= 90) {
			ch = '수';
		}else if(avg >= 80) {
			ch = '우';
		}else if(avg >= 70) {
			ch = '미';
		}else if(avg >= 60) {
			ch = '양';
		}else{
			ch = '가';
		}
		return ch;
		}
	}
// 1. this는 객체가 생성되었을 때 자기 자신을 뜻함.
// 2. this(); 생성자: 다른 생성자에서 생성자 호출할 때는 this 생성자 호출
class BankAccount {
    int balance = 0;
    BankAccount(){
    	System.out.println("생성자 시작");
    } // 디폴트 생성자: 개발자가 안넣게 되면 컴파일러가 기본적으로 넣는다.
    // 생성자를 한개라도 개발자가 만들면 디폴트생성자를 컴파일러가 만들어주지 않는다.
    BankAccount(int balance){
    	this.balance = balance;
    	System.out.println("생성자 시작2");
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }  
}

public class StraPrint {
	public static void check(BankAccount acc) {
		acc.checkMyBalance();}
	public static void main(String[] args) {
		// null -> 참조형에만 넣을 수 있다, 아무것도 가리키지 않은 상태
		//         참조형에 null로 지정하게 되면 JVM으로 하여금 할당되었던 메모리를 회수하라는 의미
		BankAccount ref = new BankAccount();
		BankAccount ref2 = new BankAccount(2000);
	     ref.deposit(3000);
	     ref.withdraw(300);    
	     check(ref);
	     
		StarPrint strPrint = new StarPrint();
		strPrint.printTriangle(3);
		System.out.println();
		strPrint.printReverseTriangle(3);

	 GetSum getsum = new GetSum();
     int num;
     num = 100;
     getsum.setNum(num);
     num = getsum.sum();
     System.out.println(num);
     
     Gugudan gugudan = new Gugudan();
     gugudan.printGugu(1);
     gugudan.printGugu(2);
     
     Grade hong = new Grade();
     hong.setGrade(90, 75, 60);
     System.out.println(hong.getAvg());
     System.out.println(hong.getGrade());
     Grade jo = new Grade();
     jo.setGrade(70, 55, 40);
     System.out.println(jo.getAvg());
     System.out.println(jo.getGrade());
	}
}

