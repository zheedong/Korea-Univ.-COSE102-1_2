package exercise_1023;

public class Book {
	String title;
	String author;

	void show() {
		System.out.println(title + ":" + author);
	}

	public Book() {
		this("", "");
	}

	public Book(String title) {
		this(title, "작자미상");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
