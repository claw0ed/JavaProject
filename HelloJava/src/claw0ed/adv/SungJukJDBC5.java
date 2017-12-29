package claw0ed.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukJDBC5 {
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
		String updateSQL = "update sungjuk set name = ?, kor = ?, eng = ?, mat = ? where sjno = ?";
		String deleteSQL = "delete from sungjuk where sjno = ?";
		
		
		
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
				sj.setRegdate(rs.getString("regdate").substring(0, 10)); // 2017-12-18 11:12:13
			sjlist.add(sj);
			}
			
			for(SungJukVO2 sj : sjlist) {
				System.out.println(sj);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제할 학생번호를 입력하세요");
			int no = sc.nextInt();
			
//			System.out.println("수정할 점수를 입력하세요 (이름/국어/영어/수학)");
//			String name = sc.next();
//			int kor = sc.nextInt();
//			int eng = sc.nextInt();
//			int mat = sc.nextInt();
			
			pstmt = conn.prepareStatement(deleteSQL);
			pstmt.setInt(1, no); // 첫번째 ? 자리에 실제오 적용될 값 지정

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건의 데이터 삭제 완료!");
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try { rs.close(); } catch (Exception ex) {}
			try { pstmt.close(); } catch (Exception ex) {}
			try { conn.close(); } catch (Exception ex) {}
		}
		
	}

}
