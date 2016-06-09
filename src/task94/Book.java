package task94;

public class Book {
	public Book(String nameBook, String author, int pages) {
		super();
		this.nameBook = nameBook;
		this.author = author;
		this.pages = pages;
	}
public void copY(){
	 
}
public void remove(){
	
}
	private String nameBook;
	private String author;
	private int pages;

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
