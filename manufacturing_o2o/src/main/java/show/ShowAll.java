package show;

import DataSource.MyDataSource;
import beans.UserAndPurchase;
import jdbc.C3P0Utils;
import jdbc.JDBCUtils_V1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowAll {
    public ArrayList<UserAndPurchase> AlluserAndPurchases(){
        ArrayList<UserAndPurchase> userAndPurchasesList = new ArrayList<UserAndPurchase>();
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
        conn = C3P0Utils.getConnection();
        String sql = "SELECT * FROM board.t_user u, purchase_InformationOrderMsg.t_purchase pu";
        psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (rs.next()){
                UserAndPurchase userAndPurchase = new UserAndPurchase();
                userAndPurchase.setUsername(rs.getString("username"));
                userAndPurchase.setTel(rs.getString("tel"));
                userAndPurchase.setMy_vip(rs.getInt("my_vip"));
                userAndPurchase.setMywallet(rs.getDouble("my_wallet"));
                userAndPurchase.setMy_auth(rs.getString("my_auth"));
                userAndPurchase.setP_kind(rs.getInt("p_kind"));
                userAndPurchase.setP_materials(rs.getString("p_materials"));
                userAndPurchase.setP_number(rs.getInt("p_number"));
                userAndPurchase.setP_createdate(rs.getString("p_createdate"));
                userAndPurchase.setP_budget(rs.getInt("p_budget"));
                userAndPurchase.setP_id(rs.getString("id"));
                userAndPurchase.setP_deadline(rs.getString("p_deadline"));
                userAndPurchase.setP_adress(rs.getString("p_adress"));
                userAndPurchase.setP_detail(rs.getString("p_detail"));
                userAndPurchase.setsORp(rs.getInt("sORP"));
                userAndPurchase.setP_orderNumbers(rs.getString("p_orderNumbers"));
                userAndPurchasesList.add(userAndPurchase);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils_V1.release(conn,psmt,rs);
        }

        return userAndPurchasesList;
    }
}
