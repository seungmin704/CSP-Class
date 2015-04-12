package kr.ac.shinhan.csp;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class RetrieveServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException{
		
		List<Member> memberList = Manager.getAllMembers();
		int i = memberList.size();
				
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<table border = " + i + ">");
		
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td> Name </td> <td> Num </td> <td> Hp </td> <td> Email </td> <td> Kakao_id </td> <td> team </td> <td> GetHub_ID </td> " );
		resp.getWriter().println("</tr>");
		
		for(Member m :memberList)
		{
			resp.getWriter().println("<tr>");
			resp.getWriter().println("<td>"+"<a href=/ReadServlet?name="+m.getname()+">"+m.getname()+"</a>"+"</td>"
					+ "<td>"+m.gethak()+"</td>" + "<td>"+m.getnumber()+"</td>" + "<td>"+m.getmail()+"</td>" + "<td>"+m.getkakao()+"</td>"
					+ "<td>"+m.getboss()+"</td>" + "<td>"+m.getgit()+"</td>"
					+ "<td>"+"<a href='/UpdateMember?id=" + m.getid() + "'> update </a> </td>"
					+ "<td>"+"<a href='/DeleteServlet?id=" + m.getid()+"'> delete </a> </td>");
			resp.getWriter().println("</tr>");
		}
		resp.getWriter().println("</table>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}


