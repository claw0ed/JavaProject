package claw0ed.lab;

public class SungJukV0 {

	// V0 클래스 - value object 값만 저장하는 클래스
	// 값만 저장하는 특수한 클래스
	
	// 멤버변수 (private 으로 선언!)
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avrg;
	private String grd;
	
	
	// 생성자
	public SungJukV0() {
	}


	public SungJukV0(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}


	// setter getter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMat() {
		return mat;
	}


	public void setMat(int tot) {
		this.tot = tot;
	}
	
	public int getTot() {
		return tot;
	}
	
	
	public void setTot(int tot) {
		this.tot = tot;
	}


	public double getAvrg() {
		return avrg;
	}


	public void setAvrg(double avrg) {
		this.avrg = avrg;
	}


	public String getGrd() {
		return grd;
	}


	public void setGrd(String grd) {
		this.grd = grd;
	}

	// toString
	@Override // 어노테이션 - 컴파일러한테 전달하는 메세지
	public String toString() {
		return "SungJukV0 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avrg="
				+ avrg + ", grd=" + grd + "]";
	}

}
