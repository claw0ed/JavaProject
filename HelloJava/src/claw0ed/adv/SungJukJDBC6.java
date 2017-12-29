package claw0ed.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import project.v1.SungJukV0;

public class SungJukJDBC6 {
	// 오하클 접속 정보 설정
	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.220.128:1521:xe";
	private static String USR = "claw0ed";
	private static String PWD = "123456";

	public static void main(String[] args) {
		// 성적 처리 JDBC
		// ResourceBundle를 이용해서 JDBC 관련정보를
		// 특정파일에서 키 = 값 형태로 읽어서 처리
		String sbPath = "claw0ed.adv.oracle"; // 리소스번들 파일경로 지정 : 페키지.파일명
		// (.properties는 제외!!)
		String DRV = null;
		String URL = null;
		String USR = null;
		String PWD = null;
		
		// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// SQL 관련 변수 선언
		String selectSQL = "select sjno, name, kor, eng, mat, regdate from sungjuk order by sjno desc";
		String insertSQL = null;
		String updateSQL = null;
		String deleteSQL = null;
		
		try {
			
			// 0. 잡속정보를 리소스번들로 부터 읽어오기
			ResourceBundle rb = ResourceBundle.getBundle(sbPath);
			DRV = rb.getString("DRV");
			URL = rb.getString("URL");
			USR = rb.getString("USR");
			PWD = rb.getString("PWD");
			
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);
			// 4.
			rs = pstmt.executeQuery(); // select
			// 5.
//			
			
			// 표준화된 방식
			List<SungJukV0> sjlist = new ArrayList<>();
			while(rs.next()) {
				SungJukV0 sj = new SungJukV0();
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
			sjlist.add(sj);
			}
			
			for(SungJukV0 sj : sjlist) {
				System.out.println(sj);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try { rs.close(); } catch (Exception ex) {}
			try { pstmt.close(); } catch (Exception ex) {}
			try { conn.close(); } catch (Exception ex) {}
		}
		
	}

}
