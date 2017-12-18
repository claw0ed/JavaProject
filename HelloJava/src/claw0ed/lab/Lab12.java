package claw0ed.lab;

public class Lab12 {

	public static void main(String[] args) {
		//  고객, 도서, 주문, 학생, 학과, 과목, 교수
		Customer c = new Customer();
		c.cno = "1";
		c.name = "박지성";
		c.jumin = "810101-1111111";
		c.addr = "영국 런던";
		c.mphone = "000-5000-0001";
		
		c = new Customer("2", "김연아", "900101-2000000", "한국 서울", "000-6000-0001");

		Books bk = new Books();
		bk.internationalStandardBookNumber = "1";
		bk.book = "축구의 역사";
		bk.publisher = "굿스포츠";
		bk.price = 7000;
		
		bk = new Books("2", "축구아는 여자", "나무수", 13000);
		
		Order od = new Order();
		od.numberOfCustomer = "1";
		od.bookNumber = "1";
		od.aSellingPrice = 7000;
		od.dateOfOrder = "2014-07-01";
		
		od = new Order("1", "1", 7000, "2014-07-03");
		
		Student st = new Student();
		st.number = 201350050;
		st.name = "김태희";
		st.addr = "경기도 고양시";
		st.age = 25;
		st.bd = "1985.3.22";
		st.sj = "컴퓨터공학";
		st.pf = 504;
		st.ti = "목 2교시";
		
		st = new Student(201250006, "송혜교", "서울 영등포구", 22, "1988.9.17", "컴퓨터공학", 301, "월 3교시");
		
		Department dp = new Department();
		dp.sj = "컴퓨터공학";
		dp.mphone = "123-4567-8901";
		dp.office = "E동 2층";
		dp.pf = 504;
		dp.theDateOfAppointment = "2007년"; // 임명일자
		
		dp = new Department("의상디자인", "234-5678-9012", "A동 1층", 301, "2009년");
		
		Subject sj = new Subject();
		sj.sjnm = 0205;
		sj.sj = "프로그래밍";
		sj.dc = "자바 프로그래밍";
		sj.pf = 301;
		
		sj = new Subject(0211, "드레스 코드", "옷 입기의 기초", 445);
		
		Professor pf = new Professor();
		pf.pfnm = 031;
		pf.name = "이순신";
		pf.ya = "프로그래밍";
		
		pf = new Professor(445, "정약용", "의상디자인");
		
		
	}	

}

class Customer {
	String cno;
	String name;
	String jumin;
	String addr;
	String mphone;
	
	Customer() {
		// TODO Auto-generated constructor stub
	}

	Customer(String cno, String name, String jumin, String addr, String mphone) {
		this.cno = cno;
		this.name = name;
		this.jumin = jumin;
		this.addr = addr;
		this.mphone = mphone;
	}
	
	
}

class Books {
	String internationalStandardBookNumber; // 번호 ISBN
	String book;                            // 도서이름
	String publisher;                       // 출판사
	int    price;                           // 가격
	
	Books() {
		// TODO Auto-generated constructor stub
	}

	Books(String internationalStandardBookNumber, String book, String publisher, int price) {
		this.internationalStandardBookNumber = internationalStandardBookNumber;
		this.book = book;
		this.publisher = publisher;
		this.price = price;
	}
	
	
}

class Order {
	String numberOfCustomer; // 고객번호
	String bookNumber;       // 도서번호
	int    aSellingPrice;    // 판매가격
	String dateOfOrder;      // 주문일자
	
	Order() {
		// TODO Auto-generated constructor stub
	}

	Order(String numberOfCustomer, String bookNumber, int aSellingPrice, String dateOfOrder) {
		this.numberOfCustomer = numberOfCustomer;
		this.bookNumber = bookNumber;
		this.aSellingPrice = aSellingPrice;
		this.dateOfOrder = dateOfOrder;
	}
	
	
}

class Student {
	int number;
	String name;
	String addr;
	int age;
	String bd;
	String sj;
	int pf;
	String ti;
	
	Student() {
		// TODO Auto-generated constructor stub
	}

	Student(int number, String name, String addr, int age, String bd, String sj, int pf, String ti) {
		this.number = number;
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.bd = bd;
		this.sj = sj;
		this.pf = pf;
		this.ti = ti;
	}
	
	
}

class Department {
	String sj;
	String mphone;
	String office;
	int pf;
	String theDateOfAppointment; // 임명일자
	
	Department() {
		// TODO Auto-generated constructor stub
	}

	Department(String sj, String mphone, String office, int pf, String theDateOfAppointment) {
		this.sj = sj;
		this.mphone = mphone;
		this.office = office;
		this.pf = pf;
		this.theDateOfAppointment = theDateOfAppointment;
	}
	 
	 
}

class Subject {
	int sjnm;
	String sj;
	String dc;
	int pf;
	
	Subject() {
		// TODO Auto-generated constructor stub
	}

	Subject(int sjnm, String sj, String dc, int pf) {
		this.sjnm = sjnm;
		this.sj = sj;
		this.dc = dc;
		this.pf = pf;
	}
	
	
}

class Professor {
	int pfnm;
	String name;
	String ya;
	
	Professor() {
		// TODO Auto-generated constructor stub
	}

	Professor(int pfnm, String name, String ya) {
		super();
		this.pfnm = pfnm;
		this.name = name;
		this.ya = ya;
	}
	
}