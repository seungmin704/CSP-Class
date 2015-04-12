package kr.ac.shinhan.csp;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class ReadServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String hak= req.getParameter("hak"); 
		String number = req.getParameter("number");
		String mail = req.getParameter("mail");
		String kakao = req.getParameter("kakao");
		String boss = req.getParameter("boss");
		String git = req.getParameter("git");
		
		List<Member> namedMemberList = Manager.getMemberByName(name);
		Member m = namedMemberList.get(0);
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("이름  : "+ m.getname()+ "</br>");
		resp.getWriter().println("학번  : "+ m.gethak()+ "</br>");
		resp.getWriter().println("전화번호 :  "+ m.getnumber()+ "</br>");
		resp.getWriter().println("메일주소 :  "+ m.getmail()+ "</br>");
		resp.getWriter().println("카카오톡 아이디 :  "+ m.getkakao()+ "</br>");
		resp.getWriter().println("팀장여부 :  "+ m.getboss()+ "</br>");
		
		
		resp.getWriter().println("GitHub ID :  "+  m.getgit()+ "</br>");
		resp.getWriter().println("<form method='Post' action='/index.html'>"); 
		resp.getWriter().println("<td> <input type='submit' value='처음으로' </td>"); 
		resp.getWriter().println("</from>"); 
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
		
		
		
	}

}
