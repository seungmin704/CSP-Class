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
		resp.getWriter().println("�̸� : " + m.getname() + "</br");
		resp.getWriter().println("�й�: " + m.gethak() + "</br>");
		resp.getWriter().println("��ȭ��ȣ : " + m.getnumber() + "</br>");
		resp.getWriter().println("�̸��� : " + m.getmail() + "</br>");
		resp.getWriter().println("īī�����̵� : " + m.getkakao() + "</br>");
		resp.getWriter().println("���忩�� : " + m.getboss() + "</br>");
		resp.getWriter().println("GitHub ID : " + m.getgit() + "</br>");
		resp.getWriter().println("���� �Ǿ����ϴ�.");
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<form method='Post' action='/index.html'>");
		resp.getWriter()
				.println("<td> <input type='submit' value='ó������' </td>");
		resp.getWriter().println("</form>");
		resp.getWriter().println("</tr>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");

		Manager.deleteMember(id);

	}

}
