package test.bookmanager;

public class Book {

	String title;
	String id;
	String author;
	String description;
	String tags;
	int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String title, String id, String author, String description, String tags, int price) {
		super();
		this.title = title;
		this.id = id;
		this.author = author;
		this.description = description;
		this.tags = tags;
		this.price = price;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
	
}
