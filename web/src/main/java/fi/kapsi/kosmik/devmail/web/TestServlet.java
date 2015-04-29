package fi.kapsi.kosmik.devmail.web;

import java.io.IOException;
import javax.servlet.http.*;

import fi.kapsi.kosmik.devmail.Utils;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("test string from servlet: " + new Utils().getTestString());
	}
}
