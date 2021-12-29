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
public class JsoupDemo3 {
    public static void main(String[] args) throws Exception {
        //2.1获取student.xml的path
        String path=JsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.获取元素对象了。
        //3.1获取所有student对象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);

        System.out.println("----------------------------------");
       //3.2获取获取属性名为id的元素对象们
        Elements elements1=document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("----------------------------------");
        //3.2获取number属性值
        Elements elements2=document.getElementsByAttributeValue("number","s001");
        System.out.println(elements2);
        //3.3获取id属性值的元素对象
        System.out.println("----------------------------------");
        Element itcast=document.getElementById("itcast");
        System.out.println(itcast);

    }
}
