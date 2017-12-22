package claw0ed.adv;

import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukV0;

public class ArrayLists {

	public static void main(String[] args) {
		// 배열
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		
		// 컬렉션 프레임워크
		// 동일한 자료형의 여러 객체의 묶음을 손쉽게 다루게 해줌
		// List : 순차구조, 순서있는 객체를 다룸, 중복허용
		// set 객체를 이용한 로또 생성기?
		List list = new ArrayList(); // java.util.List; java.util.ArrayList;
		list.add("혜교");
		list.add(94);
		list.add(123.456);
		list.add(true);
		list.add(new SungJukV0());
		
		for (int i = 0; i < 5; ++i) {
			System.out.println(list.get(i));
		}
		
		// ArrayList에 저장된 내용들은 Object형
		// 따라서, 그것을 get해서 각각의 변수에 저장하려 할때
		// 불필요한 형변환이 발생 - 성능저하 요인
		String name = (String) list.get(0);
		int val1 = (int) list.get(1);
		double val2 = (double) list.get(2);
		boolean val3 = (boolean) list.get(3);
		SungJukV0 sj = (SungJukV0) list.get(4);

	}

}
