package cn.itcast.jdbc;

import cn.itcast.domain.Emp;
import cn.itcast.util.jdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
 */
public class jdbcDemo8 {
    /**
     * 查询所有的emp的对象
     * @return
     */
    public List<Emp> findAll(){
        ResultSet rs=null;
        Statement stmt=null;
        Connection conn=null;
        List<Emp> list=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn= DriverManager.getConnection("jdbc:mysql:///db3","root","111111");
            //3.定义sql
            String sql="select * from emp";
            //4.获取执行的aql对象
            stmt=conn.createStatement();
            //5.执行sql
            rs =stmt.executeQuery(sql);
            //6.便利结果集，封装对象，装载集合
            Emp emp=null;
            list=new ArrayList<Emp>();
            while (rs.next()){//如果有下一个
                //获取数据
                int id=rs.getInt("id");
                String ename=rs.getString("ename");
                int job_id = rs.getInt(  "job_id");
                int mgr = rs.getInt(  "mgr" ) ;
                Date joindate = rs.getDate(  "joindate" );
                double salary = rs.getDouble( "salary");
                double bouns = rs.getDouble(  "bonus");
                int dept_id=rs.getInt("dept_id");
                //创建emp对象,并赋值
                emp =new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bouns);
                emp.setDept_id(dept_id);
                //装在集合
                list.add(emp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt!=null){
                try {stmt.close();
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
        return list;
    }
    /**-------------------------------------------------------
     * 演示jdbc工具类
     * @return
     */
    public List<Emp> findAll2(){
        ResultSet rs=null;
        Statement stmt=null;
        Connection conn=null;
        List<Emp> list=null;
        try {
//            //1.注册驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //2.获取连接对象
            conn=jdbcUtils.getConnection();
            //conn= DriverManager.getConnection("jdbc:mysql:///db3","root","111111");
            //3.定义sql
            String sql="select * from emp";
            //4.获取执行的aql对象
            stmt=conn.createStatement();
            //5.执行sql
            rs =stmt.executeQuery(sql);
            //6.便利结果集，封装对象，装载集合
            Emp emp=null;
            list=new ArrayList<Emp>();
            while (rs.next()){//如果有下一个
                //获取数据
                int id=rs.getInt("id");
                String ename=rs.getString("ename");
                int job_id = rs.getInt(  "job_id");
                int mgr = rs.getInt(  "mgr" ) ;
                Date joindate = rs.getDate(  "joindate" );
                double salary = rs.getDouble( "salary");
                double bouns = rs.getDouble(  "bonus");
                int dept_id=rs.getInt("dept_id");
                //创建emp对象,并赋值
                emp =new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bouns);
                emp.setDept_id(dept_id);
                //装在集合
                list.add(emp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            if(rs!=null){
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(stmt!=null){
//                try {stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(conn!=null){
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
            jdbcUtils.close(rs,stmt,conn);
        }
        return list;
    }
    public static void main(String[] args) {
        List<Emp> list=new jdbcDemo8().findAll2();
        System.out.println(list);
        System.out.println(list.size());
    }
}
