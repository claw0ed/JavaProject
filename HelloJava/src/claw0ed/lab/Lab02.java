package claw0ed.lab;

public class Lab02 {
	public static void main(String[] args) {
		// 3
		/*
		 * int x = 1;
		 * int y = 2; 
		 * int z = 3; 
		 * int tot = 0;
		 * 
		 * tot = 3 * x; System.out.printf("3x = %d \n", tot); tot = 3 * x + y;
		 * System.out.printf("3x + y = %d \n", tot); tot = (x + y) / 7;
		 * System.out.printf("3x = %d \n", tot); tot = (3 * x + y) / (z + 2);
		 * System.out.printf("3x = %d \n", tot);
		 */

		// #03
		int x = 10;
		int y = 20;
		int z = 30;
		int result = 0;

		result = 3 * x; // 3x
		result = 3 * x + y; // 3x + y
		result = (x + y) / 7;
		result = (3 * x + y) / (z + 2);

		// 4
		/*
		 * double number = (1 / 3) * 3;
		 * System.out.printf("(1/3) * 3 = %f \n", number); // 0.000000
		 */

		// #04 정수끼리의 연산은 언제나 정수!
		System.out.printf("(1/3) * 3 = %f \n", (1 / 3D) * 3);
		System.out.printf("(1/3) * 3 = %f \n", ((double) 1 / 3) * 3);
		System.out.printf("(1/3) * 3 = %f \n", (1 / 3.0) * 3);

		// 5
		int quotient, remainder;
		quotient = 7 / 3;
		remainder = 7 % 3;
		System.out.printf("7 / 3 = %d \n", quotient); // 2
		System.out.printf("7 %% 3 = %d \n", remainder); // 1

		// 6
		// int result = 11;
		result /= 2;
		System.out.printf("result /= 2 = %d \n", result); // 5
		// r = r / 2;

		// 7 - 연산자 우선순위
		double x2 = 2.5;
		double y2 = -1.5;
		int m = 18;
		int n = 4;

		// a
		double total = 0;
		total = x2 + (double) n * y2 - (x2 + (double) n) * y2;
		System.out.printf("x + n * y - (x + n) * y = %f \n", total); // 6.250000

		// d
		// 1 - (1 - (1 - (1 - (1 - n))))

		// #8 - 논리 연산자의 단축평가

		// 특정일의 요일을 알아내는 수식
		System.out.println("(Year + (Year / 4) - (Year / 100) + (Year / 400) + (13 * Month + 8) / 5 + Day) % 7 \n");
		System.out.print((1988 + (1988 / 4) - (1988 / 100) + (1988 / 400) + (13 * 5 + 8) / 5 + 13) % 7);
		
		// #13 : 증가 감소 연산자
		int p = 3;
		p++; // 단독 사용시 ++p 나 p++ 같다, + p, p = p + 1
		System.out.printf("\np == %d \n", + p);
		System.out.printf("p == %d \n", + p++);
		System.out.printf("p == %d \n", + p);
		
		p = 3;
		p--;
		System.out.printf("p == %d \n", + p);
		
		// #14
		System.out.println("2 + 2 = " + (2 + 2));
		
	}
}
