package claw0ed;

import java.io.FileNotFoundException;
import java.io.FileReader;

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
		int x = 1000 / 0;
		} catch(Exception ex) {
			System.out.println("0으로 나눌 수 없습니다");
			System.out.println(ex.getMessage()); // 오류 관련정보
			//ex.printStackTrace();
		}
		
		// checked 예외
		
		String fpath = "c:/Java/abc.dat";
		try {
			FileReader fr = new FileReader(fpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("이글이 보이나요?");
	}

}
