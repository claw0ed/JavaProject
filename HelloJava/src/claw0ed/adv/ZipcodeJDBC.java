package claw0ed.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZipcodeJDBC {
	// 오하클 접속 정보 설정
	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.220.128:1521:xe";
	private static String USR = "hr";
	private static String PWD = "hr";

	public static void main(String[] args) {
		// 성적 처리 JDBC
		
		// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// SQL 관련 변수 선언
		String selectSQL = "select * from zipcode_seoul where \"도로명\" like ?";
		System.out.println(selectSQL);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 도로명을 입력하세요");
		String 도로명 = sc.nextLine();
		
		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);
			pstmt.setString(1, 도로명 + "%"); // 첫번째 ? 자리에 실제오 적용될 값 지정
			// 4.
			rs = pstmt.executeQuery(); // select
			// 5.

			// 표준화된 방식
			List<ZipcodeVO> sjlist = new ArrayList<>();
			while(rs.next()) {
				ZipcodeVO zc = new ZipcodeVO();
				zc.set우편번호(rs.getInt("우편번호"));
				zc.set시도(rs.getString("시도"));
				zc.set시군구(rs.getString("시군구"));
				zc.set읍면(rs.getString("읍면"));
				zc.set도로명(rs.getString("도로명"));
				zc.set건물번호본번(rs.getInt("건물번호본번"));
				zc.set건물번호부번(rs.getInt("건물번호부번"));
				zc.set시군구용건물명(rs.getString("시군구용건물명"));
				zc.set법정동명(rs.getString("법정동명"));
				zc.set리명(rs.getString("리명"));
				zc.set지번본번(rs.getInt("지번본번"));
			sjlist.add(zc);
			}
			
			for(ZipcodeVO zc : sjlist) {
				System.out.println(zc);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try { sc.close(); } catch (Exception ex) {}
			try { rs.close(); } catch (Exception ex) {}
			try { pstmt.close(); } catch (Exception ex) {}
			try { conn.close(); } catch (Exception ex) {}
		}
		
	}

}
