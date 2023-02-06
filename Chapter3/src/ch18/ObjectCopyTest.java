package ch18;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
	
		for(int i= 0; i<library.length; i++) {
			
			copyLibrary[i] = new Book();
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
	
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		

		for(Book book : library) {
			book.showBookInfo();
		}

		System.out.println("==============");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
	
	}

}
