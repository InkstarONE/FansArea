package com.zh.zy;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        Cookie[] cookie = req.getCookies();

        if (cookie != null){
            for (int i = 0; i < cookie.length; i++){
                Cookie cookie1 = cookie[i];
                if (cookie1.getName().equals("name")){
                    String name =cookie1.getValue();
                    out.println("hello "  +  name);
                    break;
                }
            }
        }
    }

}
