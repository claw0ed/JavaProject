package claw0ed;

import java.io.FileReader;
import java.sql.DriverManager;

public class Exceptions2 {

	public static void main(String[] args) {
		// 예외처리2
		try {
			int[] intArray = { 9, 8, 7, 6, 5 };
			System.out.println(intArray[5]); // 배열 값이 없음
			
			int x = 1000 / 0;
			
			FileReader fr = new FileReader("");
			
			DriverManager.getConnection("");
		} catch (Exception ex) {
			System.out.println("시스템 오류 발생!");
		}
	}

}
