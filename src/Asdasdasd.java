
public class Asdasdasd {

	public static void main(String[] args) {
		// equals() - 두 문자열이 동일한지 확인한다. 대소문자도 구분한다.
		String str1 = "Hong";
		String str2 = "Sun Woo";
		System.out.println(str1.equals(str2)); // false
		
		// indexOf() - 문자열에서 특정 문자가 시작되는 인덱스 위치를 알려준다.
		String str3 = "Hong Sun Woo";
		System.out.println(str3.indexOf("Woo")); // 9
		
		// length() - 문자열 길이의 개수를 알려준다.
		String str4 = "Hong Sun Woo";
		System.out.println(str4.length()); // 12
		
		// substring() - 지정된 인덱스 부분의 문자열을 알려준다.
		String str5 = "Hong Sun Woo";
		System.out.println(str5.substring(0,9)); // Hong Sun
		
		// toUpperCase()와 toLowerCase() - 문자열을 전부 대문자나 소문자로 변환할 때 사용
		String str6 = "Hong Sun Woo";
		System.out.println(str6.toUpperCase()); // HONG SUN WOO
		System.out.println(str6.toLowerCase()); // hong sun woo
		
		// concat() - 두 문자열을 합칠 때 사용
		String str7 = "Hong Sun Woo";
		String str8 = "Good Man";
		System.out.println(str7.concat(str8)); // Hong Sun WooGood Man
		
		// startsWith() - 첫 문자열이 같은지 확인
		String str9 = "Hong Sun Woo";
		System.out.println(str9.startsWith("Hong")); // true
		
		// replace - 특정 문자열을 다른 문자열로 변경할 때 사용
		String str10 = "Hong Sun Woo";
		System.out.println(str10.replace("Hong", "King")); // King Sun Woo
		
		// trim() - 첫 부분, 끝부분의 공백을 없애준다.
		String str11 = "     Hong Sun Woo     ";
		System.out.println(str11.trim()); // Hong Sun Woo
		
		// contains - 두 문자열 중 같은 문자가 포함되어있는지 확인
		String str12 = "Hong Sun Woo";
		String str13 = "W";
		System.out.println(str12.contains(str13)); // true
	}

}
