package claw0ed.adv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriters {

	public static void main(String[] args) throws IOException {
		// 파일입출력 - 문자기반 스트림
		// 파일 쓰기 테스트 - 키보드로 입력한 문자를 파일에 저장
		
		String fpath = "c:/Java/data.txt";
		// 입력받은 문자를 저장할 파일 위치 지정
		
//		FileWriter fw = new FileWriter(fpath);
		FileWriter fw = new FileWriter(fpath, true); // 이어서 저장
		// 스트림 생성  - 지정된 경로에 파일을 만들고
		// 입력한 문자를 파일로 저장할 수 있도록 데이터 통로 생성
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요 (종료는 q:)");
			String msg = sc.nextLine();
			
			if(msg.equals("q")) { // 입력한 문자가 "q:" 라면
				break; // while 문을 중지
				
			} else {
				fw.write(msg + "\r\n"); // 파일에 내용 저장
			}
		}

		fw.close();
		// 파일에 입력한 내용을 완전히 저장하려면 반드시 필요
		
		sc.close();
		
	}

}
