package cn.itcast.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
 * Druid连接池工具类
 * */
public class jdbcUtils {
    //1.定义成员变量DataSource
    private static DataSource ds;

    static {

        try {
            //1.加载配置文件
            Properties pro = new Properties();
            pro.load(jdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //2.获取
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 获取连接
     * */
    public static Connection getConnection() throws Exception {
        return ds.getConnection();
    }

    /*
     * 释放资源
     * */
    public static void close(Statement stmt, Connection coon) {
//        if(stmt!=null){
//            try {
//                stmt.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        if(coon!=null){
//            try {
//                stmt.close();//归还链接
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        close(null, stmt, coon);

    }

    public static void close(ResultSet rs, Statement stmt, Connection coon) {
        if (rs != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (coon != null) {
            try {
                stmt.close();//归还链接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    /**
     * 获取连接方法
     */
    public static DataSource getDataSource(){
        return ds;
    }
}
