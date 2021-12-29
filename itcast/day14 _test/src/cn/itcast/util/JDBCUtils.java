package cn.itcast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

/*
* JDBC工具类使用Durid连接池
* */
public class JDBCUtils {
    private static DataSource ds;//
    static {
        try {
        //1.加载配置文件
        Properties pro=new Properties();
        //使用ClassLoader加载配置文件，获取字节输入流
        InputStream is =JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            //2.初始化连接池
            ds=DruidDataSourceFactory.createDataSource(pro);

        pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /*
    * 1获取连接池对象
    * */

    public static DataSource getDataSource(){
        return  ds;
    }
    /*
    * 2.获取connection对象
    * */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
