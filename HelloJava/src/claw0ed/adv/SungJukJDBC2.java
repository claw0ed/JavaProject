package claw0ed.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import project.v1.SungJukV0;

public class SungJukJDBC2 {
	// 오하클 접속 정보 설정
	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.220.128:1521:xe";
	private static String USR = "claw0ed";
	private static String PWD = "123456";

	public static void main(String[] args) {
		// 성적 처리 JDBC
		
		// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// SQL 관련 변수 선언
		String selectSQL = "select sjno, name, kor, eng, mat, regdate from sungjuk order by sjno desc";
		String selectOneSQL = "select * from sungjuk where sjno = ?";
		String insertSQL = null;
		String updateSQL = null;
		String deleteSQL = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 학생번호를 입력하세요");
		int no = sc.nextInt();
		
		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectOneSQL);
			pstmt.setInt(1, no); // 첫번째 ? 자리에 실제오 적용될 값 지정
			// 4.
			rs = pstmt.executeQuery(); // select
			// 5.
			SungJukV0 sj = new SungJukV0();
			if(rs.next()) {
				// (조건에 일치하는 데이터가) 결과집합에 존재한다면
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sj.setTot(rs.getInt("tot"));
				sj.setAvrg(rs.getDouble("avrg"));
				sj.setGrd(rs.getString("grd"));
			}
			
			System.out.println(sj);
			
			// 표준화된 방식
//			List<SungJukV0> sjlist = new ArrayList<>();
//			while(rs.next()) {
//				SungJukV0 sj = new SungJukV0();
//				sj.setName(rs.getString("name"));
//				sj.setKor(rs.getInt("kor"));
//				sj.setEng(rs.getInt("eng"));
//				sj.setMat(rs.getInt("mat"));
//			sjlist.add(sj);
//			}
//			
//			for(SungJukV0 sj : sjlist) {
//				System.out.println(sj);
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
