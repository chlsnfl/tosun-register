package boarddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAO {

	//�����ͺ��̽��� �����ϴ� �ҽ�
	String id = "root"; //���� ���̵�
	String pass = "qwer7878";
	String url = "jdbc:mysql://localhost/tosun";
	
	Connection conn; //�����ͺ��̽��� ���� �� �� �ֵ��� ����
	PreparedStatement pstmt;
	ResultSet rs; //�����ͺ��̽��� ���̺��� ����� ���Ϲ޾� �ڹٿ� �������ִ� ��ü
	 
	//�����ͺ��̽��� ���� �Ҽ� �ֵ��� �����ִ� �޼ҵ�
	public void getConn() {
		try {
			//1. �ش� ������ ���̽��� ����Ѵٰ� ����
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. �ش� ������ ���̽��� ����
			conn = DriverManager.getConnection(url, id, pass);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insertMember(UserBean ub) {
		try {
			getConn();
			//3. ���� �� ������ �غ�
			String sql = "insert into member values(?,?,?,?,?,?,?,?,?,?)";
			//4. ������ ����ϵ��� ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//5. ?�� �°� �����͸� ����
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
			

			//6. ��������
			pstmt.executeUpdate(); // insert, update, delete �� ����ϴ� �޼ҵ�
			
			//7. �ڿ� �ݳ�
			conn.close();
			pstmt.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
