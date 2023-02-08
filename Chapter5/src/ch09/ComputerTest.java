package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer deskTop = new DeskTop();
		deskTop.display();
		deskTop.turnOff();
		
		NoteBook myNoteBook = new MyNoteBook();
		myNoteBook.typing();

	}

}
