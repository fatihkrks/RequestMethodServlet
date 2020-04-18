package encodingResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/responseEncodingServlet")
public class ResponseEncodingServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setCharacterEncoding("UTF-8");
	PrintWriter pw =resp.getWriter(); 
	pw.print("<html>");
	pw.print("<head> <meta charset='UTF-8'> </head>");
	pw.print("<body>");
	pw.print("ıİşŞÇÜü");
	pw.print("</body> </html> ");
	
}
	
}
