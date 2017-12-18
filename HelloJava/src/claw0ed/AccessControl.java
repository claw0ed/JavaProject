package claw0ed;

public class AccessControl {

	public static void main(String[] args) {
		// default 접근 제한자 테스트
		// Animal 클래스는 default 접근 가능
		// 같은 패키지에 존재하는
		// AccessControl 클래스에서 접근 가능
		// 클래스에는 default, public 접근 제어만 부여 가능
		Animal lion;
		lion = new Animal();
		lion.name = "사자";
		
		// 맴버변수 접근제어 테스트
		defaultClass dc = new defaultClass();
		dc.name = "헤교";           // default
		dc.age = 29;               // protected
		dc.email = "abc@xyz.com";  // public
		// dc.regdate = "2017-12-15"; // private
		dc.setRegdate("2017-12-15");
		
		// System.out.println(dc.regdate);
		System.out.println(dc.getRegdate()); // getter
		
		// 객체의 생성값 확인 - 참조주소
		defaultClass dc1 = new defaultClass();
		System.out.println(dc1); // 메모리 주소
		
		dc1 = new defaultClass();
		System.out.println(dc1);
		
		dc1 = new defaultClass();
		System.out.println(dc1);
		
	}

}

class defaultClass {
	// 맴버변수에 적용된 접근제어
	String name; // default
	protected int age; // protected
	public String email; // public
	private String regdate; // private
	
	// private 으로 선언된 맴버변수를
	// 외부 클래스에서 접근하게 할려면
	// setter/getter 메서드를 사용
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	public String getRegdate() {
		return regdate;
	}
	
	
}