package com.nttdata.JavaLearning;

public class BookDTO {

	private String bookName;
	private String bookAuthor;
	private int amount;

	public BookDTO() {
		// TODO Auto-generated constructor stub
	}

	public BookDTO(String bookName, String bookAuthor, int amount) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.amount = amount;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BookDTO [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", amount=" + amount + "]";
	}

}
