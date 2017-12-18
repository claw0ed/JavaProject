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

		Books bk = new Books();
		bk.internationalStandardBookNumber = "1";
		bk.book = "축구의 역사";
		bk.publisher = "굿스포츠";
		bk.price = 7000;
		
		Order od = new Order();
		od.numberOfCustomer = "1";
		od.bookNumber = "1";
		od.aSellingPrice = 7000;
		od.dateOfOrder = "2014-07-01";
		
		Student st = new Student();
		st.number = 201350050;
		st.name = "김태희";
		st.addr = "경기도 고양시";
		st.age = 25;
		st.bd = "1985.3.22";
		st.sj = "컴퓨터공학";
		st.pf = 504;
		st.ti = "목 2교시";
		
		Department dp = new Department();
		
		
		Subject sj = new Subject();
		
		
		Professor pf = new Professor();
		
		
	}

}

class Customer {
	String cno;
	String name;
	String jumin;
	String addr;
	String mphone;
}

class Books {
	String internationalStandardBookNumber; // 번호 ISBN
	String book;                            // 도서이름
	String publisher;                       // 출판사
	int    price;                           // 가격
}

class Order {
	String numberOfCustomer; // 고객번호
	String bookNumber;       // 도서번호
	int    aSellingPrice;    // 판매가격
	String dateOfOrder;      // 주문일자
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
}

class Department {
	String sj;
	String mphone;
	String addr;
}

class Subject {
	
}

class Professor {
	
}