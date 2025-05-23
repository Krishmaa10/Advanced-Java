package cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60); // 1 minute
            userCookie.setPath("/");
            response.addCookie(userCookie);

            Cookie visitCookie = new Cookie("visitCount", "1");
            visitCookie.setMaxAge(60);
            visitCookie.setPath("/");
            response.addCookie(visitCookie);
        }

        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        int visitCount = 0;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = cookie.getValue();
                }
                if (cookie.getName().equals("visitCount")) {
                    try {
                        visitCount = Integer.parseInt(cookie.getValue());
                    } catch (NumberFormatException e) {
                        visitCount = 0;
                    }
                }
            }
        }

        out.println("<html>");
        out.println("<head><title>Cookie Example</title></head>");
        out.println("<body>");

        if (existingUser != null) {
            visitCount++;
            Cookie updatedVisitCookie = new Cookie("visitCount", String.valueOf(visitCount));
            updatedVisitCookie.setMaxAge(60);
            updatedVisitCookie.setPath("/");
            response.addCookie(updatedVisitCookie);

            out.println("<font color=blue><h2>Welcome back, " + existingUser + "!</h2></font>");
            out.println("<font color=magenta><h2>You have visited this page " + visitCount + " times!</h2></font>");
            out.println("<form action='CookieServlet' method='post'>");
            out.println("<input type='submit' value='Logout'>");
            out.println("</form>");
        } else {
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Cookie userCookie = new Cookie("user", "");
        userCookie.setMaxAge(0);
        userCookie.setPath("/");
        response.addCookie(userCookie);

        Cookie visitCookie = new Cookie("visitCount", "");
        visitCookie.setMaxAge(0);
        visitCookie.setPath("/");
        response.addCookie(visitCookie);

        response.sendRedirect("CookieServlet");
    }
}
