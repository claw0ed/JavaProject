package claw0ed.adv;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileInputStreams {

	public static void main(String[] args) {
		// 바이트기반 스트림
		// 파일에 저장된 내용을 역직렬화를 통해 다시 객체로 변환
		
		String fpath = "c:/Java/data01.txt";
		try(
			FileInputStream fis = new FileInputStream(fpath); // 스트림 파일만 만들어줌
			ObjectInputStream ois = new ObjectInputStream(fis); // 쓸려면 요거 있어야됨
			) {
			String name = (String)ois.readUTF(); // 직렬화로 문자형을 파일에서 읽어옴
			Users u = (Users)ois.readObject(); // 직렬화로 문자형을 파일에서 읽어옴
			int age = ois.readInt(); // 직렬화로 문자형을 파일에서 읽어옴
			
			System.out.println(name);
			System.out.println(u.userid);
			System.out.println(u.passwd);
			System.out.println(u.name);
			System.out.println(u.age);
			
			System.out.println(age);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
