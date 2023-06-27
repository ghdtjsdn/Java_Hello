//TV를 상속받은 ColorTV 클래스를 작성
class TVV {
   private int size;
   public TVV(int size) {
      this.size = size;
   }
   public int getSize() {
      return size;
   }
}
class ColorTV extends TVV {
   private int color;
   public ColorTV(int size, int color) {
      super(size);
      this.color = color;
   }
   public void printProperty() {
      System.out.println(super.getSize() + "인치 " + this.color + "컬러");
   }
}
class IPTV extends ColorTV {
   private String ip;
   public IPTV(String ip, int size, int color) {
      super(size, color);
      this.ip = ip;
   }
   public void printProperty() {
      System.out.print(this.ip + " 주소에 ");
      super.printProperty();
   }
}

public class InheritancePractice {
   public static void main(String[] args) {
      ColorTV myTV = new ColorTV(32, 1024);
      myTV.printProperty(); // 32인치 1024컬러

      IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048컬러
      iptv.printProperty();
   }
}