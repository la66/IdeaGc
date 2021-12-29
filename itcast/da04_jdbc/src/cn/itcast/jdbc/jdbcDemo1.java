package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * jdbc快速入门
 */
public class jdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库的连接对象
        Connection conn=DriverManager.getConnection("jdbc://mysql://localhost:3306/dbc","root","111111");
        //4.定义sql语句
        String sql="";
        //5.获取执行sal的对象Statement
        Statement stmt=conn.createStatement();
        //6.执行sql语句
        int count=stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();


    }
}
