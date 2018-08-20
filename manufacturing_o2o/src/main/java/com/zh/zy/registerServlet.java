package com.zh.zy;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sun.org.apache.regexp.internal.RE;
import jdbc.C3P0Utils;
import jdbc.JDBCUtils_V1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import javax.servlet.http.HttpSession;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class registerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
    double dmin = Double.POSITIVE_INFINITY;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException, UnsupportedEncodingException {

        System.out.println("serlet1 kasih");;
        resp.sendRedirect(request.getContextPath()+"/servlet2");
      //  request.getRequestDispatcher("/servlet2").forward(request,resp);

//        String path= getServletContext().getRealPath("/zz.jsp");
//        System.out.println(path);
//
//        String path1= getServletContext().getRealPath("/WEB-INF/web.xml");
//        System.out.println(path1);
//        resp.setContentType("zz/jsp");
//        PrintWriter out = resp.getWriter();
//        out.print("test init param");
//
//        java.util.Enumeration ee = getServletConfig().getInitParameterNames();
//        while (ee.hasMoreElements()){
//            out.println(ee.nextElement());
//        }
//        out.println(getServletConfig().getInitParameter("adminEmail"));
//        String sss = getServletConfig().getInitParameter("adminEmail");
//        System.out.println(sss);
//
//
//        request.setCharacterEncoding("UTF-8");
//        String username = request.getParameter("username");
//        String password = request.getParameter("rpassword");
//        String confirmPassword = request.getParameter("confirmPassword");
//        String sqlusername = null;
//
//
//        String tel = request.getParameter("tel");
//        String my_auth = request.getParameter("auth");
//
//        int my_vip = 0;
//        double my_wallat = 0;
//
//        request.setCharacterEncoding("UTF-8");
//
//
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        if (username == null || password == null || confirmPassword == null || tel == null || my_auth == null) {
//            resp.sendRedirect("isNULL.jsp");
//        } else {
//
//
//            //c3p0不用工具类方式
//            // ComboPooledDataSource dataSource = new ComboPooledDataSource();//ComboPooledDataSource()可写参数制定那个数据库连接
//
//
//            // Class.forName("com.mysql.jdbc.Driver");
//            try {
//                //使用工具类
//                conn = C3P0Utils.getConnection();
//                ResultSet rs = null;
//                String sql = "SELECT username FROM board.t_user WHERE username='" + username + "'";
//                pstmt = conn.prepareStatement(sql);
//                rs = pstmt.executeQuery();
//                while (rs.next()) {
//                    sqlusername = rs.getString("username");
//                }
//                if (sqlusername == null) {
//                    sql = "INSERT INTO t_user(username,password,tel,my_vip,my_wallet,my_auth) VALUES(?,password(?),?,?,?,?)";
//                    pstmt = conn.prepareStatement(sql);
//                    pstmt.setString(1, username);
//                    pstmt.setString(2, password);
//                    pstmt.setString(3, tel);
//                    pstmt.setInt(4, my_vip);
//                    pstmt.setDouble(5, my_wallat);
//                    pstmt.setString(6, my_auth);
//                    request.getSession().setAttribute("registerMsg", "注册成功");
//                    pstmt.executeUpdate();
//                } else {
//                    System.out.println("您已经注册过");
//                    request.getSession().setAttribute("registerMsg", "你已经注册过了");
//                }
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            } finally {
//                JDBCUtils_V1.release(conn, pstmt, null);
//            }
//            resp.sendRedirect("registerMsg.jsp");
//        }
//



    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}