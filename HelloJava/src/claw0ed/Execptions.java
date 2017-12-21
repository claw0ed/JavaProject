package claw0ed;

import java.io.FileReader;
import java.util.Scanner;

public class Execptions {

	public static void main(String[] args) {
		// 예외처리
		
		int[] intArray = { 9, 8, 7, 6, 5 };
		
		System.out.println(intArray[2]);

		try {
		System.out.println(intArray[5]); // 배열 값이 없음
		} catch(Exception ex) {
			System.out.println("오류발생!@");
			// System.out.println(ex.getMessage()); // 오류 관련정보
			// ex.printStackTrace();
		}
		
		try {
			// unchecked 예외 - 개발자가 직접 인지하고 예외 처리
			int x = 1000 / 0;
		} catch(Exception ex) {
			System.out.println("0으로 나눌 수 없습니다");
			System.out.println(ex.getMessage()); // 오류 관련정보
			//ex.printStackTrace();
		}
		
		// checked 예외 - 컴파일러가 미리 예외처리에 대한 정보를 알림
		String fpath = "c:/Java/abc.dat";
		try {
			FileReader fr = new FileReader(fpath);
		} catch(Exception ex) {
			System.out.println("파일관련 예외발생");
		}
		
		// 예외처리 좋은 예
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자만 입력하세요!");
			try {
				int key = sc.nextInt();
				if(key == 0) break;
			} catch(Exception ex) {
				System.out.println("문자는 입력불가!");
				// 무한반복 방지용 Scanner 초기화
				sc = new Scanner(System.in);
				// break;
			}
			
		}
		
		sc.close();
		
		System.out.println("이글이 보이나요?");
	}

}
