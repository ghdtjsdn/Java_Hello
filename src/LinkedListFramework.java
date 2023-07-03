import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
// Set, List, Queue, Map = 셋리큐맵
class MyLinkedList{
	int num;
	MyLinkedList myLinkedList;
}
public class LinkedListFramework {

	public static void main(String[] args) {
		// LinkedList<E> 클래스
		MyLinkedList my1 = new MyLinkedList();
		my1.num = 10;
		MyLinkedList my2 = new MyLinkedList();
		my1.myLinkedList = my2;
		my1.num = 11;
		my1.myLinkedList = my2;
		my2.myLinkedList = new MyLinkedList();
		
		List<String> list = new LinkedList<>();
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
		
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(10);
		llist.add(20);
		llist.add(30);		
		int n;
		for(Iterator<Integer> itr = llist.iterator(); itr.hasNext();) {
			n = itr.next();
			System.out.print(n + "\t");
		}
		System.out.println();
	}
}
