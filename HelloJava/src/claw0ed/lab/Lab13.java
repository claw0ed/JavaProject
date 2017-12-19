package claw0ed.lab;

public class Lab13 {

	public static void main(String[] args) {
		// 37, 38, 39
		
		// 37
		Person 혜교 = new Person();
		System.out.println(혜교);
		
//		String name = "혜교";
//		String addr = "서울";
//		String telno = "123-4567";
//		System.out.printf("%s %s %s \n", name, addr, telno);
		
		Person 지현 = new Person("지현", "인천", "987-6543");
		System.out.println(지현);
		
		Customer cm = new Customer();
		System.out.println(cm);
		
		// 38
		Book bk = new Book();
		System.out.println(bk);
		
		Magazine mz = new Magazine();
		System.out.println(mz);
		
		// 39
		Phone ph = new Phone();
		System.out.println(ph);
		
		SmartPhone sp = new SmartPhone();
		System.out.println(sp);
		System.out.println(sp.toString());
	}

}

// Person : 이름, 주소, 전화번호 - V0 클래스
class Person {
	// 맴버변수
	private String name;  // 이름
	private String addr;  // 주소
	private String telno; // 전화번호
	
	// 생성자
	public Person() {
		this("혜교", "서울", "123-4567");
	}

	public Person(String name, String addr, String telno) {
		this.name = name;
		this.addr = addr;
		this.telno = telno;
	}

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String gettelno() {
		return telno;
	}

	public void settelno(String telno) {
		this.telno = telno;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", telno=" + telno + "]";
	}
	
}

class Customer {
	private int custno;  // 고객번호
	private int mileage; // 마일리지
	private String name;
	private String addr;
	private String telno;
	
	public Customer() {
		this(1, "혜교", "서울", "123-4567", 1000);
	}

	public Customer(int custno, String name, String addr, String telno, int mileage) {
		this.name = name;
		this.addr = addr;
		this.telno = telno;
		this.custno = custno;
		this.mileage = mileage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String gettelno() {
		return telno;
	}

	public void settelno(String telno) {
		this.telno = telno;
	}

	public int getcustno() {
		return custno;
	}

	public void setcustno(int custno) {
		this.custno = custno;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", addr=" + addr + ", telno=" + telno + ", custno="
				+ custno + ", mileage=" + mileage + "]";
	}
		
}

class Book {
	private String title;  // 제목
	private int pages;     // 페이지수
	private String author; // 저자
	
	public Book() {
		this("자바정석", 500, "남궁 성");
	}

	public Book(String title, int pages, String author) {
		this.title = title;
		this.pages = pages;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", pages=" + pages + ", author=" + author + "]";
	}
	
}

class Magazine {
	private String title;   // 제목
	private int pages;      // 페이지수
	private String author;  // 저자
	private String pubDate; // 발매일
	
	public Magazine() {
		this("자바정석", 500, "남궁 성","2017-12");
	}

	public Magazine(String title, int pages, String author, String pubDate) {
		this.title = title;
		this.pages = pages;
		this.author = author;
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	@Override
	public String toString() {
		return "Magazine [title=" + title + ", pages=" + pages + ", author=" + author + ", pubDate=" + pubDate + "]";
	}

}

class Phone {
	private String maker;
	private int price;
	private String type;
	
	public Phone() {
		this("엘지", 500000, "4G");
	}

	public Phone(String maker, int price, String type) {
		this.maker = maker;
		this.price = price;
		this.type = type;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + ", type=" + type + "]";
	}
	
}

class SmartPhone {
	private String maker;
	private int price;
	private String type;
	private String osVer;
	private String memorySize;   // 내부메모리크기
	private boolean isCarmera;   // 카메라장착여부
	private boolean isBluetooth; // 블루투스지원여부
	
	public SmartPhone() {
		this("엘지", 500000, "4G", "7.0", "32G", true, false);
	}

	public SmartPhone(String maker, int price, String type, String osVer, String memorySize, boolean isCarmera,
			boolean isBluetooth) {
		this.maker = maker;
		this.price = price;
		this.type = type;
		this.osVer = osVer;
		this.memorySize = memorySize;
		this.isCarmera = isCarmera;
		this.isBluetooth = isBluetooth;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOsVer() {
		return osVer;
	}

	public void setOsVer(String osVer) {
		this.osVer = osVer;
	}

	public String getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(String memorySize) {
		this.memorySize = memorySize;
	}

	public boolean isCarmera() {
		return isCarmera;
	}

	public void setCarmera(boolean isCarmera) {
		this.isCarmera = isCarmera;
	}

	public boolean isBluetooth() {
		return isBluetooth;
	}

	public void setBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}

	@Override
	public String toString() {
		return "SmartPhone [maker=" + maker + ", price=" + price + ", type=" + type + ", osVer=" + osVer
				+ ", memorySize=" + memorySize + ", isCarmera=" + isCarmera + ", isBluetooth=" + isBluetooth + "]";
	}
	
}
