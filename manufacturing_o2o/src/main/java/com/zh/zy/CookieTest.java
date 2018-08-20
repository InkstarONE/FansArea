package com.zh.zy;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("name");

        Cookie cookie = new Cookie("name",name);

        cookie.setMaxAge(30*60);

        resp.addCookie(cookie);

        RequestDispatcher view = req.getRequestDispatcher("/cookieresult.jsp");
        view.forward(req,resp);
    }


}
