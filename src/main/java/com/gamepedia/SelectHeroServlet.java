package com.gamepedia;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "selectheroservlet",
        urlPatterns = "/SelectHero"
)
public class SelectHeroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String heroType = req.getParameter("Type");

        HeroService heroService = new HeroService();
        HeroType hero = HeroType.valueOf(heroType);

        List heroInfo = heroService.getHero(hero);

        req.setAttribute("info", heroInfo);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
