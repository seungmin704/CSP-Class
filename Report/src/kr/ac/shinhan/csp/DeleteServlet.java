package kr.ac.shinhan.csp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class DeleteServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		String id = req.getParameter("id");

		Member m = Manager.getMember(id);

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
		resp.getWriter().println("삭제 되었습니다.");
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<form method='Post' action='/index.html'>");
		resp.getWriter()
				.println("<td> <input type='submit' value='처음으로' </td>");
		resp.getWriter().println("</form>");
		resp.getWriter().println("</tr>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");

		Manager.deleteMember(id);

	}

}
