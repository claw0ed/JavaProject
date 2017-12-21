package claw0ed;

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
		
		System.out.println("이글이 보이나요?");
	}

}
