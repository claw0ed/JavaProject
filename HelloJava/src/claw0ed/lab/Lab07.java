package claw0ed.lab;

import java.io.IOException;
import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) throws IOException {
		// # 22 - 윤년 여부 확인
		// 현재 연도가 400으로 나누어 떨어지거나
		// 현재 연도가 4로 나눠 떨어지지만
		// 100으로는 나눠 떨어지지 않음
//		GregorianCalendar gc = new GregorianCalendar();
//		
//		String welcome = "윤년 확인할 연도를 입력하세요";
//		String fmt1 = "%d년은 윤년입니다 \n";
//		String fmt2 = "%d년은 윤년이 아닙니다 \n";
		
//		System.out.println(welcome);
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		// int year = 4004;
//		sc.close();
		
//		if (gc.isLeapYear(year)) System.out.printf(fmt1, year);
//		else System.out.printf(fmt2, year);
//		System.out.println(gc.isLeapYear(2000)); // true
//		System.out.println(gc.isLeapYear(1999)); // false
//		System.out.println(gc.isLeapYear(2017)); // false
		
		// 윤년 여부 확인
//		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) System.out.printf(fmt1, year);
//		else System.out.printf(fmt2, year);
		
		// 24
//		String fmt = "구구단을 입력하세요 \n";
//		
//		System.out.println(fmt);
//		Scanner sc = new Scanner(System.in);
//		int gugu = sc.nextInt();
		// 65 - 90 대문자 97 - 122 소문자
//		sc.close();
//
//		String fmt2 = "%d x %d = %d \n";
//		for(int i = 1,  j = gugu; i <= 9; ++i)
//			System.out.printf(fmt2, j, i, j * i);
		
		// 24
//		String fmt = "%2d x %2d = %3d \n";
//		String welcome = "출력할 구구단의 단을 입력하세요 (1-19)";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(welcome);
//		int dan = sc.nextInt();
//		// 65 - 90 대문자 97 - 122 소문자
//		sc.close();
//		
//		//fmt = "%d x %d = %d \t";
//		for(int i = 1,  j = dan; i <= 19; ++i)
//			System.out.printf(fmt, j, i, j * i);
		
		// (23), 25, (26), 27, 28, (29), 30
		
		// 25
//		String fmt;
//		Scanner sc = new Scanner(System.in);
//		fmt = sc.nextLine();
//		char ch = fmt.charAt(0);
//		if((int)ch < 97 || (int)ch > 122) {
//			System.out.println(fmt);
//			System.out.println("왜 잘못 입력했늬?");
//		} else {
//			int sum = ch - 32;
//			System.out.println((int)ch);
//			System.out.println((char)sum);
//		}
		
		// 27
//		int number = 0;
//		int sum = 0;
//		while (number < 20) {
//			number++;
//			sum += number;
//			if(sum >= 100) break;
//		}
//		
//		System.out.println(number); // 14
//		System.out.println(sum); // 105
		
		// 28
//		number = 0;
//		sum = 0;
//		while (number < 20) {
//			number++;
//			if(number == 10 || number == 11) continue;
//			sum += number;
//		}
//		
//		System.out.println(number); // 20
//		System.out.println(sum); // 189
		
		// 30
//		System.out.println(" \t  1 \t  2 \t  3 \t  4 \t  5 \t  6 \t  7 \t  8 \t  9");
//		System.out.println("---------------------------------------------------------------------------");
//		fmt ="%d |\t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \n";
//		
//		for(int i = 1; i < 10; i++)
//			System.out.printf(fmt, i, i, i*2, i*3, i*4, i*5, i*6, i*7, i*8, i*9);
//		
		// #25 - 문자와 숫자 변환
		// 소문자 a : 97, 대문자 A :65
//		System.out.println("소문자 알파벳을 대문자로 바꿔 드립니다");
//		System.out.println("소문자 알파벳을 하나 입력하세요");
//		int ch = System.in.read();
//		
//		// 소문자(a:97, z:122) 이와의
//		// 문자가 입력이 되면 경고메세지 출력
//		if (ch < 97 || ch > 122)
//			System.out.println("잘못입력하셨습니다!");
//		else {
//			// 소문자를 대문자로 변환하기 위해
//			// 입력한 묹자에서 32 만큼 빼고 처리
//			ch = ch - 32;
//			
//			System.out.println((char) ch);
//		}
		
		// #27
//		int number = 1;
//		int sum = 0;
//		
//		while (number < 20) {
//			number++;
//			sum += number;
//			if(sum >= 100) break;
//		}
//			
//		String fmt = "num : %d, sum : %d \n";
//		System.out.printf(fmt, number, sum); // 14, 105
		
		// #28
//		int number = 0;
//		int sum = 0;
//		while (number < 20) {
//			number++;
//			if(number == 10 || number == 11) continue;
//			sum += number;
//		}
//		
//		String fmt = "num : %d, sum : %d \n";
//		System.out.printf(fmt, number, sum); // 20, 189
		
		// #30
//		String table =  "\t   Multiplication Table \n";
//		table += "       1   2   3   4   5   6   7   8   9 \n";
//		table += "---------------------------------------- \n";
//		System.out.print(table);
//		String fmt = "%d |   %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d \n";
//		
//		for(int i = 1; i < 10; i++)
//			System.out.printf(fmt, i, i, i*2, i*3, i*4, i*5, i*6, i*7, i*8, i*9);
		
		// #30
//		String fmt =  "\t   Multiplication Table \n";
//		fmt += "       1   2   3   4   5   6   7   8   9 \n";
//		fmt += "---------------------------------------- \n";
//		
//		System.out.print(fmt);
//		for(int i = 1; i <= 9; ++i) {
//			fmt = "%d |   %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d \n";
//			System.out.printf(fmt, i, i, i*2, i*3, i*4, i*5, i*6, i*7, i*8, i*9);
//			
//		
//		}
		
		// #30
//		String fmt =  "\t   Multiplication Table \n";
//		fmt += "       1   2   3   4   5   6   7   8   9 \n";
//		fmt += "---------------------------------------- \n";
//				
//		System.out.print(fmt);
//		for(int i = 1; i <= 9; ++i) {
//			System.out.printf("%d |   %2d", i, i);
//			for(int j = 2; j <= 9; ++j) {
//				System.out.printf("  %2d", i * j);
//			}
//			System.out.println();
//			
//		}
		
		// 23	
//		String lotto ="657";
//		double lucky = Math.random() * 1000;
//		String st = Integer.toString((int)lucky);
//		
//		st.charAt(0);
//		st.charAt(1);
//		st.charAt(2);
//		
//		for (int i = 0; i <=2; i++) {
//			for (int j = 0; j <=2; j++) {
//				st.charAt(i) && lotto.charAt(j);
//			}
//			
//		}
//
//		System.out.println(st);
//		System.out.println(st.charAt(0));
//		System.out.println(st.charAt(1));
//		System.out.println(st.charAt(2));
		
		// #23 - 복권 발생 프로그램
		// 특정범위를 포함하는 난수 생성
		// 정수난수값 % ((마지막값 - 시작값) + 1) + 시작값
		// 복권 숫자 범위 : 100 - 199
		// lotto : 657, lucky : 452 = 1개 일치
		// lotto : 657, lucky : 524 = 1개 일치
		// lotto : 657, lucky : 123 = 0개 일치
		// lotto : 657, lucky : 726 = 2개 일치
		
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random() * 100000);
		int lotto = rand % ((999 - 100) + 1) + 100;
		System.out.println(lotto);

		String lucky = sc.nextLine();
		sc.close();
		
		// 문자 하나씩 추출
//		char lucky1 = lucky.charAt(0);
//		char lucky2 = lucky.charAt(1);
//		char lucky3 = lucky.charAt(2);
//		
//		char lotto1 = ("" + lotto).charAt(0); // "" + 문자로 바꾸는 쉬운방법
//		char lotto2 = ("" + lotto).charAt(1);
//		char lotto3 = ("" + lotto).charAt(2);
		
		// 비교
		int match = 0;
//		if (lotto1 == lucky1
//			|| lotto1 == lucky2
//			|| lotto1 == lucky3)
//			++ match;
//		if (lotto2 == lucky1
//			|| lotto2 == lucky2
//			|| lotto2 == lucky3)
//			++ match;
//		if (lotto3 == lucky1
//			|| lotto3 == lucky2
//			|| lotto3 == lucky3)
//			++ match;
		
		String lotto4 = ""+lotto;
		int size = lotto4.length();
		
		for(int i = 0; i < size; ++i)
			for(int j = 0; j < size; ++j)
			if (lucky.charAt(i) == lotto4.charAt(j))
				++ match;
				
		
		String msg = "꽝이군요! 다음 기회에!";
		switch(match) {
		case 3: msg = "모두 일치! 상금 1백만원!"; break;
		case 2: msg = "2개 일치! 상금 1만원!"; break;
		case 1: msg = "3개 일치! 상금 1천원!"; break;
		}
		
		System.out.println(msg);
		
	}

}
