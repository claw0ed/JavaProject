package project.v1b;

public class BookV0 {
	String  number;
	private String title;   // 제목
	String publisher;                       // 출판사
	int    price;  
	
//	private int pages;      // 페이지수
//	private String author;  // 저자
//	private String pubDate; // 발매일
//	String book;                            // 도서이름
	
	public BookV0() {
		// TODO Auto-generated constructor stub
	}

	public BookV0(String number, String title, String publisher, int price) {
		super();
		this.number = number;
		this.title = title;
		this.publisher = publisher;
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookV0 [number=" + number + ", title=" + title + ", publisher=" + publisher + ", price=" + price + "]";
	}
	
}
