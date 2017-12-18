package claw0ed.lab;

public class Lab11 {

	public static void main(String[] args) {
		// 프린트 31, 32, 35

		// 31
//		System.out.println("카드번호를 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		String card = sc.nextLine();
//		sc.close();
//		
//		char card4 = card.charAt(4);
//		char card5 = card.charAt(5);
//
//		String card45 = "" + card4 + card5;
//
//		
//		switch(card.charAt(0)) {
//		case '3': 
//			if(card.charAt(1) == '5') {
//				System.out.print("JCB ");
//				if(card45.equals("01")) {
//					System.out.println("신한카드 입니다");
//				}
//				if(card45.equals("12")) {
//					System.out.println("KB국민카드 입니다");
//				}
//				if(card45.equals("17")) {
//					System.out.println("NH농협카드 입니다");
//				}
//			}
//			break;
//		case '4': 
//			System.out.print("비자 "); 
//			if(card45.equals("25")) {
//				System.out.println("비씨카드 입니다");
//			}
//			if(card45.equals("73")) {
//				System.out.println("국민은행 입니다");
//			}
//			if(card45.equals("76")) {
//				System.out.println("신한카드 입니다");
//			}
//			break;
//		case '5': 
//			System.out.print("마스터카드, Maestro ");
//			if(card45.equals("26")) {
//				System.out.println("국민은행 입니다");
//			}
//			if(card45.equals("53")) {
//				System.out.println("외한카드 입니다");
//			}
//			if(card45.equals("94")) {
//				System.out.println("신한카드 입니다");
//			}
//			break;
//		}
//		
//		System.out.println("조회를 종료합니다");
		
		// 32
		// a
//		System.out.println("주민번호를 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		String jumin = sc.nextLine();
		
		String jumin = "1234561234567"; 
		
		char[] num = new char[13]; // card.charAt(4);
		int[] intNum = new int[13];
		
		for (int i = 0; i < 13; ++i) {
			num[i] = jumin.charAt(i);
			// intNum
			for (int j = 2; j <=9 ; ++j) {
				System.out.println(num[i]);
				
			}
		}
		
		System.out.println(jumin);
		System.out.println(jumin);
		System.out.println(jumin);
		System.out.println(jumin);
		System.out.println(jumin);
		
	}

}
