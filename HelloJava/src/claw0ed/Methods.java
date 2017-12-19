package claw0ed;

public class Methods {

	public static void main(String[] args) {
		
		; // 빈 문장도 적법
		
		{ // 블럭 시작
			// 블럭내 선언하는 변수는 기본적으로 지역변수
			// 지역변수는 블럭 안에서만 유효
			// 해당 믈럭을 멋어나면 사용불가!
			// 변수의 유효범위 scope를 주의할 것!
			String name = "혜교";
			int kor = 89;
		} // 불럭 끝
		
		// name = "지현"; // 오류 발생!
		
		String name = "혜교";
		{
			// String name = "혜교";
			// 오류발생! 바깥 블럭에서 선언한 name이
			// 안쪽블럭까지 영향력을 미침
		}

		// 메서드
		// 어떤 기능을 하는 문장들을 블럭으로 정의하고
		// 그것에 이름을 붙인것
		// 가독성과 코드 재사용성을 높이기 위해 사용
		// 접근수정자 반환값 메서드 이름(매기변수목록) {
		// }
		
		int a = 3, b = 4;
		// int c = a + b;
		int c = add(a, b);
		
		a = 10; b = 15;
		c = add(a, b);
		
		a = 45; b = 78;
		c = add(a, b);
		
		// 클래스/인스턴스 변수
		System.out.println(Cars.count);
		
		Cars 스포츠카 = new Cars();
		스포츠카.name = "페라리";
		스포츠카.type = "스포츠";
//		++스포츠카.count;
		System.out.println(++스포츠카.count);
		System.out.println(++Cars.count);
		스포츠카.printCarinfo();
		스포츠카.showCount();
		// 스포츠카.showName();
		
		Cars 트럭 = new Cars();
		++트럭.count;
		System.out.println(트럭.count);
		System.out.println(Cars.count);
		트럭.printCarinfo();
		
	} // main
	// 윗쪽 블럭에서 선언한 name변수의 유효범위는
	// 해당 블럭내 이므로 블럭 바깥에 선언한 변수와
	// 겹치지 않음
	String name = "혜교";
	
	public static int add(int a, int b) {
		int result = a + b;
		
		// System.out.println(a + b);
		return a + b;
	}
	
}

class Cars {
	String name; // 인스턴스 변수 명사만
	String type;
	static int count; // 클래스 변수
	
	public void printCarinfo() { // 동사 명사 붙어서 관례
		System.out.println(name + " / " + count);
	}
	
	public static void showCount() { // 동사 명사 붙어서 관례
		int count1 = 1;
		System.out.println(count);
		System.out.println(count1);
	}
	
	public static void showName() { // 동사 명사 붙어서 관례
		// 멤버변수 name을 출력하기 위해
		// showName 메서드 작성
		// 하지만 showName 메서드는
		// static 이므로 멤버변수 사용불가
		// System.out.println(name);
	}
	
}

// 값만 저장하는 클래스 - V0
// 서비스만 저장하는 클래스  - Service

// SungJukService

// MemberV0
// MemberService
