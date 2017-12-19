package claw0ed.lab;

public class SungJukService { // 서비스 클래스의 메소드는  private 선언
	private int tot = 0;
	private double avg = 0.0;
	private String grd = "가";
	
	// getTotal
	public int getTotal(int kot, int eng, int mat) {
//		return (kot + eng + mat);
		tot = kot + eng + mat;
		return tot;
	}
	
	// 객체지향 특성 중 다형성
	public int getTotal(SungJukV0 sj) {
		tot = sj.getKor() + sj.getEng() + sj.getMat();
		return tot;
	}
	
	// 또 다른 유형의 getTotal
	public void getTotal() {
		
	}
	
	// getAverage
//	public double getAverage(int kot, int eng, int mat) {
	public double getAverage() {
//		return (kot + eng + mat) / 3;
		avg = (double)tot / 3;
		return avg;
	}
	
	// getGrade
	public String getGrade() {
		switch((int)avg/10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
			grd = "우";
			break;
		case 7:
			grd = "미";
			break;
		case 6:
			grd = "양";
			break;
		}
		
		return grd;
	}
}
