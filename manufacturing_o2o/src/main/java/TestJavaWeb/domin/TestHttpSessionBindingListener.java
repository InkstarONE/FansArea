package TestJavaWeb.domin;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class TestHttpSessionBindingListener extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person p = new Person();
        HttpSession session = req.getSession();

        p.setId("1111");
        p.setName("hahaa  bingbingb");

        session.setAttribute("person",p);


        session.removeAttribute("person");
    }
}
