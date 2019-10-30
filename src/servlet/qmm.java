package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.student.student;
import com.db.student.studentDao;



/**
 * Servlet implementation class qmm
 */
@WebServlet("/qmm")
public class qmm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public qmm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String oldPassword=request.getParameter("oldPassword");
		String newPassword=request.getParameter("newPassword");
		String rePassword=request.getParameter("rePassword");
		String userId="0416160325";
		PrintWriter out=response.getWriter();
		String massge="";
		System.out.println(oldPassword+" "+newPassword+" "+rePassword);
		studentDao test=new studentDao();
		student res=test.findById(userId);
		if(!res.getPassword().equals(oldPassword)) {
			massge="passwordError";
			System.out.println(massge);
		}
		if(!rePassword.equals(newPassword)) {
			massge="passwordUnmatched";
			System.out.println(massge);
		}
 		if(rePassword.equals(newPassword) && oldPassword.equals(res.getPassword())) {
 			res.setPassword(newPassword);
 			test.updatePassword(res);
 			massge="passwordSuccsee";
 		}
 		out.print(massge);
	}

}
