package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *account表添力加——条记录insert语句
 */

public class jdbcDemo2 {
    public static void main(String[] args) {
        Statement stmt=null;
        Connection conn=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql="insert into account values(null,'王五','3000')";
            //3.获取connection对象
            conn =DriverManager.getConnection("jdbc:mysql:///db3","root","111111");
            //4.获取执行的sql的对象 statement
            stmt=conn.createStatement();
            //5.执行SQL
            int count=stmt.executeUpdate(sql);//影响的行数
            //6.处理结果
            System.out.println(count);
            if(count>0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //7,释放资源
            //stmt.close();
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
