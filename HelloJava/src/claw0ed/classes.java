package claw0ed;

public class classes {

	public static void main(String[] args) {
		// 클래스 - 객체를 만들기 위한 틀, 설계도
		

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