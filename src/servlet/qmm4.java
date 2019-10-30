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
import com.db.student.classCX;

import net.sf.json.JSONArray;
/**
 * Servlet implementation class qmm4
 */
@WebServlet("/qmm4")
public class qmm4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public qmm4() {
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
		String key1=request.getParameter("key1");
		String key2=request.getParameter("key2");
		PrintWriter out=response.getWriter();
		String massge="";
		System.out.println(key1+":"+key2);
		class1Dao dao=new class1Dao();
		if(key1.equals("c_id") && !key2.equals("")) {
			int id=Integer.valueOf(key2);
			System.out.println(id);
			List<classCX> res=dao.findclassById(id);
			JSONArray jsonArray =JSONArray.fromObject(res);
			String json = jsonArray.toString();
			massge=json;
		}else if(key1.equals("c_name") && !key2.equals("")) {
			List<classCX> res=dao.findclassByName(key2);
			JSONArray jsonArray =JSONArray.fromObject(res);
			String json = jsonArray.toString();
			massge=json;
		}else if(key1.equals("c_stat") && !key2.equals("")) {
			List<classCX> res=dao.findclassByStat(key2);
			JSONArray jsonArray =JSONArray.fromObject(res);
			String json = jsonArray.toString();
			massge=json;
		}else if(!key1.equals("") && key2.equals("")) {
			List<classCX> res=dao.findclassCX();
			JSONArray jsonArray =JSONArray.fromObject(res);
			String json = jsonArray.toString();
			massge=json;
		}
		System.out.println(massge);
		out.print(massge);

	}

}
