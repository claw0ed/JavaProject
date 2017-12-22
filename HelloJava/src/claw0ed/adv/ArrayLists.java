package claw0ed.adv;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// 컬렉션 프레임워크
		// 동일한 자료형의 여러 객체의 묶음을 손쉽게 다루게 해줌
		// List : 순차구조, 순서있는 객체를 다룸, 중복허용
		// set 객체를 이용한 로또 생성기?
		List list = new ArrayList(); // java.util.List; java.util.ArrayList;
		list.add("혜교");
		list.add(94);
		list.add(123.456);
		list.add(true);
		
		for (int i = 0; i < 4; ++i) {
			System.out.println(list.get(i));
		}

	}

}
