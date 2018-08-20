package Filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.Filter;

public class TestOneFilter implements javax.servlet.Filter {

    private FilterConfig fc;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.fc = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("run run run111");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String name = httpServletRequest.getRemoteUser();
        System.out.println(fc.getFilterName());
        System.out.println(fc.getInitParameter("LogFilterName"));
        System.out.println(fc.getServletContext());
        if (name != null){
            fc.getServletContext().log("user~~~~"+ name);
            System.out.println("haahah");
        }
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
