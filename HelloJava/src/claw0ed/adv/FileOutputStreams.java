package claw0ed.adv;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileOutputStreams {

	public static void main(String[] args) {
		// 바이트기반 스트림 - 파일쓰기
		// 객체를 바이트기반 스트림으로 파일에 저장
		// 즉, 클래스에 대한 객체를 직렬화해서 파일에 저장함

		Users u = new Users("zzyzzy", "123456", "혜교", 29);
		
		String fpath = "c:/Java/data01.txt";
		try(
			FileOutputStream fos = new FileOutputStream(fpath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
			oos.writeObject(u); // 직렬화로 객체를 파일에 저장
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

class Users {
	String userid;
	String passwd;
	String name;
	int age;
	
	public Users() {
	}

	public Users(String userid, String passwd, String name, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}
	
	
}