package t19_Databases.t03_Hoewon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HoewonDAO {
	private Connection conn = null;
	//Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	HoewonVO vo = null;
	String sql = "";
	
	public HoewonDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/javagroup";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패~~~" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패~~~" + e.getMessage());
		}
	}
	
	// conn닫기
	public void connClose() {
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {
			System.out.println("sql 오류 : " + e.getMessage());
		}
	}
	
	// pstmt닫기
	public void pstmtClose() {
		try {
			if(pstmt != null) pstmt.close();
		} catch (SQLException e) {
			System.out.println("sql 오류 : " + e.getMessage());
		}
	}
	
	// rs닫기
	public void rsClose() {
		try {
			if(rs != null) rs.close();
		} catch (SQLException e) {
			System.out.println("sql 오류 : " + e.getMessage());
		} finally {
			pstmtClose();
		}
	}

	// 회원 자료 등록처리
	public int setInput(HoewonVO vo) {
		int res = 0;
		
		try {
			/*  Statement객체 사용시...
			sql = "insert into hoewon values (default,'"+vo.getName()+"',"+vo.getAge()+",'"+vo.getGender()+"','"+vo.getJoinday()+"','"+vo.getAddress()+"')";
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
			*/
			sql = "insert into hoewon values (default,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getGender());
			pstmt.setString(4, vo.getJoinday());
			pstmt.setString(5, vo.getAddress());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql 오류 : " + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}

	// 전체 회원 검색
	public ArrayList<HoewonVO> getList() {
		ArrayList<HoewonVO> vos = new ArrayList<HoewonVO>();
		try {
			sql = "select * from hoewon order by name";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new HoewonVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setJoinday(rs.getString("joinday"));
				vo.setAddress(rs.getString("address"));
				
				vos.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("sql 오류 : " + e.getMessage());
		} finally {
			rsClose();
		}
		return vos;
	}

	// 개별자료 검색
	public HoewonVO getSearch(String name) {
		HoewonVO vo = new HoewonVO();
		try {
			sql = "select * from hoewon where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setJoinday(rs.getString("joinday"));
				vo.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			System.out.println("sql 오류 : " + e.getMessage());
		} finally {
			rsClose();
		}
		return vo;
	}

	// DB에서 삭제처리
	public int setDelete(String name) {
		int res = 0;
		try {
			sql = "delete from hoewon where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql 오류 : " + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}

	public int setUpdate(int idx, int choice, String content) {
		int res = 0;
		try {
			if(choice == 1) sql = "update hoewon set name = ? where idx = ?";
			else if(choice == 2) sql = "update hoewon set age = ? where idx = ?";
			else if(choice == 3) sql = "update hoewon set gender = ? where idx = ?";
			else if(choice == 4) sql = "update hoewon set joinday = ? where idx = ?";
			else sql = "update hoewon set address = ? where idx = ?";
			pstmt = conn.prepareStatement(sql);
			
			if(choice == 2) pstmt.setInt(1, Integer.parseInt(content));
			else pstmt.setString(1, content);
			
			pstmt.setInt(2, idx);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql 오류 : " + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}
}
/*
 ExecuteQuery
1. 수행결과로 ResultSet 객체의 값을 반환합니다.
2. SELECT 구문을 수행할 때 사용되는 함수입니다. 

ExecuteUpdate
1. 수행결과로 Int 타입의 값을 반환합니다.
2. SELECT 구문을 제외한 다른 구문을 수행할 때 사용되는 함수입니다.

Statement 클래스
- SQL 구문을 실행하는 역할
- 스스로는 SQL 구문 이해 못함(구문해석 X) -> 전달역할
- SQL 관리 O + 연결 정보 X

PreparedStatement 클래스
- Statement 클래스의 기능 향상
- 인자와 관련된 작업이 특화(매개변수)
- 코드 안정성 높음. 가독성 높음.
- 코드량이 증가 -> 매개변수를 set해줘야하기 때문에..
- 텍스트 SQL 호출
 */

