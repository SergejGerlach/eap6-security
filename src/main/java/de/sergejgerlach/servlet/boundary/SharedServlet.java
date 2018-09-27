
package de.sergejgerlach.servlet.boundary;

import de.sergejgerlach.servlet.control.HtmlWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A simple shared HTTP servlet.
 *
 */
@WebServlet("/shared")
public class SharedServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter writer = resp.getWriter()) {
            String body = "NO NEED AUTHENTICATED USER";
            HtmlWriter.writePage(writer, "Shared Servlet", body);
        }
    }


}
