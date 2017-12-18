package claw0ed;

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
	}

}

class Animal { // 동물 클래스
	// 필드 (멤버변수)
	String name;
	int weight;
	String gender;
	String type;
	
	// 메서드
	void move() { System.out.println(name + "가 움직였다"); }
	void eat() { System.out.println(name + "가 먹이를 먹었다"); }
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
