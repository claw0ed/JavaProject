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
		
		// int compareTo (String str)
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		
		System.out.println("int compareTo (String str)");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		// String concat(String str)
		String s6 = "Hello";
		String s7 = s6.concat("World");
		
		System.out.println("String concat(String str)");
		System.out.println(s6);
		System.out.println(s7);
		
		// boolean contains (CharSequence s)
		String s8 = "abcdefg";
		boolean b = s8.contains("bc");
		
		System.out.println("boolean contains (CharSequence s)");
		System.out.println(s8);
		System.out.println(b);
		
		// boolean endsWith (String suffix)
		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");
		
		System.out.println("boolean endsWith (String suffix)");
		System.out.println(b2);
		
		// boolean equals (Object obj)
		String s9 = "Hello";
		boolean b3 = s.equals("Hello");
		boolean b4 = s.equals("hello");
		
		System.out.println("boolean endsWith (String suffix)");
		System.out.println(s9);
		System.out.println(b3);
		System.out.println(b4);
		
		// boolean equals
	}

}
