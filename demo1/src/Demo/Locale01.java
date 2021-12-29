package Demo;

import java.util.Locale;
import java.util.ResourceBundle;

public class Locale01 {
    public static void main(String[] args) {
        ResourceBundle resource =ResourceBundle.getBundle("Runtime1");
        String val =resource.getString("info");
        System.out.println(val);
    }
}
/*
* 提供有一个专门描述区域和语言编码的类:Locale，而后主要可以使用Locale类中的两个构造方法
*   ·构造方法: public Locale(StringDemo language);//国家
*   ·构造方法: public Locale(StringDemo language, StringDemo country);//国家//语言
*   而中文的代码:zh_CN、美国英语的代码: en_US
*   代码案例:Locale loc =new Locale("zh","CN");//中文环境
           System.out.println(loc);
*如果说现在要想自动获得当前的运行环境，那么现在就可以利用Locale类本身
*       ·读取本地默认环境: public static Locale getDefault():
*   代码案例:Locale loc =Locale.getDefault();//该方法获取当前的默认的语言环境
            System.out.println(loc);
* 在实际的开发过程之中，很多人可能并不关心国家和语言的编码，所以为了简化开发，Locale也将世界上一些比较著名的国家
* 设置为了常量
*   代码案例:Locale loc =Locale.CHINA;//使用常量获取语言环境
           System.out.println(loc);
*使用常量的优势在于可以避免一些区域编码信息的繁琐。
*
* */
/*
* 课时44 ResourceBundle读取资源文件
*       java.util. ResourceBundle类完成，此类定义如下:
*       public abstract class ResourceBundle extends Object.
*ResourceBundle是一个抽象类，如果说现在要想进行此类对象的实例化可以直接利用该类中提供的一个static方法完成
*       ·获取ResourceBundle类对象:public static final ResourceBundle getBundle(StringDemo baseName);
*          - baseName:描述的是资原文件的名称，但是没有后缀( cn.mldn.message.Messages);
*       ·根据key 读取资源内容: public final StringDemo getString(StringDemo key);
*如果资源没有放在包里面，则直接编写资源名称即可。
*靠资源文件、Locale、ResourceBundle类就可以实现国际化的.那么下面来进行国际化的程序实现（核心关键:读取资源信息)。
* 1、在CLASSPATH 下建立: cn.mldn.message.Messages_zh_CN.properties;
*
*
* */