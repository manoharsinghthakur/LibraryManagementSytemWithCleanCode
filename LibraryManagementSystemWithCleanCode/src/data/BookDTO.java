package data;

public class BookDTO {
	private Integer bookId;
	private String bookName;
	private String catagory;
	private String autor;
	private Double price;

	public BookDTO(Integer bookId, String bookName, String catagory, String autor, Double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.catagory = catagory;
		this.autor = autor;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/*
	 * public String toString(){ return getBookName(); }
	 */
}
