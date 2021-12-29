package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * acCount表册除一条记录
 */
public class jdbcDemo4 {
    public static void main(String[] args) {
        Statement stmt=null;
        Connection conn=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn= DriverManager.getConnection("jdbc:mysql:///db3","root","111111");
            //3.定义sql
            String sql ="delete from account where id=3";
            //4.获取执行sql的对象
            stmt =conn.createStatement();
            //执行sql
            int count=stmt.executeUpdate(sql);
            //处理结果
            System.out.println(count);
            if(count>0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //7释放资源
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
