package tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url ="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user = "javaspring18";
		String password = "0712";
		String sql = "select * from manage";
		
		/*
		 * 1.Driver Class 객체 생성
		 * 2.DriverManager에 객체 등록
		 */
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int no = rs.getInt(1);
			String name = rs.getString(2);
			int age = rs.getInt(3);
			
			System.out.println(no+" "+name+" "+age);
		}
		
		/*
		 * 3.connection생성
		 * 4.stmt생성
		 * 5.쿼리실행
		 */
		rs.close();
		stmt.close();
		con.close();
		
		
	}

}
