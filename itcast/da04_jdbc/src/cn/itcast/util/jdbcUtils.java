package cn.itcast.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 */
public class jdbcUtils {
    /**
     * 只有静态属性才能被静态代码块、方法访问
     */
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    /**
     * 文件的读取只需要一次就能拿到值。使用静态代码块
     */
    static {
        //读取资源文件，获取值

        try {
            //1.创建Properties集合
            Properties pro =new Properties();
            //.获取src下的路径的方法------>ClassLoader 类加载器
            ClassLoader classLoader=jdbcUtils.class.getClassLoader();
            URL res =classLoader.getResource("jdbc.properties");
            String path=res.getPath();
//            System.out.println(path);

            //2.加载文件
            //----pro.load(new FileReader("src/jdbc.Properties"));
            pro.load(new FileReader(path));
            //3.获取数据，赋值
            url=pro.getProperty("url");
            user=pro.getProperty("user");
            password=pro.getProperty("password");
            driver=pro.getProperty("driver");
            //4.注册驱动

            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     * @return连接对象
     */
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url,user,password);
    }

    /**
     * 释放资源
     * @param stmt
     * @param conn
     */
    public static void close (Statement stmt,Connection conn){

        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close (ResultSet rs, Statement stmt, Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
