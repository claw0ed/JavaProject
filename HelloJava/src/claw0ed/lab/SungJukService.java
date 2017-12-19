package claw0ed.lab;

public class SungJukService {
	// getTotal
	public int getTotal(int kot, int eng, int mat) {
		return (kot + eng + mat);
	}
	
	// getAverage
	public double getAverage(int kot, int eng, int mat) {
		return (kot + eng + mat) / 3;
	}
	
	// getGrade
	public int getGrade() {
		return 0;
	}
}
