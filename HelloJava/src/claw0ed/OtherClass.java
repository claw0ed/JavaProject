package claw0ed;

// 사용하는 클래스 하나만 사용하는게 좋다
// import claw0ed.lab.*;
import claw0ed.lab.SungJukMain;
import claw0ed.lab.SungJukService;

public class OtherClass {

	public static void main(String[] args) {
		// 다른 클래스 사용하기
		// 같은 패키지 내 다른 클래스는 별다른 과정없이 바로 사용가능
		Overloads o = new Overloads();
		Overrides r = new Overrides();
		
		// 다른 패키지 클래스 사용하기
		// 해당 클래스가 존재하는 패키지 경로를 모두 기술해야만 사용가능
		claw0ed.lab.SungJukV1 sj = new claw0ed.lab.SungJukV1();
		
		// 다른 패키지 클래스 사용하기
		// import문을 사용하면 편리하게 다른 패키지 상의
		// 클래스를 사용할 수 있음
		SungJukService sjsrv = new SungJukService();
		SungJukMain sjm = new SungJukMain();
		
	}

}
