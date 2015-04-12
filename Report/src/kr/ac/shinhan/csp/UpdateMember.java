package kr.ac.shinhan.csp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class UpdateMember extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		
		String id =req.getParameter("id");
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		Member m = Manager.getMember(id);
		
		
		resp.getWriter().println("<html>"); 
		resp.getWriter().println("<body>"); 
		 		resp.getWriter().println("<h1> Update Member </h1>"); 
			resp.getWriter().println("<form method='Post' action='/UpdateServlet'>"); 
			
				resp.getWriter().println("<tr> 이름 : </tr> <tr> <input type='text' name='name' value=" + m.getname() + "> </tr> </br>"); 
		 		resp.getWriter().println("<tr> 학번 : </tr> <tr> <input type='text' name='hak' value=" + m.gethak() + "> </tr> </br>"); 
				resp.getWriter().println("<tr> 전화번호 : </tr> <tr> <input type='text' name='number' value=" + m.getnumber() + "> </tr> </br>"); 
			resp.getWriter().println("<tr> 메일 : </tr> <tr> <input type='text' name='mail' value=" + m.getmail() + "> </tr> </br>"); 
		 		resp.getWriter().println("<tr> 카톡 ID : </tr> <tr> <input type='text' name='katok' value=" + m.getkakao() + "> </tr> </br>"); 
		 		if(m.getboss() == null) { 
		 			resp.getWriter().println("<tr> 팀장여부 : </tr> <tr> <input type='checkbox' name='boss'> </tr> </br>"); 
		 		} else {
		 			resp.getWriter().println("<tr> 팀장여부 : </tr> <tr> <input type='checkbox' name='boss' checked='checked'> </tr> </br>"); 
		 		}
		 		resp.getWriter().println("<tr> GitID : </tr> <tr> <input type='text' name='git' value=" + m.getgit() + "> </tr> </br>"); 
		 		resp.getWriter().println("<td> <input type='submit' value='정보수정' </td>"); 
	 		resp.getWriter().println("</from>");		 
		 		resp.getWriter().println("</body>"); 
		 		resp.getWriter().println("</html>"); 

		
	}
	
}
