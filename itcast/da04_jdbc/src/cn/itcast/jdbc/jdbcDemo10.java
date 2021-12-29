package cn.itcast.jdbc;

import cn.itcast.util.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 事务操作
 * */
public class jdbcDemo10 {
    public static void main(String[] args) {
        Connection coon = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //1.获取连接
            coon = jdbcUtils.getConnection();
            //开启事务
            coon.setAutoCommit(false);
            //2.设置sql
            //2.1张三-500
            String sql1 = "update account set balance = balance - ? where id = ?";
            //2.2李四+500
            String sql2 = "update account set balance = balance + ? where id = ?";
            //3.获取执行sql
            pstmt1 = coon.prepareStatement(sql1);
            pstmt2 = coon.prepareStatement(sql2);
            //4.设置参数
            pstmt1.setDouble(1, 500);
            pstmt1.setInt(2, 1);
            pstmt2.setDouble(1, 500);
            pstmt2.setInt(2, 2);
            //执行sql
            pstmt1.executeUpdate();
            //手动自造异常
            int i = 3 / 0;
            pstmt2.executeUpdate();

            //提交事务
            coon.commit();
        } catch (Exception e) {
            //事务回滚
            try {
                if (coon != null) {
                    coon.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            jdbcUtils.close(pstmt1, coon);
            jdbcUtils.close(pstmt2, null);
        }
    }
}
