package encapsulation;

public class Library {
public static void main(String[] args) {
	Book book1 = new Book();
//	book1.title = "Freedom";
//	book1.author = "John Smith";
//	book1.pages = 300;
	book1.setTitle("Freedom"); // <=== encapsulation
	System.out.println("Title: " + book1.getTitle());  // <=== encapsulation
	
	book1.setAuthor("Tom Ford");
	System.out.println("Author: " + book1.getAuthor());
	
	book1.setPages(355);
	System.out.println("Number of pages: " + book1.getPages());
}
}
