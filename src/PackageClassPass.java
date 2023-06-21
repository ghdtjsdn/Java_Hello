class TV{ //LG 에서 만든 2017년형 32인치 TV
	String brand;
	int year;
	int inch;
	TV(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	void show(){
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}

class Song{
	String title;
	String artist;
	int year;
	String country;
	Song(){}
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}
public class PackageClassPass {
	public static void main(String[] args) {
		 TV myTV = new TV("LG", 2017, 32);
         myTV.show();
         
         Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
         song.show();
         song = new Song("Let it be", "비틀즈", 1963, "영국");
         song.show();
	}
}
