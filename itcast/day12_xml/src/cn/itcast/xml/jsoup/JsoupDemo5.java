package cn.itcast.xml.jsoup;
/*
* jsoup快速入门
* */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;

//选择其的查询的功能
public class JsoupDemo5 {
    public static void main(String[] args) throws Exception {
        //1.获取student.xml的path
        String path= JsoupDemo5.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");

       //3.查询name标签
        Elements elements=document.select("name");
        System.out.println(elements);

        //4查询id值的元素
        System.out.println("-----------------");
        Elements elements1 =document.select("#itcast");
        System.out.println(elements1);
        System.out.println("-----------------");
        //5.
        //5.1获取student标签并且number属性值为heima_00e1
        Elements elements2=document.select("student[number='s001']");
        System.out.println(elements2);
        System.out.println("-----------------");
        //5.2获取student标签并且number属性值为heima_0o01的age子标签
        Elements elements3=document.select("student[number='s001']>age");
        System.out.println(elements3);
    }
}
/*
* 3.Elements :元秦Element对象的集合。可以当做ArrayList<Element>来使用
* 4. Element :元秦对象
*       1，获取子元秦对象
*           getElementById(string id)︰根据id属性值获取唯一的element对象
*           *getElementsByTag(string tagName):根据标签名称获取元秦对象集合
*           *getElementsByAttribute(string key):根据属性名称获取元秦对象集合
*           *getElementsByAttributevalue(String key，string value):根据对应的属性名和属性值获取元秦对象集合
*       2.获取属性值
*           *string attr( string key)∶根据属性名称获取属性值
*       3．获取文本内容
*           *string text(:获取文本内容
*           *string html():获取标签体的所有内容(包括字标签的字符串内容)
*5.Node:节点对象
*
*
* */