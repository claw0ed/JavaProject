package claw0ed;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exceptions2 {

	public static void main(String[] args) {
		// 예외처리2
		try {
			int[] intArray = { 9, 8, 7, 6, 5 };
			System.out.println(intArray[5]); // 배열 값이 없음
			
			int x = 1000 / 0;
			
			FileReader fr = new FileReader("");
			
			DriverManager.getConnection("");
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("잘못된 배열사용!");
		} catch (ArithmeticException ae) {
			System.out.println("잘못된 수식사용!");
		} catch (FileNotFoundException ffe) {
			System.out.println("파일경로를 제대로 설정하세요!");
		} catch (SQLException se) {
			System.out.println("데이터베이스 서버주소를 설정하세요!");
		}
	}

}
