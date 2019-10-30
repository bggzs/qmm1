package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.student.class1Dao;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class qmm1
 */
@WebServlet("/qmm1")
public class qmm1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public qmm1() {
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
		response.setCharacterEncoding("UTF-8");
		String user_Id=request.getParameter("user_Id");
		class1Dao dao=new class1Dao();
		List<com.db.student.qmm2> qmm2=dao.findclassqmm();
		JSONArray jsonArray =JSONArray.fromObject(qmm2);
		String json = jsonArray.toString();
		String massge=json;
		PrintWriter out=response.getWriter();
		System.out.println(massge);
		out.print(massge);
	
		
	}

}
