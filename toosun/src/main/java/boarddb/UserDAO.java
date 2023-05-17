package boarddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAO {

	//데이터베이스에 접속하는 소스
	String id = "root"; //접속 아이디
	String pass = "qwer7878";
	String url = "jdbc:mysql://localhost/tosun";
	
	Connection conn; //데이터베이스에 접근 할 수 있도록 설정
	PreparedStatement pstmt;
	ResultSet rs; //데이터베이스의 테이블의 결과를 리턴받아 자바에 저장해주는 객체
	 
	//데이터베이스에 접근 할수 있도록 도와주는 메소드
	public void getConn() {
		try {
			//1. 해당 데이터 베이스를 사용한다고 선언
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. 해당 데이터 베이스에 접속
			conn = DriverManager.getConnection(url, id, pass);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insertMember(UserBean ub) {
		try {
			getConn();
			//3. 접속 후 쿼리를 준비
			String sql = "insert into member values(?,?,?,?,?,?,?,?,?,?)";
			//4. 쿼리를 사용하도록 설정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//5. ?에 맞게 데이터를 맵핑
			pstmt.setString(1, ub.getUsername());
			pstmt.setString(2, ub.getUserid());
			pstmt.setString(3, ub.getUserpass());
			pstmt.setString(4, ub.getEmail());
			pstmt.setString(5, ub.getTel());
			pstmt.setString(6, ub.getAddress());
			pstmt.setString(7, ub.getDetailaddr());
			pstmt.setInt(8, ub.getPostcode());
			pstmt.setInt(9, ub.getBirth());
			pstmt.setString(10, ub.getWdate());
			

			//6. 쿼리실행
			pstmt.executeUpdate(); // insert, update, delete 시 사용하는 메소드
			
			//7. 자원 반납
			conn.close();
			pstmt.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
