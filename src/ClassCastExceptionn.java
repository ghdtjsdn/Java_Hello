class Board{}
class PBoard extends Board{}
public class ClassCastExceptionn {
	//ClassCastException
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1;
		
		System.out.println(".. intermediate location .. ");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1; // exception
	}
}
