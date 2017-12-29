package claw0ed.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project.v1.SungJukV0;

public class SungJukJDBC4 {
	// 오하클 접속 정보 설정
	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.220.128:1521:xe";
	private static String USR = "claw0ed";
	private static String PWD = "123456";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 성적 처리 JDBC
		
		// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// SQL 관련 변수 선언
		// String selectSQL = "select sjno, name, kor, eng, mat, regdate from sungjuk order by sjno desc";
		String selectSQL = "select * from sungjuk order by sjno desc";
		String selectOneSQL = "select * from sungjuk where sjno = ?";
		String insertSQL = null;
		String updateSQL = "update sungjuk set name = ?, kor = ?, eng = ?, mat = ?, tot = ?, avrg = ?, grd = ? where sjno = ?";
		String deleteSQL = null;
		
		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);
			// 4.
			rs = pstmt.executeQuery(selectSQL); // select
			// 5.
			// 표준화된 방식
			List<SungJukVO2> sjlist = new ArrayList<>();
			while(rs.next()) {
				SungJukVO2 sj = new SungJukVO2();
				sj.setSjno(rs.getString("sjno"));
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sj.setTot(rs.getInt("tot"));
				sj.setAvrg(rs.getDouble("avrg"));
				sj.setGrd(rs.getString("grd"));
				sj.setRegdate(rs.getString("regdate").substring(0, 10)); // 2017-12-18 11:12:13
			sjlist.add(sj);
			}
			
			for(SungJukVO2 sj : sjlist) {
				System.out.println(sj);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("수정할 학생번호를 입력하세요");
			int sjno = sc.nextInt();
			System.out.println("수정할 이름과 점수를 입력하세요 (이름/국어/영어/수학)");
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			
			// 총점/평균/학점 처리
			int tot = kor + eng + mat;
			double avrg = (double)tot / 3;
			String grd = "가";
			
			switch((int)avrg / 10) {
			case 10:
			case 9: grd = "수"; break;
			case 8: grd = "우"; break;
			case 7: grd = "미"; break;
			case 6: grd = "양"; break;
			}
			
			pstmt = conn.prepareStatement(updateSQL);
			pstmt.setString(1, name); // 첫번째 ? 자리에 실제오 적용될 값 지정
			pstmt.setInt(2, kor); // 첫번째 ? 자리에 실제오 적용될 값 지정
			pstmt.setInt(3, eng); // 첫번째 ? 자리에 실제오 적용될 값 지정
			pstmt.setInt(4, mat); // 첫번째 ? 자리에 실제오 적용될 값 지정
			pstmt.setInt(5, tot); // 첫번째 ? 자리에 실제오 적용될 값 지정
			pstmt.setDouble(6, avrg); // 첫번째 ? 자리에 실제오 적용될 값 지정
			pstmt.setString(7, grd); // 첫번째 ? 자리에 실제오 적용될 값 지정
			pstmt.setInt(8, sjno); // 첫번째 ? 자리에 실제오 적용될 값 지정
			
			int cnt = pstmt.executeUpdate(); // insert, update, delete
			System.out.println(cnt + "건의 데이터 추가 완료!");
			
			// 총점/평균/학점 처리
//			int tot = kor + eng + mat;
//			double avrg = (double)tot / 3;
//			String grd = "가";
//			
//			switch((int)avrg / 10) {
//			case 10:
//			case 9: grd = "수"; break;
//			case 8: grd = "우"; break;
//			case 7: grd = "미"; break;
//			case 6: grd = "양"; break;
//			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try { rs.close(); } catch (Exception ex) {}
			try { pstmt.close(); } catch (Exception ex) {}
			try { conn.close(); } catch (Exception ex) {}
		}
		
	}

}

class SungJukVO2 extends SungJukV0 {
	private String sjno;
	private String regdate;
	
	public String getSjno() {
		return sjno;
	}
	public void setSjno(String sjno) {
		this.sjno = sjno;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		String fmt = "SungJukV02 [sjno=%s, name=%s, kor=%d, eng=%d, mat=%d, tot=%d, avrg=%.1f, grd=%s, regdate=%s]";
		return String.format(fmt, sjno, getName(), getKor(), getEng(), getMat(), getTot(), getAvrg(), getGrd(), regdate);
	}
}
