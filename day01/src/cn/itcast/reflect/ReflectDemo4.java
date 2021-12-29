package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.Properties;
/*
*框架类
*
*  */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1创建对象
        Properties pro=new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader=ReflectTest.class.getClassLoader();
        InputStream is=classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //获取配置文件中的定义的数据
        String className=pro.getProperty("className");
        String methodName=pro.getProperty("methodName");
        //3.加载该类进行内存，
        Class cls=Class.forName(className);
        //4.创建对象
        Object obj=cls.newInstance();
        //5.获取方法对象
        Method method=cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);

    }
}
