import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

	public static void main(String[] args) {
	List<Integer> numList = new LinkedList<>();
	for(int i = 1; i <=10; i++) {
		numList.add(i);
	}
	int sum= 0;
	for(Integer num : numList) {
		sum = sum + num;
		System.out.println(sum);
	}
	List<String> strList = new LinkedList<>();
	strList.add("Spring");
	strList.add("Summer");
	strList.add("fall");
	strList.add("winter");
	int summ = 0;
	for(int i = 0; i < strList.size(); i++) {
		String str = strList.get(i);
		summ = summ + str.length();
		System.out.println(summ);
	}
	
	List<Double> douList = new LinkedList<>();
	douList.add(10.0);
	douList.add(20.0);
	douList.add(30.0);
	double width = 0;
	for(int i = 0; i < douList.size(); i++) {
		double dou = douList.get(i);
		width = douList.get(i) * douList.get(i) * Math.PI;
		System.out.println(width);
	}
	}
}