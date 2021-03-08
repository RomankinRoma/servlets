package kz.iitu.javaee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.ResponseCache;

@WebServlet(value = "/register")
public class RegistrationServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("inputEmail");
        String username = request.getParameter("inputUsername");
        String contacts = request.getParameter("inputContacts");
        String password = request.getParameter("inputPassword");

        RequestDispatcher view = request.getRequestDispatcher("postuser.jsp");
        view.forward(request, response);
    }

}
