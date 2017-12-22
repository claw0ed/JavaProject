package claw0ed.adv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.v1.SungJukV0;

public class ArrayLists {

	@SuppressWarnings("unchecked") // 워닝띄우지 마
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
		
		// 지내릭스 Generics
		// 컬렉션 프레임워크를 사용할때
		// 타입을 저장하지 않고 객채를 저장하면
		// 그것을 출력시 불필요한 형변환이 발생하는데
		// JDK5에서는 이것을 막고자 지네릭을 도입
		// 컬렉션을 선언할때 어떤 종류의 객체를 저장할지
		// 미리 결정해야하는데 그것을 <> 기호로 정의
		List cage1 = new ArrayList();
		cage1.add(new Tiger());
		cage1.add(new Zibra());
		cage1.add(new Lion());
		
		Tiger t = (Tiger) cage1.get(0);
		// Zibra z = (Tiger) cage1.get(1); // 안됨
		// Lion l = (Zibra) cage1.get(2);
		
		List<Tiger> cage2 = new ArrayList<Tiger>();
		cage2.add(new Tiger());
		t = cage2.get(0);
		// cage2.add(new Zibra()); // 다른 녀석들은 들어가지 않는다, Tiger만 들어감
		
		List<Zibra> cage3 = new ArrayList<>(); // JDK6부터는 <> 안넣고 줄여 쓸 수 있다
		List<Lion> cage4 = new ArrayList<>();
		
		// ArrayList의 CRUD
		// 추가 : add
		List<String> names = new ArrayList<>();
		names.add("혜교");
		names.add("지연");
		names.add("수지");
		
		// 조회 : get
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
//		System.out.println(names.get(2));
		System.out.println("for (int i = 0;i < names.size(); ++i)");
		for (int i = 0;i < names.size(); ++i) {
			System.out.println(names.get(i));
		}
		
		System.out.println("for(String val : names)");
		for(String val : names)
			System.out.println(val);
		
		// 검색 : indexOf(값)
		int pos = names.indexOf("수지");
		System.out.println("검색 : indexOf(값)");
		System.out.println("수지의 위치 " + pos);
		
		// 순환자를 이용해서 컬렉션의 모든 요소 출력
		// 컬렉션클래스로 선언된 요소를
		// 하나씩 읽어오기 위한 표준화된 방식을 제공 - 속도 느림 ㅠㅠ
		// hasNext : 컬렉션 요소가 존재하는지 여부 검사
		// next : 요소를 읽어 올수 있는지 여부 검사
		// List는 향상된 for문 사용하는게 좋다
		System.out.println("while(it.hasNext())");
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String val = it.next();
			System.out.println(val);
		}
		
		// 갯수 : size
		System.out.println("갯수 : size");
		System.out.println(names.size());
		
		// 삭제 : remove(위치)
		System.out.println("위치 : remove");
		System.out.println(names.get(0));
		names.set(0, "중기");
		System.out.println(names.get(0));
		
		// 모두 제거 : clear
		names.clear();
		System.out.println("모두 제거 : clear");
		System.out.println(names.size());
		
	}

}

class Tiger {}
class Zibra {}
class Lion {}
