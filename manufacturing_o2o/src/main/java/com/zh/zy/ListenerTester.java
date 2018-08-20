package com.zh.zy;

import beans.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ListenerTester extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("test listener<br>");
        out.println("<br>");

        Dog dog = (Dog) getServletContext().getAttribute("dog");

        out.println("dog breed is " + dog.getBreed());
    }

}
