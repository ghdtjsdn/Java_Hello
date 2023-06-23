// Static = 먼저(new 객체생성보다 먼저) 한 번 올려 공유(method area 에다)
// static 변수 = 공유변수 = class 변수 = 정적변수
class InstCnt{
	static int instNum = 0;
	InstCnt(){
		instNum++;
		System.out.println("인스턴트 생성: " + instNum);
	}
}
public class ClassVariable {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();

	}

}
