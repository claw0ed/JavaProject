package claw0ed.lab;

public class Lab14 {

	public static void main(String[] args) {
		// 연습문제 6-1, 6-2, 6-3, 6-4, 6-5, 6-8, 6-9
		
		// 연습문제 6-1
		SutdaCard sc = new SutdaCard();
		System.out.println(sc);
		
		// 연습문제 6-2
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}

}

class SutdaCard {
	private int num = 1; // 카드의 숫자 사이의 정수 .(1~10 )
	private boolean isKwang = true; // 광 이면 아니면 ( ) true, false
	
	public SutdaCard() {
		this(1, true);
	}

	public char[] info() {
		// TODO Auto-generated method stub
		return null;
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isKwang() {
		return isKwang;
	}

	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return "SutdaCard [num=" + num + ", isKwang=" + isKwang + "]";
	}
	
}