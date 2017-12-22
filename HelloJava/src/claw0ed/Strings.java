package claw0ed;

public class Strings {

	public static void main(String[] args) {
		// String 클래스 주요 메서드
		
		// String (String s)
		String s = "Hello";
		String n = "1234567890";
		char c1 = s.charAt(1);
		char c2 = n.charAt(6);
		
		System.out.println("String (String s)");
		System.out.println(c1);
		System.out.println(c2);
		
		// String (char[] value)
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c);
		
		System.out.println("String (char[] value)");
		System.out.println(s2);
		
		// String (StringBuffer buf)
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);
		
		System.out.println("String (StringBuffer buf)");
		System.out.println(sb);
		System.out.println(s3);
		
		// char charAt (int index)
		String s4 = "Hello";
		String n4 = "0123456";
		char c4 = s4.charAt(1);
		char c5 = n4.charAt(1);
		
		System.out.println("char charAt (int index)");
		System.out.println(c4);
		System.out.println(c5);
		
	}

}
