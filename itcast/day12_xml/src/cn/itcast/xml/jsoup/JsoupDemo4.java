package cn.itcast.xml.jsoup;
/*
* jsoup快速入门
* */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;

//Document对象功能
public class JsoupDemo4 {
    public static void main(String[] args) throws Exception {
        //1.获取student.xml的path
        String path= JsoupDemo4.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");

        //通过Document对象获取name标签，获取所有的name标签，可以获取到两个
        Elements elements=document.getElementsByTag("name");
        System.out.println(elements.size());
        System.out.println("-----------------------------");
        //通过Elenent对象获取子标签对象
        Element element_student=document.getElementsByTag("student").get(0);
        Elements ele_name=element_student.getElementsByTag("name");
        System.out.println(ele_name.size());

        //获取student
        System.out.println("-----------------------------");
        String number=element_student.attr("number");
        System.out.println(number);
        //获取文本内容
        System.out.println("-----------------------------");
        String text= ele_name.text( );
        String html = ele_name.html();
        System.out.println(text);
        System.out.println(html);

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