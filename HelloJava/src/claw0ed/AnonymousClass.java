package claw0ed;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

	public static void main(String[] args) {
		// 익명클래스 - 이름이 없는 클래스, 일회용 클래스, 이벤트 처리용
		// 자바스크립트 : function sayHello() {}
		//           function () {}
		
		// 익명 클래스 선언
		Object o = new Object();
		o = new Object() {}; // 클래스 정의 부분을 아얘 다 적어준다, 생성자가 없으니 () 써준다, 메서드가 하나만 존재해야 한다

		Button btn = new Button("OK");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭됨!");
				
			}
		});
	}

}
