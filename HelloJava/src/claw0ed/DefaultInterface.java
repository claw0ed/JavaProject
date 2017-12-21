package claw0ed;

public class DefaultInterface {

	public static void main(String[] args) {
		// 

	}

}

interface A {
	void sayHello();
	
	// void sayHello(String msg);  // 추가된 추상 메소드
	
	default void sayHello(String msg) {}
	// default 메서드 - JDK8 부터 지원, default 메서드는 class X implements A에서 구현 하지 않아도 된다, JDK8 이하는 abstract를 사용
}

class X implements A {

	@Override
	public void sayHello() {
		
	}
	
}

class Y implements A {

	@Override
	public void sayHello() {
		
	}

	@Override
	public void sayHello(String msg) {
		
	}
	
}

// 업캐스팅  테스트 예제
interface Movable {
	void move();
}

class SportCar implements Movable {

	@Override // 부모 클래스 메소드를 재정의
	public void move() {
		
	}
	
	public void openRoof() {
		
	}
	
}
