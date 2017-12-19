package claw0ed;

public class Inheritance {

	public static void main(String[] args) {
		// 클래스간상속관계가 형성되면
		// 각 클래스는 is-a 관계가 만들어진다
		// 자식 클래스의 객체는 부모 클래스의 타입으로 처리 가능
		Tiger t = new Tiger();
		Animals t2 = new Tiger();
		Animals e  = new Engle();
		Animals g  = new Goldfish();
	}

}

class Animals {
	protected String eye; // 상속 관계에서는 protected 사용 (그래야 상속관계에서 사용할 수 있음)
	protected String mouth;
	protected String hp;
	
	public void eat() {
		
	}
	
	public void sleep() {
		
	}
}

class Tiger extends Animals{
	protected String leg;
	
	public void run() {
		
	}
}

class Engle extends Animals{
	protected String wing;
	
	public void fly() {
		
	}
}

class Goldfish extends Animals{
	protected String fin;
	
	public void swim() {
		
	}
}