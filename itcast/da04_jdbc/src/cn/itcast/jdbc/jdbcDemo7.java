package cn.itcast.jdbc;

import java.sql.*;

public class jdbcDemo7 {
    public static void main(String[] args) {
        Statement stmt=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn= DriverManager.getConnection("jdbc:mysql:///db3","root","111111");
            //3.定义sql
            String sql ="select * from account";
            //4.获取执行sql的对象
            stmt =conn.createStatement();
            //5.执行sql
            rs =stmt.executeQuery(sql);
            //6处理结果
            //6.1让游标下移一行
            while (rs.next()) {//循环判断游标是否是最后一行末尾。
                //6.2获取数据(一行一行的获取)
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);
                System.out.println(id + "---" + name + "---" + balance);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //7释放资源
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
