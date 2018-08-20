package jdbc;

import javax.xml.transform.Result;
import java.sql.*;

//提供获取连接和释放资源的 方法
public class JDBCUtils_V1 {
    //获取链接
    public static Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/purchase_InformationOrderMsg?useUnicode=true&characterEncoding=utf-8", "root", "root");
        } catch (Exception e){
            e.printStackTrace();
        }

        return  conn;
    }

    public  static void release(Connection conn, PreparedStatement pstmt, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (pstmt != null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
