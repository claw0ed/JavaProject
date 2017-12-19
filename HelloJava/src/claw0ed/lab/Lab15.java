package claw0ed.lab;

public class Lab15 {

	public static void main(String[] args) {
		// 예제 7-1, 7-3, 연습문제 6-22, 6-23, 6-24
		// 예제 7-1
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
		
		// 예제 7-3
		
	}

}

class Tv {
	boolean power; // 전원상태 (on/off)
	int channel; // 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv {
	boolean caption; // 캡션상태 (on/off)
	void displayCaption(String text) {
		if (caption) { // 캡션 상태가  on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}