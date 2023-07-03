import java.util.ArrayList;
import java.util.List;
// Set, List, Queue, Map = 셋리큐맵
public class ArrayListFramework {

	public static void main(String[] args) {
		// ArrayList<E> 클래스
		List<String> list = new ArrayList<>();
		// 컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		// 저장된 문자열 인스턴스의 참조
		for (int i = 0; i < list.size(); i++) // for문으로 하는 방법
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		for (String str : list) { // enhenced for문으로 하는 방법
			System.out.print(str + '\t');
		}
		System.out.println();
		// 첫 번째 인스턴스 삭제
		list.remove(0);
		// 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}
}
