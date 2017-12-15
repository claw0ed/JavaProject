package claw0ed.lab;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {
		// 프린트 문제 16 - 20
		
		// 16 a
//		int n = 1;
//		int k = 2;
//		int r = n;
//		
//		if(k<n) r = k;
//		
//		System.out.printf("#16 a r = %d \n", r); // 1
//		System.out.printf("#16 a k = %d \n", k); // 2
		
		// 16 b
//		int n = 1;
//		int k = 2;
//		int r;
//		
//		if (n < k) r = k;
//		else r = k + n;
//		
//		System.out.printf("#16 b r = %d \n", r); // 2
//		System.out.printf("#16 b k = %d \n", k); // 2

		// 16 c
//		int n = 1;
//		int k = 2;
//		int r = k;
//		
//		if (r < k) n = r;
//		else k = n;
//		
//		System.out.printf("#16 c n = %d \n", n); // 1
//		System.out.printf("#16 c r = %d \n", r); // 2
//		System.out.printf("#16 c k = %d \n", k); // 1
		
		// 16 d
//		int n = 1;
//		int k = 2;
//		int r = 3;
//		
//		if (r < n + k) r = 2 * n;
//		else k = 2 * r;
//		
//		System.out.printf("#16 d n = %d \n", n); // 1
//		System.out.printf("#16 d r = %d \n", r); // 3
//		System.out.printf("#16 d k = %d \n", k); // 6
		
		// 17 a
//		int x = 0;
//		int y = 0;
		// if (x && y == 0) { x = 1; y = 1;} // 안됨 고치면 x && y == ture
		
		// 17 b
//		int x = 0;
//		if (1 <= x <= 10) System.out.println(x); // 안됨 고치면 x >= 1 && <= 10
		
		// 18 a
//		int number = 2;
//		if (number % 2 == 0)
//		System.out.println(number + " is even."); // 2 is even.
//		System.out.println(number + " is odd.");  // 2 is odd.
		
//		int number = 35;
//		if (number % 2 == 0)
//		System.out.println(number + " 는 짝수.");  // 안나옴
//		System.out.println(number + " 는 홀수.");  // 35 는 홀수.
		
		// 18 b
//		int number = 2;
//		if (number % 2 == 0)
//		System.out.println(number + " is even."); // 2 is even.
//		else
//		System.out.println(number + " is odd.");  // 안나옴
		
		// 19 a 안나옴
//		int x = 3;
//		int y = 2;
//		int z;
//		
//		if (x > 2) {
//			if (y > 2) {
//				z = x + y;
//				System.out.println("z is " + z);
//			}
//		} else 
//			System.out.println("x is " + x);
		
		// 19 b z is 7
//		int x = 3;
//		int y = 4;
//		int z;
//		
//		if (x > 2) {
//			if (y > 2) {
//				z = x + y;
//				System.out.println("z is " + z);
//			}
//		} else 
//			System.out.println("x is " + x);
		
		// 19 c x is 2
//		int x = 2;
//		int y = 2;
//		int z;
//		
//		if (x > 2) {
//			if (y > 2) {
//				z = x + y;
//				System.out.println("z is " + z);
//			}
//		} else 
//			System.out.println("x is " + x);
		
		// 20 a Three
//		int a = 3;
//		if (a++ == 3)
//			System.out.println("Three");
//		else
//			System.out.println("Four");
		
		// 20 b Four
//		int a = 3;
//		if (++a == 3)
//			System.out.println("Three");
//		else
//			System.out.println("Four");
		
		// 20 c Three
//		int a = 3;
//		a = a++;
//		if (a == 3)
//			System.out.println("Three");
//		else
//			System.out.println("Four");

		// 20 d Four
//		int a = 3;
//		a = ++a;
//		if (a == 3)
//			System.out.println("Three");
//		else
//			System.out.println("Four");
		
		// #21
		// 결혼여부 isMarried = "Y", "N"
		// 결혼여부 isMarried = true, false
		// 결혼여부 isMarried = 0, 1
		Scanner sc = new Scanner(System.in);
		System.out.println("결혼여부를 입력하세요 (미혼:0, 기혼:1)");
		int isMarried = sc.nextInt();
		System.out.println("연봉을 입력하세요");
		int salary = sc.nextInt();
		int tax = 0;
		
		if (isMarried == 0) {
			if(salary < 3000) {tax = (int)(salary * 0.1); System.out.println("너의세금"); System.out.println(tax);}
			else {tax = (int)(salary * 0.25); System.out.println("너의세금"); System.out.println(tax);}
		} else if (isMarried == 1) {
			if(salary < 6000) {tax = (int)(salary * 0.1); System.out.println("너의세금"); System.out.println(tax);}
			else {tax = (int)(salary * 0.25); System.out.println("너의세금"); System.out.println(tax);}
		}
		
		System.out.println(isMarried);
		System.out.println(salary);
		System.out.println(tax);
		
	}

}
