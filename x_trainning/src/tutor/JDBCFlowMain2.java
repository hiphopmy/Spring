package tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain2 {

	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url ="jdbc:oracle:thin:@182.237.126.19:1521:XE";
//					(jdbc:DB이름:드라이버타입:@DB IP:DB 포트:DB서비스이름)
		String user="javaspring31";
		String password="javaspring31";
		String selectSql = "select * from emp";
		
		/*
		 * 1.oracle.jdbc.OracleDriver class loading
		 * 		A. Driver 객체 생성				>>static 블록에서 실행
		 * 		B. DriverManager에 객체등록		>>static 블록에서 실행
		 */
		Class.forName(driverClass);
		System.out.println("1.driver class loading");
		
		/*
		 * 2.Connection 생성 (=socket)
		 * 		-IP.포트 필요
		 */
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2.Connection 생성"+con);
		
		/*
		 * 3.Statement생성(=Stream)
		 */
		Statement stmt = con.createStatement();
		System.out.println("3.Statement 생성 : "+stmt);
		
		/*
		 * 4-1.SQL문 전송(select)
		 * 4-2.ResultSet 얻기 (결과집합 얻기)
		 * 	-next() : Cursor를 이동해서 데이터를 얻는 메소드
		 * 			  데이터가 있으면 true 데이터가 없으면 false를 반환
		 *  		  
		 */
		ResultSet rs = stmt.executeQuery(selectSql);		// select문 전용 메소드
		System.out.println("4.ResultSet객체 얻기"+rs);
		
		/*
		 * 이름       널       유형           
		   -------- -------- ------------ 
			EMPNO    NOT NULL NUMBER(4)    
			ENAME             VARCHAR2(10) 
			JOB               VARCHAR2(9)  
			MGR               NUMBER(4)    
			HIREDATE          DATE         
			SAL               NUMBER(7,2)  
			COMM              NUMBER(7,2)  
			DEPTNO            NUMBER(2)    

		 */
		System.out.println("---------------------------");
		System.out.println("empno \t ename \t job \t\t sal");
		System.out.println("---------------------------");
		while(rs.next()) {
			String no = rs.getString("empno");
			String name = rs.getString("ename");
			String job = rs.getString("job");
			String sal = rs.getString("sal");
			
			System.out.println(no+"\t"+name+"\t"+job+"\t\t"+sal);
		}
		
		/*
		 * 5.연결해지
		 */
		rs.close();
		stmt.close();
		con.close();
		
		
		

	}

}
