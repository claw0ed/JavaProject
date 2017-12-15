package claw0ed;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		/*
		 * 자바 기본 자료형 int : 정수 (byte, short, long) double : 실수 (float) char : 문자 String :
		 * 문자열
		 */

		// 변수 : 자료형 변수이름;
		int a; // 정수형 변수
		double b; // 실수형 변수
		char c; // 문자 변수 (1자)
		String d; // 문자열 변수

		// 상수 : final 자료형 변수이름;
		// 변경불가 자료를 저장할 목적으로 사용
		// 변수이름은 대문자로 작성!
		// 클래스, 상수는 대문자로 사용
		final int E;
		final double F;
		final char G;
		final String H;

		// 자바 예약어를 변수 이름으로 사용불가!
		// inf if;
		// double import;
		// char System; // 비추!
		// String String; // 비추!

		// 회원정보 (아이디,비밀번호,이름,나이)
		String userid; // id, uid, 아이디
		String passwd; // password, pwd
		String name;
		// String userid, passwd, name;
		// 동일한 자료형 변수들은 , 들로 구분해서 한번에 선언 가능 (비추 - 가독성 문제)

		// String userid="x", passwd="y", name="z";

		long age;
		// int age;

		// 리터럴 : 컴파일러가 이해할 수 있는 형식으로 작성된 데이터나 값
		// int jumin = 1234561234567; // int값 범의를 벗어남
		long jumin = 1234561234567L; // L은 대소문자 가능

		// 변수 초기화 : 변수에 값을 대입
		// 변수명 = 값;
		userid = "zzyzzy";
		passwd = "987654";
		name = "suji";
		age = 23;

		b = 123.456;

		// 점붙은 숫자는 무조건 더블로 인식
		float pi = 3.141592F; // F붙이면 float형 으로 처리

		c = '수'; // 문자 한자는 '' 문자열은 ""
		G = 's'; // 처음 값 초기화

		// 변수 vs 상수
		c = '우';
		// G = 'x'; // 초기화는 두번할 수 없다, 상수이므로 변경 불가

		// 선언과 초기화
		int i = 132;
		double j = 987.123;
		boolean k = true; // 논리형 변수
		k = false;
		// k = 123;
		// k = '가';

		// 변수, 상수 이름
		// 변수는 일반적으로 소문자
		// camel 표기법을 사용
		int juminCode;
		String sayHello;

		// 상수는 모두 대문자로 작성
		// 두 단어 이상인 경우
		// 각 단어는 _ 으로 이어 사용
		final double PI = 3.14;
		final int THIS_YEAR = 2017;
		final String USER_ID = "zzyzzy";

		// JDK7부터 도입된 자릿수 표시 : _
		jumin = 1234561234567L;
		jumin = 1_234_561_234_567L;

		// 문자와 숫자 간 변환
		char ch = 'A';
		System.out.println(ch); // A
		System.out.println((int) ch); // 65

		ch = 'a';
		System.out.println(ch); // a
		System.out.println((int) ch); // 97

		ch = '가';
		System.out.println(ch); // 가
		System.out.println((int) ch); // 44032

		ch = '1';
		System.out.println(ch); // 1
		System.out.println((int) ch); // 49

		ch = '─';
		System.out.println(ch); // ─
		System.out.println((int) ch); // 9472

		String chars = "abc";
		System.out.println(chars.charAt(0)); // a
		System.out.println((int) chars.charAt(0)); // 97

		System.out.println(chars.charAt(1)); // b
		System.out.println((int) chars.charAt(1)); // 98

		System.out.println(chars.charAt(2)); // c
		System.out.println((int) chars.charAt(2)); // 99

		// 특수문자 표현 - escape sequence
		System.out.println("가           나");
		System.out.println("가\t나"); // 댑문자
		System.out.println("가\n나"); // 줄바꿈문자
		System.out.println("가\"나"); // 큰 따음표 문자
		System.out.println("가\'나"); // 작은 따음표 문자
		System.out.println("가'''나"); // 작은 따음표 문자

		// 윈도우키 + R
		// cmd
		// chcp // 활성 코드 페이지: 949
		// chcp 65001
		// chcp // Active code page: 65001

		// 변수에 저장된 내용 출력해 보기
		System.out.println("아이디 : " + userid);
		System.out.println("비밀번호 : " + passwd);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + '\n');

		// + 가 들어가면 성능저하가 일어남
		System.out.println(
				"아이디 : " + userid + '\n' + "비밀번호 : " + passwd + '\n' + "이름 : " + name + '\n' + "나이 : " + age + '\n');

		// 서식화된 출력 - printf
		System.out.printf("아이디 : %s \n비밀번호 : %s \n이름 : %s \n나이 : %d \n\n", userid, passwd, name, age);

		String fmt = "아이디 : %s \n비밀번호 : %s \n이름 : %s \n나이 : %d\n\n";
		System.out.printf(fmt, userid, passwd, name, age);

		// double vs float : 오차범위 주의
		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0;

		System.out.println(avg1); // 98.666664
		System.out.println(avg2); // 98.66666666666667

		// 키보드로 데이터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		userid = sc.nextLine();
		System.out.print("비밀번호 : ");
		passwd = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = Long.parseLong(sc.nextLine());
		// age = Integer.parseInt(sc.nextLine());

		System.out.printf(fmt, userid, passwd, name, age);
	}

}
