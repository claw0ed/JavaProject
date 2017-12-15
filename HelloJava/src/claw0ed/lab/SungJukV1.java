package claw0ed.lab;

import java.util.Scanner;

public class SungJukV1 {
	/*
	 * 성적 처리프로그램 V1
	 * 간단한 성적처리를 수행하는 프로그램 
	 * 입력 : 이름, 국어, 영어, 수학 
	 * 처리 : 총점, 평균, 학점 
	 * 출력 : 이름, 국어, 영어, 수학, 총점, 평균, 학점
	 */
	public static void main(String[] args) {
		// 회원정보 (아이디,비밀번호,이름,나이)
//		String 이름;
//		Long 국어;
//		Long 영어;
//		Long 수학;

		// 키보드로 데이터 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 : ");
//		이름 = sc.nextLine();
//		System.out.print("국어 : ");
//		국어 = Long.parseLong(sc.nextLine());
//		System.out.print("영어 : ");
//		영어 = Long.parseLong(sc.nextLine());
//		System.out.print("수학 : ");
//		수학 = Long.parseLong(sc.nextLine());
//		// age = Integer.parseInt(sc.nextLine());
//
//		String fmt = "아이디 : %s \n비밀번호 : %s \n이름 : %s \n나이 : %d\n\n";
//		System.out.printf(fmt, 이름, 국어, 영어, 수학);
		
		// 변수선언
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avrg;
		char grd;
		
		// 성적처리
		// 데이터 입력 - 입력 자료는 하드코딩
//		name = "혜교";
//		kor = 99;
//		eng = 98;
//		mat = 99;
		
		// 데이터 입력 - Scanner 사용
		System.out.println("성적 처리프로그램 V1");
		System.out.println("---------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("국어점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어점수를  입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		mat = sc.nextInt();
		
		// Scanner 객체 닫기
		sc.close();
		
		//총점, 평균, 학점계산
		tot = kor + eng + mat;
		// avrg = (kor + eng + mat) / 3;
		avrg =  (double) tot /3;
		grd = (avrg >= 90) ? '수' :
			  (avrg >= 80) ? '우' :
		      (avrg >= 70) ? '미' :
			  (avrg >= 60) ? '양' : '가';
		
		// 결과출력
		String fmt = "이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d \n";
		fmt +=  "총점 : %d, 평균 : %.1f, 학점 : %s";
		
		System.out.printf(fmt, name, kor, eng, mat, tot, avrg, grd);
		
		// sc.next();
	}
}
