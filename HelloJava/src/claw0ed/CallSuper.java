package claw0ed;

public class CallSuper {

	public static void main(String[] args) {
		// 부모 클래스 생성자 호출하기 - super()
		// 부모 클래스의 메서드 호출하기 - super.메서드이름
		// 자식 클래스의 생성자을 호출하면
		// 먼저 부모 클래스의 생성자를 호출하고
		// 그 다음 자식 클래스의 그것을 호출한다
		Child c = new Child();
		
		Child2 c2 = new Child2();
		
	}

}

class Parent {
	protected String name;
	
	public Parent() {
		System.out.println("Parent의 생성자");
	}
	
	public String sayName() {
		return name;
	}
	
}

class Child extends Parent {
	protected String name;
	
	public Child() {
		// super(); // 컴파일러가 자동으로 추가해줌, 숨겨져 있음, 무조건 첫번째 줄에 있어야 함
		super.name = "1"; // Parent의 name
		this.name = "2";  // Child의 name
		super.sayName();
		
		System.out.println("Child의 생성자");
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}

class Parent2 {
	protected String name;
	
	public Parent2(String name) {
		System.out.println("Parent2() " + name);
	}
	
}

class Child2 extends Parent2 {
	public Child2() {
		super("혜교");
	}
	
}
