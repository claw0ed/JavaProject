package claw0ed;

public class Statements2 {

	public static void main(String[] args) {
		
		System.out.println("오늘 너무 추워요!!");
		System.out.println("오늘 너무 추워요!!");
		System.out.println("오늘 너무 추워요!!");
		System.out.println("오늘 너무 추워요!!");
		System.out.println("오늘 너무 추워요!!");

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		// 단순 무싯하게 복붙 코드로 반복작업을
		// 수행하는 것은 유지보수 측면으로 볼때
		// 좋은 방법이 아님
		
		
		// 반복문
		// for - 지정한 횟수만큼 어떤 작업을 반복
		for(int i = 1; i <= 5; i = i + 1) {
			System.out.println("오늘 너무 추워요!!");
		}

		for(int i = 1; i <= 5; i += 1) {
			System.out.println("오늘 너무 추워요!!");
		}
		
		for(int i = 1; i <= 5; ++i) {
			System.out.println("오늘 너무 추워요!!");
		}
		
		for (int i = 1; i <= 5; ++i) {
			System.out.println(i);
		}

		// 1 - 100 까지 숫자 출력
		for (int i = 1; i <= 100; ++i) {
			System.out.println(i);
		}
		
		// 1- 100 까지 홀수 출력
		for (int i = 1; i <= 100; i = i + 2) {
			if (i % 2 != 0) System.out.println(i);
		}
		
		// 1- 100 까지 짝수 출력
		for (int i = 2; i <= 100; i += 2) {
			if (i % 2 == 0) System.out.println(i);
		}
		
		// 구구단
		// 5 x 1 = 5
		// 5 x 2 = 10
		
		String fmt = "%d x %d = %d \n";
		for(int i = 1,  j = 4; i <= 9; ++i)
			System.out.printf(fmt, j, i, j * i);
		
		// 예제 4-15
		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("-----------------------------------------------------");
		
		for(int i=1; i<=10;i++)
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d\n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
	
		// 중첩 for문
		// **********
		// **********
		// **********
		// **********
		// **********

//		for (int i = 1; i <= 5; ++i) {
//			for (int j = 1, k = 1; j <= 10; ++j) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
			
		// 직각 삼각형 그리기
		// *
		// **
//		for (int i = 1; i <= 5; ++i) {
//			for (int j = 1; j <= i; ++j) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
		// 
		for (int i = 1; i <= 5; ++i) {
			for (int j = 5; j >= i; j-= 1) {
			//for (int j = 1; j <= (6 - i); ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
