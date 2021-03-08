package kz.iitu.javaee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie loginCookie = null;
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("JSESSIONID")){
                    System.out.println("JSESSIONID="+cookie.getValue());
                    break;
                }
//                if(cookie.getName().equals("inputEmail")){
//                    loginCookie = cookie;
//                    break;
//                }
            }
        }

        HttpSession session = request.getSession(false);
        System.out.println("User="+session.getAttribute("adil@mail.ru"));
        if(session != null){
            session.invalidate();
            System.out.println("INVALIDATED");
        }
//        if(loginCookie != null){
//            loginCookie.setMaxAge(0);
//            response.addCookie(loginCookie);
//        }
        response.sendRedirect("login.jsp");
    }
}
