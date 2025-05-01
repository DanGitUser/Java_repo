package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconn {
	//
	public static void main(String[] args) throws Exception {
		// 1. 접속 객체 취득
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "sample", "1234");
		System.out.println(conn);
		
		// 2. 문장 생성
		Statement stmt = conn.createStatement();
		// 3. 실행후 결과 변환
		ResultSet rs = stmt.executeQuery("select * from student");
		//이후 파싱
		while(rs.next()) {
			System.out.println(rs.getInt("studno") + " :: " + rs.getString("name"));
		}
	}
}
