package show;

import beans.User;

import java.sql.*;
import java.util.ArrayList;


import java.sql.*;
import java.util.ArrayList;


public class ShowUser {



    public ArrayList<User> Allusers() throws Exception {
        Connection conn = null;
        ArrayList<User> userList= new ArrayList<User>();
        try {
            //获取连接
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/board?useUnicode=true&characterEncoding=utf-8","root","root");
            // 运行SQL语句
            String sql = "SELECT * from t_user";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                //实例化VO
                User user = new User();
                user.setName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setTel(rs.getString("tel"));
                user.setMy_vip(rs.getInt("my_vip"));
                user.setMy_wallet(rs.getDouble("my_wallet"));
                user.setMy_auth(rs.getString("my_auth"));
                userList.add(user);
            }
            rs.close();
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {// 关闭连接
                if (conn != null) {
                    conn.close();
                    conn = null;
                }
            } catch (Exception ex) {
            }
        }
        return userList;
    }
}
