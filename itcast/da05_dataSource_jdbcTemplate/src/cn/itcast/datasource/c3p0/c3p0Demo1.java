package cn.itcast.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
* c3p0的演示
* */
public class c3p0Demo1 {
    public static void main(String[] args) throws Exception {
        //1.创建数据库连接对象
        DataSource ds = new ComboPooledDataSource();
        //2.获取连接对象
        Connection coonn =ds.getConnection();
        //3.大印
        System.out.println(coonn);
    }
}
