package cn.itcast.jdbc;

import cn.itcast.util.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 练习
 * 需求:
 * 1.通过键盘录入用户名和密码
 * 2.判断用户是否登录成功
 */
public class jdbcDemo9 {
    /*
     * 登录方法
     * */
    public boolean login(String username, String password) {
        if (username == null && password == null) {
            return false;
        }
        //连接数据库判断是否成功
        Connection conn=null;
        Statement stmt =null;
        ResultSet rs=null;
        //1.获取连接
        try {
            conn= jdbcUtils.getConnection();
            //2.定义sql语句
            String sql = "select * from user where username = '"+username+ "'and password ='"+password+"'";
            //3.获取执行sql的对象
            stmt =conn.createStatement();
            //4.执行查询
            rs=stmt.executeQuery(sql);
            //5.判断
//            if(rs.next()){//如果有下一行则返回true
//                return true;
//            }else{
//                return false;
//            }
            return rs.next();//如果有下一行则返回true
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.close(rs,stmt,conn);
        }
        return false;
    }
    /*
     * 登录方法
     * */
    public boolean login2(String username, String password) {
        if (username == null && password == null) {
            return false;
        }
        //连接数据库判断是否成功
        Connection conn=null;
        Statement stmt =null;
        ResultSet rs=null;
        PreparedStatement pstmt=null;
        //1.获取连接
        try {
            conn= jdbcUtils.getConnection();
            //2.定义sql语句
            String sql = "select * from user where username = ? and password=?";
            //3.获取执行sql的对象
            pstmt=conn.prepareStatement(sql);
            //给?问好赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //---->stmt =conn.createStatement();
            //4.执行查询,不需要传参
            rs=pstmt.executeQuery();
            //5.判断
//            if(rs.next()){//如果有下一行则返回true
//                return true;
//            }else{
//                return false;
//            }
            return rs.next();//如果有下一行则返回true
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.close(rs,pstmt,conn);
        }
        return false;
    }
    public static void main(String[] args) {
        //1.键盘录入，接收用户名密码
        Scanner sc =new Scanner(System.in);
        System.out.println("请入用户名");
        String username =sc.nextLine();
        System.out.println("请入密码");
        String password =sc.nextLine();
        //2.调用方法
        boolean flag=new jdbcDemo9().login2(username,password);
        //3.判断结果，输出不同语句
        if(flag){
            System.out.println("登录成功");
        }else {
            System.out.println("密码错误登陆失败");
        }
    }
}
