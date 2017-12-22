package project.v2;

import java.util.Scanner;

import project.v1.SungJukV0;

public class SungJukMain {
	private static SungJukServiceImpl sjsrv; // 한번만 생성해서 사용, 어느 클래스 던지 호출 가능

	public static void main(String[] args) {
		sjsrv = new SungJukServiceImpl();
		
		while(true) {
			displayMenu();
			selectMenu();
		}
		
	}

	private static void selectMenu() {
		Scanner sc = new Scanner(System.in);
		// 입력한 문자를 아스키 코드로 변환해서 정수로 저장
		int smenu = sc.next().charAt(0);
		
		switch(smenu - 48) {
		case 1: newSungJuk();
		break;
		case 2: showSungJuk();
		break;
		case 3: showOneSungJuk();
		break;
		case 4: updateSungJuk();
		break;
		case 5: deleteSungJuk();
		break;
		case 0: exitSungJuk();
		break;
		}
		
	}

	private static void displayMenu() {
		// 메뉴출력
		StringBuffer menu = new StringBuffer();
		menu.append(" -= 성적 처리 프로그램 V2 =- \n")
		.append("------------------- \n")
		.append(" 1 : 새로운 성적 데이터 추가 \n")
		.append(" 2 : 전체 성적 데이터 조회 \n")
		.append(" 3 : 성적 데이터 상세 조회 \n")
		.append(" 4 : 성적 데이터 수정 \n")
		.append(" 5 : 성적 데이터 삭제 \n")
		.append(" 0 : 성적프로그램 종료 \n")
		.append("------------------- \n")
		.append("실행할 작업을 선택하세요 >> ");
		
		System.out.print(menu.toString());
	}

	private static void newSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n추가할  성적 데이터를 입력하세요")
		.append("\n데이터 입력순서는 이름/국어/영어/수학 입니다")
		.append("\n예) 수지 78 65 21")
		.append("\n>>");
		System.out.println(sb.toString());
		
		Scanner sc = new Scanner(System.in);
		SungJukV0 sj = new SungJukV0(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		
		sjsrv.addSungJuk(sj);
		
	}

	private static void showSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n -= 전체 데이터 출력 =- \n")
		.append( sjsrv.getSungJuk() )
		.append("\n\n");
		
		System.out.println(sb.toString());
		
	}

	private static void showOneSungJuk() {
		int no = 0;
		sjsrv.getSungJuk(no);
		
	}

	private static void updateSungJuk() {
		sjsrv.modifySungJuk(null, 0);
		
	}

	private static void deleteSungJuk() {
		sjsrv.removeSungJuk(0);
		
	}

	private static void exitSungJuk() {
		System.exit(0); // 프로그램 종료
		
	}
	
}
