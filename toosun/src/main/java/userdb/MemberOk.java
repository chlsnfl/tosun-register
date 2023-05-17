package userdb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import boarddb.UserBean;
import boarddb.UserDAO;


public class MemberOk extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		UserBean ub = new UserBean();
		
		ub.setUsername(req.getParameter("username"));
		ub.setUserid(req.getParameter("userid"));
		ub.setUserpass(req.getParameter("userpass"));
		ub.setEmail(req.getParameter("useremail"));
		ub.setTel(req.getParameter("tel"));
		ub.setAddress(req.getParameter("addr"));
		ub.setDetailaddr(req.getParameter("detailaddr"));
		ub.setPostcode(Integer.parseInt(req.getParameter("postcode")));
		ub.setBirth(Integer.parseInt(req.getParameter("birth")));
		ub.setWdate();
		doGet(req, res);
	}

}
