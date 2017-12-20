package claw0ed;

public class Overrides {

	public static void main(String[] args) {
		// 메서드 오버라이드
		

	}

}

class SungJuk2 {
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;
	
	public int getTotal() { // 총점
		return kor + eng + mat;
	}
	
	public double getAverage() {
		double avg = ((double) kor + eng + mat) / 3;
		return avg;
	}
	
	public char getGrade() {
		double avg = ((double) kor + eng + mat) / 3;
		char grd = '가';
		switch((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		}
		
		return grd;
	}
	
}

class MidSungJuk2 extends SungJuk2 {
	protected int sci;
	protected int art;
	
	@Override
	public int getTotal() {
		int tot = super.getTotal() + sci + art; // super.getTotal() super는 부모클래스 메서드 이용
//		return kor + eng + mat + sci + art;
		return tot;
	}
	
	@Override
	public double getAverage() {
		double avg = (double) getTotal() / 5;
//		double avg = (double) (kor + eng + mat + sci + art) / 5;
		return avg;
	}
	
	@Override
	public char getGrade() {
		int avg = (int) getTotal() / 10;
//		double avg = ((double) kor + eng + mat + sci + art) / 5;
		char grd = '가';
		switch(avg) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		}
		
		return grd;
	}
	
}
