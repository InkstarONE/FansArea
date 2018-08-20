package com.zh.zy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletContext;

import static java.lang.System.out;

public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
    double dmin = Double.POSITIVE_INFINITY;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException, UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");



        if (username == null || password == null ) {
            resp.sendRedirect("isNULL.jsp");
        } else {

        Connection conn = null;
        Statement stat = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/board?useUnicode=true&characterEncoding=utf-8","root","root");
            stat = conn.createStatement();
            String sql = "select username from t_user where username= "+username+" and password=password("+password+")";
            ResultSet rs =  (ResultSet) stat.executeQuery(sql);

            int rowCount = 0;
            while(rs.next()) {
                rowCount++;
            }


            if(rowCount >0 ){
                request.getSession().setAttribute("userName",username);
                request.getSession().setAttribute("password",password);
                out.print("登入成功");
                request.getSession().setAttribute("loginMsg","登入成功");
                resp.sendRedirect("purchase_InformationOrderMsg.jsp");
            }else{

                out.println("登陆失败");
                request.getSession().setAttribute("loginMsg","登入失败");
                resp.sendRedirect("loginMsg.jsp");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn !=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }


    }}
    @Override
    public void init() throws ServletException {
        super.init();
    }
}