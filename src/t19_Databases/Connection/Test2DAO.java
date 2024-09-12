package t19_Databases.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2DAO {
	Connection conn = null;

	public Test2DAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/javagroup";
			String user = "atom";
			String password = "1234";
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패~~" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패~~" + e.getMessage());
		}
	}


	// DB연결종료
	public void dbClose() {
		try {
			if(conn!=null) conn.close();
		} catch (SQLException e) {}
	}
} 
