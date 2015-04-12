package kr.ac.shinhan.csp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class UpdateServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		String id = req.getParameter("id");
		
		String name = req.getParameter("name");
		String hak = req.getParameter("num");
		String number = req.getParameter("hp");
		String mail = req.getParameter("email");
		String kakao = req.getParameter("kakao");
		String boss = req.getParameter("team");
		if (boss == null) {
			boss = "팀장아님";
		} else {
			boss = "팀장이다";
		}
		String git = req.getParameter("git");
		
		Manager.deleteMember(id);
		
		Member m = Manager.addMember(name, hak, number, mail, kakao, boss, git);
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1> Add Member </h1>");
		resp.getWriter().println("이름 : " + m.getname() + "</br");
		resp.getWriter().println("학번: " + m.gethak() + "</br>");
		resp.getWriter().println("전화번호 : " + m.getnumber() + "</br>");
		resp.getWriter().println("이메일 : " + m.getmail() + "</br>");
		resp.getWriter().println("카카오아이디 : " + m.getkakao() + "</br>");
		resp.getWriter().println("팀장여부 : " + m.getboss() + "</br>");
		resp.getWriter().println("GitHub ID : " + m.getgit() + "</br>");
		
		
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<form method='Post' action='/index.html'>");
		resp.getWriter().println("<td> <input type='submit' value='처음으로' </td>");
		resp.getWriter().println("</from>");
		resp.getWriter().println("</tr>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");

	}

}
