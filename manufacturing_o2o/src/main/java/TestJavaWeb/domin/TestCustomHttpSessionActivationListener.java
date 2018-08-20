package TestJavaWeb.domin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class TestCustomHttpSessionActivationListener extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Custom custom = new Custom();

        custom.setId(1);
        custom.setName("custom");

        session.setAttribute("custom",custom);
        System.out.println("custom  放到session中去"+ custom.getName());
    }
}
