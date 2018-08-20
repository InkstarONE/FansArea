package com.zh.zy;

import DataSource.MyDataSource;
import jdbc.C3P0Utils;
import jdbc.JDBCUtils_V1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@WebServlet(name = "releaseServlet")
public class releaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
         String p_materials = request.getParameter("name");
         String number = request.getParameter("number");
        int p_number = Integer.parseInt(number);
         String budget = request.getParameter("money");
         int p_budget = Integer.parseInt(budget);

        String deadline =  request.getParameter("date");
        System.out.println(deadline);
        String dateStr = null;
        if(deadline != null && !("".equals(deadline.trim()))){
            try {
                Date p_date = new SimpleDateFormat("yyyy-MM-dd").parse(deadline);
                dateStr = new SimpleDateFormat("yyyy-MM-dd").format(p_date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        String p_address = request.getParameter("address");
         String p_detail = request.getParameter("describe");
         String Kind = request.getParameter("kind");
         int kind = Integer.parseInt(Kind);
        String pid = (String) request.getSession().getAttribute("userName");
        int p_id = Integer.parseInt(pid);
         int sORp = 0;

        request.setCharacterEncoding("UTF-8");


        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        Connection conn = null;
        PreparedStatement pstmt = null;




        if (Kind == null || p_materials == null || number == null || budget == null
                || pid ==null || dateStr == null || p_address ==null || p_detail == null) {
            response.sendRedirect("isNULL.jsp");
        } else {


//添加使用未改造过的connection


        // 1.创建自定义连接池对象
      //  MyDataSource dataSource = new MyDataSource();
         //   Class.forName("com.mysql.jdbc.Driver");
            try {
                // 2.从池子中获取连接
                //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/purchase_InformationOrderMsg?useUnicode=true&characterEncoding=utf-8","root","root");



                conn = JDBCUtils_V1.getConnection();
                String sql ="INSERT INTO t_purchase(p_kind,p_materials,p_number,p_createdate,p_budget," +
                        "id,p_deadline,p_adress,p_detail,sORp,p_orderNumbers) VALUES(?,?,?,now(),?" +
                        ",?,?,?,?,?,?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, kind);
                pstmt.setString(2,p_materials);
                pstmt.setInt(3,p_number);
                pstmt.setInt(4,p_budget);
                pstmt.setInt(5,p_id);
                pstmt.setString(6, dateStr);
                pstmt.setString(7,p_address);
                pstmt.setString(8,p_detail);
                pstmt.setInt(9,sORp);
                pstmt.setString(10,uuid);
                pstmt.executeUpdate();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                JDBCUtils_V1.release(conn,pstmt,null);
            }

        response.sendRedirect("releaseOK.jsp");
    }}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
