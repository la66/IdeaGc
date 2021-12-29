package cn.itcast.datasource.druid;

import cn.itcast.utils.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
* 使用新的工具类
* */
public class DruidDemo2 {
    public static void main(String[] args) {
        /*
        完成添加操作，给account表添加一条记录
        * */
        Connection conn=null;
        PreparedStatement pstmt =null;
        try {
            //1.获取连接
            conn= jdbcUtils.getConnection();
            //2.定义sql
            String sql = "insert into account values(3,?,?)";
            //3.获取pstmt对象
            pstmt =conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000);
            //5.执行sql
           int count =pstmt.executeUpdate();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //释放资源
            jdbcUtils.close(pstmt,conn);
        }
    }
}
