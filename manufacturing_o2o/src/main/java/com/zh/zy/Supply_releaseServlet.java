package com.zh.zy;

import DataSource.MyDataSource1;
import jdbc.C3P0Utils;
import jdbc.JDBCUtils_V1;
import jdbc.JDBCUtils_V2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@WebServlet(name = "Supply_releaseServlet")
public class Supply_releaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String p_materials = request.getParameter("name");
        int  p_number = 0;
        int p_budget = 0;
        String deadline =  request.getParameter("date");
        System.out.println(deadline);
        String dataStr = null;
        if (deadline != null && !("".equals(deadline.trim()))){
            try {
                Date s_date = new SimpleDateFormat("yyyy-MM-dd").parse(deadline);
                dataStr = new SimpleDateFormat("yyyy-MM-dd").format(s_date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        String p_address = request.getParameter("address");
        String p_detail = request.getParameter("describe");
        String Kind = request.getParameter("kind");
        String pid = (String) request.getSession().getAttribute("userName");
        int p_id = Integer.parseInt(pid);
        int sORp = 1;  //1为供应  0为买
        int kind = Integer.parseInt(Kind);


        request.setCharacterEncoding("UTF-8");

        //使用java 中的UUId生成订单号
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);



        if (Kind == null || p_materials == null
                || pid ==null || dataStr == null || p_address ==null || p_detail == null) {
            response.sendRedirect("isNULL.jsp");
        } else {




//添加使用改造过的connection
        Connection conn = null;
        PreparedStatement pstmt = null;

//            Class.forName("com.mysql.jdbc.Driver");
         //   conn = JDBCUtils_V2.getConnection();
        // 1.创建自定义连接池对象
     //   MyDataSource1 dataSource = new MyDataSource1();
            try {
                // 2.从池子中获取连接
                conn = JDBCUtils_V1.getConnection();
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/purchase_InformationOrderMsg?useUnicode=true&characterEncoding=utf-8","root","root");
                String sql ="INSERT INTO t_purchase(p_kind,p_materials,p_number,p_createdate,p_budget,id,p_deadline,p_adress,p_detail,sORp,p_orderNumbers) VALUES(?,?,?,now(),?,?,?,?,?,?,?)";
// 获取执行sql语句对象
                //3.必须在自定义的connection类中重写prepareStatement(sql)方法
                pstmt = conn.prepareStatement(sql);
 //                PreparedStatement ps = conn.prepareStatement(sql);
                pstmt.setInt(1, kind);
                pstmt.setString(2,p_materials);
                pstmt.setInt(3,p_number);

                pstmt.setInt(4,p_budget);
                pstmt.setInt(5,p_id);
                pstmt.setString(6,dataStr);
                pstmt.setString(7,p_address);
                pstmt.setString(8,p_detail);
                pstmt.setInt(9,sORp);
                pstmt.setString(10,uuid);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally {
                JDBCUtils_V1.release(conn,pstmt,null);
        }
        response.sendRedirect("releaseOK.jsp");
    }}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
