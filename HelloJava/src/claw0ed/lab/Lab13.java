package claw0ed.lab;

public class Lab13 {

	public static void main(String[] args) {
		// 37, 38, 39
		
		// 37
		Person ps = new Person();
		ps.name = "이름";
		ps.addr = "주소";
		ps.mphone = "전화번호";
		System.out.printf("%s %s %s \n",ps.name, ps.addr, ps.mphone);
		
		Customer cm = new Customer("이름", "주소", "전화번호", "고객번호", "마일리지");
		System.out.println(cm.toString());
		
		// 38
		Book bk = new Book("제목", "페이지수", "저자");
		System.out.println(bk.toString());
		
		Magazine mz = new Magazine("제목", "페이지수", "저자", "발매일");
		System.out.println(mz.toString());
		
		// 39
		Phone ph = new Phone("제조사", 100, "통신타입");
		System.out.println(ph.toString());
		
		SmartPhone sp = new SmartPhone("제조사", 100, "통신타입", "운영체제버전", "내부메모리크기", true, false);
		System.out.println(sp.toString());
	}

}

class Person {
	String name;
	String addr;
	String mphone;
	
	public Person() {
	}

	public Person(String name, String addr, String mphone) {
		this.name = name;
		this.addr = addr;
		this.mphone = mphone;
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

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", mphone=" + mphone + "]";
	}
	
}

class Customer {
	String name;
	String addr;
	String mphone;
	String NumberOfCustomer; // 고객번호
	String mileage; // 마일리지
	
	public Customer() {
	}

	public Customer(String name, String addr, String mphone, String numberOfCustomer, String mileage) {
		this.name = name;
		this.addr = addr;
		this.mphone = mphone;
		NumberOfCustomer = numberOfCustomer;
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

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getNumberOfCustomer() {
		return NumberOfCustomer;
	}

	public void setNumberOfCustomer(String numberOfCustomer) {
		NumberOfCustomer = numberOfCustomer;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", addr=" + addr + ", mphone=" + mphone + ", NumberOfCustomer="
				+ NumberOfCustomer + ", mileage=" + mileage + "]";
	}
		
}

class Book {
	String book; // 제목
	String page; // 페이지수
	String name; // 저자
	
	public Book() {
	}

	public Book(String book, String page, String name) {
		this.book = book;
		this.page = page;
		this.name = name;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [book=" + book + ", page=" + page + ", name=" + name + "]";
	}
	
}

class Magazine {
	String book; // 제목
	String page; // 페이지수
	String name; // 저자
	String release; // 발매일
	
	public Magazine() {
	}

	public Magazine(String book, String page, String name, String release) {
		this.book = book;
		this.page = page;
		this.name = name;
		this.release = release;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	@Override
	public String toString() {
		return "Magazine [book=" + book + ", page=" + page + ", name=" + name + ", release=" + release + "]";
	}
	
}

class Phone {
	String 제조사;
	int 가격;
	String 통신타입;
	
	public Phone() {
	}

	public Phone(String 제조사, int 가격, String 통신타입) {
		this.제조사 = 제조사;
		this.가격 = 가격;
		this.통신타입 = 통신타입;
	}

	public String get제조사() {
		return 제조사;
	}

	public void set제조사(String 제조사) {
		this.제조사 = 제조사;
	}

	public int get가격() {
		return 가격;
	}

	public void set가격(int 가격) {
		this.가격 = 가격;
	}

	public String get통신타입() {
		return 통신타입;
	}

	public void set통신타입(String 통신타입) {
		this.통신타입 = 통신타입;
	}

	@Override
	public String toString() {
		return "Phone [제조사=" + 제조사 + ", 가격=" + 가격 + ", 통신타입=" + 통신타입 + "]";
	}
	
}

class SmartPhone {
	String 제조사;
	int 가격;
	String 통신타입;
	String 운영체제버전;
	String 내부메모리크기;
	boolean is카메라장착여부;
	boolean is블루투스지원여부;
	
	public SmartPhone() {
	}

	public SmartPhone(String 제조사, int 가격, String 통신타입, String 운영체제버전, String 내부메모리크기, boolean is카메라장착여부,
			boolean is블루투스지원여부) {
		this.제조사 = 제조사;
		this.가격 = 가격;
		this.통신타입 = 통신타입;
		this.운영체제버전 = 운영체제버전;
		this.내부메모리크기 = 내부메모리크기;
		this.is카메라장착여부 = is카메라장착여부;
		this.is블루투스지원여부 = is블루투스지원여부;
	}

	public String get제조사() {
		return 제조사;
	}

	public void set제조사(String 제조사) {
		this.제조사 = 제조사;
	}

	public int get가격() {
		return 가격;
	}

	public void set가격(int 가격) {
		this.가격 = 가격;
	}

	public String get통신타입() {
		return 통신타입;
	}

	public void set통신타입(String 통신타입) {
		this.통신타입 = 통신타입;
	}

	public String get운영체제버전() {
		return 운영체제버전;
	}

	public void set운영체제버전(String 운영체제버전) {
		this.운영체제버전 = 운영체제버전;
	}

	public String get내부메모리크기() {
		return 내부메모리크기;
	}

	public void set내부메모리크기(String 내부메모리크기) {
		this.내부메모리크기 = 내부메모리크기;
	}

	public boolean isIs카메라장착여부() {
		return is카메라장착여부;
	}

	public void setIs카메라장착여부(boolean is카메라장착여부) {
		this.is카메라장착여부 = is카메라장착여부;
	}

	public boolean isIs블루투스지원여부() {
		return is블루투스지원여부;
	}

	public void setIs블루투스지원여부(boolean is블루투스지원여부) {
		this.is블루투스지원여부 = is블루투스지원여부;
	}

	@Override
	public String toString() {
		return "SmartPhone [제조사=" + 제조사 + ", 가격=" + 가격 + ", 통신타입=" + 통신타입 + ", 운영체제버전=" + 운영체제버전 + ", 내부메모리크기="
				+ 내부메모리크기 + ", is카메라장착여부=" + is카메라장착여부 + ", is블루투스지원여부=" + is블루투스지원여부 + "]";
	}
	
}
