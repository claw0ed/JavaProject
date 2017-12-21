package claw0ed;

public class Interfaces {

	public static void main(String[] args) {
		// 인터페이스 - 객체화 불가 클래스
		// 인터페이스를 구현한 클래스를 통해 객체화 가능
		// ISungJukService isjsrv = new ISungJukService();
		SungJukServiceImpl sjsrv = new SungJukServiceImpl();
		
		sjsrv.geTotal();
		sjsrv.getAverage();
		sjsrv.getGrade();
		
		// 인터페이스 타입 변환 (업/다운 캐스팅)
		// 인터페이스의 참조변수로
		// 구현한 클래스의 객체를 할당할 수 있음
		ISungJukService sjsrv2 = new SungJukServiceImpl();
		
		
		// 추상 클래스 객체 생성가능?
		// 추상 메서드를 포함한 클래스를 의미 - 객체화 불가!
		// AbstractClass ac = new AbstractClass();
		// 추상 클래스의 객체화는 상속을 통해 가능!
		CompleteClass cc = new CompleteClass();
		
	}

}

interface ISungJukService {
	int TOT = 0; // 상수 (초기화 필요!), 인터페이스 변수가 아니라 상수라 초기화 필요
	double AVG = 0.0;
	
	abstract void geTotal(); // 추상 매서드라 abstract 사용하지 않아도 된다
	
	void getAverage(); // 추상 매서드
	
	void getGrade(); // 추상 매서드
	
}

class SungJukServiceImpl implements ISungJukService {

	@Override
	public void geTotal() {
		
	}

	@Override
	public void getAverage() {
		
	}

	@Override
	public void getGrade() {
		
	}

}

abstract class AbstractClass { // 추상 클래스
	
}

class CompleteClass extends AbstractClass {
	public CompleteClass() {
		
	}

}

class Unit {
	
}

interface Fightable {
	void move(int x, int y);
	void attack(Unit u);
	
} // 미완성된 메서드 포함

class Firebat implements Fightable {

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit u) {
		
	}
	
} // 완전한 메서드 포함

// 인터페이스를 구현 하는 중
// 인터페이스의 모든 추상 메서드를 구현할 필요가 없으면
// 추상 클래스로 만들면 된다!!
abstract class Medic implements Fightable {
	@Override
	public void move(int x, int y) {
		
	}
	
} // 일부 완전한 메서드 포함
