package claw0ed;

import claw0ed.lab.SungJukV0;

public class classes {

	public static void main(String[] args) {
		// 클래스 - 객체를 만들기 위한 틀, 설계도
		Animal tiger = new Animal();
		tiger.name = "호돌이";
		tiger.weight = 100;
		tiger.type = "호랑이";
		tiger.gender = "남자";
		
		tiger.move();
		tiger.eat();
		
		System.out.println(tiger.name);
		System.out.println(tiger.weight);
		System.out.println(tiger.type);
		System.out.println(tiger.gender);
		
		// shark
		Animal shark = new Animal();
		shark.name = "상어가족";
		shark.weight = 225;
		shark.type = "상어";
		shark.gender = "여자";
		
		shark.move();
		shark.eat();
		
		System.out.println(shark.name);
		System.out.println(shark.weight);
		System.out.println(shark.type);
		System.out.println(shark.gender);
		
		// eagle
		Animal eagle = new Animal();
		eagle.name = "독순이";
		eagle.weight = 75;
		eagle.type = "독수리";
		eagle.gender = "여자";
		
		eagle.move();
		eagle.eat();
		
		System.out.println(eagle.name);
		System.out.println(eagle.weight);
		System.out.println(eagle.type);
		System.out.println(eagle.gender);
	
		Animal tiger2 = new Animal();
		System.out.println(tiger2.name);
		System.out.println(tiger2.gender);
		System.out.println(tiger2.weight);
		System.out.println(tiger2.type);
		
		Animal cat = new Animal();
		System.out.println(cat.name);
		System.out.println(cat.type);
		
		cat = new Animal("고순이", 25, "여자", "고양이");
		
		// 회원가입
		Member m = new Member();
		m.userid ="";
		m.name = "";
		
		m = new Member("zzyzzy", "987456", "혜교", "asd@asd.com", "2017-12-15");
		
		// SungJukV0 클래스를 이용하기
		SungJukV0 sj = new SungJukV0("혜교", 99, 98, 78);
		System.out.printf("%s %d %d %d", sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
		
	}

}

class Animal { // 동물 클래스
	// 필드 (멤버변수)
	String name;
	int weight;
	String gender;
	String type;
	
//	Animal() {
//		name = "호순이";
//		type = "호랑이";
//		gender = "여자";
//		weight = 45;
//	} // (매개변수parameter 없는)생성자
	
//	Animal(String name, int weight, String gender, String type) {
//		this.name = name;
//		this.weight = weight;
//		this.gender = gender;
//		this.type = type;
//	} // 매개변수 있는 생성자
	
	// 기본 생성자
	public Animal() {
		
	}
	
	// 매개변수가 있는 생성자
	public Animal(String name, int weight, String gender, String type) {
		this.name = name;
		this.weight = weight;
		this.gender = gender;
		this.type = type;
	}
	
	// 메서드
	void move() { System.out.println(name + "가 움직였다"); }
	void eat() { System.out.println(name + "가 먹이를 먹었다"); }

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

class Car {
	String name;
	int size;
	
	// 클래스는 클래스의 멤버변수오 선언가능
	Engin engin;
	Door door;
	Wheel wheel;
	
	
}
class Engin {}
class Door {}
class Wheel {}

class Member {
	String userid;
	String passwd;
	String name;
	String email;
	String regdata;
	
	// 기본생성자  - 매개 변수가 있으면 기본 생성자를 자동으로 생성해 주지 않음
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	// 매개변수가 있는 생성자
	public Member(String userid, String passwd, String name, String email, String regdata) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.regdata = regdata;
	}
	
	
	
}