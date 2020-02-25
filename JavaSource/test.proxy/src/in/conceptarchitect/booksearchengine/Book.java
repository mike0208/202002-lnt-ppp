package in.conceptarchitect.booksearchengine;

public class Book {
	String title;
	String author;
	String tags;
	
	public Book(String title, String author, String tags) {
		super();
		this.title = title;
		this.author = author;
		this.tags = tags;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", tags=" + tags + "]";
	}
	public Book() {
		super();
	}
}
