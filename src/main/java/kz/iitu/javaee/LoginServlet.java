package kz.iitu.javaee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final String emailOne = "adil@mail.ru";
    private final String pwd = "1234";

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("inputEmail");
        String password = request.getParameter("inputPassword");

        if (emailOne.equals(email) && pwd.equals(password)) {
            HttpSession session = request.getSession();
            Cookie loginCookie = new Cookie("inputEmail", email);
            session.setAttribute("adil@mail.ru", "1234");
            session.setMaxInactiveInterval(30*60);

            loginCookie.setMaxAge(30*60);
            response.addCookie(loginCookie);
            response.sendRedirect("postuser.jsp");
        } else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
//
//            request.getRequestDispatcher("/postuser.jsp").forward(request, response);
            rd.include(request, response);
        }
    }
}
