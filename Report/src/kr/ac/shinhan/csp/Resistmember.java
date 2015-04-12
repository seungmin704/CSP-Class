package kr.ac.shinhan.csp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class Resistmember extends HttpServlet {
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
		Member m = Manager.addMember(name, hak, number, mail, kakao, boss, git);
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("�̸�  : "+ req.getParameter("name")+ "</br>");
		resp.getWriter().println("�й�  : "+ req.getParameter("hak")+ "</br>");
		resp.getWriter().println("��ȭ��ȣ :  "+ req.getParameter("number")+ "</br>");
		resp.getWriter().println("�����ּ� :  "+ req.getParameter("mail")+ "</br>");
		resp.getWriter().println("īī���� ���̵� :  "+ req.getParameter("kakao")+ "</br>");
		
		if(req.getParameter("boss")==null)
			resp.getWriter().println("����ƴ�");
		else
			resp.getWriter().println("�����̴�");
		
		resp.getWriter().println("GitHub ID :  "+ req.getParameter("git")+ "</br>");
		
		
		
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
		
	}

}
