package show;

import beans.purchase;
import jdbc.JDBCUtils_V1;

import java.sql.*;
import java.util.ArrayList;

public class show_purchase {
    public ArrayList<purchase> Allpurchase() throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<purchase> purList= new ArrayList<purchase>();
        try {
            //1.获取连接
            conn = JDBCUtils_V1.getConnection();
//            Class.forName("com.mysql.jdbc.Driver");
           // conn = DriverManager.getConnection("jdbc:mysql://localhost/purchase_InformationOrderMsg?useUnicode=true&characterEncoding=utf-8","root","root");
            // 2.编写sql语句
            String sql = "SELECT p_kind,p_materials,p_number,p_createdate,p_budget,id,p_deadline,p_adress," +
                    "p_detail,sORp,p_orderNumbers from t_purchase";
            // 3.获取执行sql语句对象
//            Statement stat = conn.createStatement();
//            ResultSet rs = stat.executeQuery(sql);
            pstmt = conn.prepareStatement(sql);

            // 5.执行查询操作
            rs = pstmt.executeQuery();
            while (rs.next()) {
                //实例化VO
                purchase pur = new purchase();
                pur.setKind(rs.getInt("p_kind"));
                pur.setMaterials(rs.getString("p_materials"));
                pur.setNumber(rs.getInt("p_number"));
                pur.setDate(rs.getDate("p_createdate"));
               pur.setBudget_amount(rs.getInt("p_budget"));
                pur.setId(rs.getInt("id"));
                pur.setDeadline(rs.getDate("p_deadline"));
                pur.setAdress(rs.getString("p_adress"));
                pur.setDetail(rs.getString("p_detail"));
                pur.setsORp(rs.getInt("sORp"));
                pur.setOrderNumbers(rs.getString("p_orderNumbers"));
                purList.add(pur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils_V1.release(conn,pstmt,rs);
        }
        return purList;
    }
}
