package jdbc.oracledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_DML_SELECT {

	public static void main(String[] args) throws Exception {
		oracle.jdbc.driver.OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
		
		DriverManager.registerDriver(oracleDriver);
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.220.128:1521:xe", "claw0ed", "123456");
		
		Statement stmt = conn.createStatement();
		
		String sql = "select scno, scname, tmname, tmregion, tmpos, bkno, birth, height, weight, regdate from soccer";
		ResultSet rs = stmt.executeQuery(sql);

		while(rs.next()) {
			String out = rs.getInt("scno") + ","
					+ rs.getString("scname") + ","
					+ rs.getString("tmname") + ","
					+ rs.getString("tmregion") + ","
					+ rs.getString("tmpos") + ","
					+ rs.getString("bkno") + ","
					+ rs.getString("birth") + ","
					+ rs.getString("height") + ","
					+ rs.getString("weight") + ","
					+ rs.getString("regdate");
			
			System.out.println(out);
		}
		
		rs.close();
		
		stmt.close();
		
		conn.close();

	}

}
