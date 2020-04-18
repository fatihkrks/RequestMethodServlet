package requestMethodBrowser;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/examplerequestMethod")
public class examplerequestMethods extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Locale locale=req.getLocale();
	int localPort=req.getLocalPort();
	int servePort=req.getServerPort();
	String remoteAddr=req.getRemoteAddr();
	String hostname=req.getHeader("host");
	System.out.println(locale);
	System.out.println(localPort);
	System.out.println(servePort);
	System.out.println(remoteAddr);
	System.out.println(hostname);

	
	
	 Enumeration<String> headeNames=req.getHeaderNames();
	 while (headeNames.hasMoreElements()) {
		String hname =  headeNames.nextElement();
		String headerValue=req.getHeader(hname);
		System.out.println(hname+ " " +headerValue);
	}
}

}
