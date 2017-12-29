package jdbc.oracledb;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_DML_INSERT {

	public static void main(String[] args) throws Exception {
		oracle.jdbc.driver.OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
		
		DriverManager.registerDriver(oracleDriver);
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.220.128:1521:xe", "claw0ed", "123456");
		
		java.sql.Statement stmt = conn.createStatement();
		
		

	}

}
