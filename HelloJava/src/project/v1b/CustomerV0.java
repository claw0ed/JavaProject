package project.v1b;

public class CustomerV0 {
	private int custno;  // 고객번호
	private String name;
	String jumin;
	private String addr;
	String mphone;
	
//	private int mileage; // 마일리지
//	String cno;
//	String name;
//	String addr;
//	private String telno;
	
	public CustomerV0() {
	}

	public CustomerV0(int custno, String name, String jumin, String addr, String mphone) {
		this.custno = custno;
		this.name = name;
		this.jumin = jumin;
		this.addr = addr;
		this.mphone = mphone;
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	@Override
	public String toString() {
		String fmt = "CustomerV0 [custno=%d, name=%s, jumin=%s, addr=%s, mphone=%s]";
		return String.format(fmt, custno, name, jumin, addr, mphone);
//		return "CustomerV0 [custno=" + custno + ", name=" + name + ", jumin=" + jumin + ", addr=" + addr + ", mphone="
//				+ mphone + "]";
	}

}
