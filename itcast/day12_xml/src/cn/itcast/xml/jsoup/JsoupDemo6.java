package cn.itcast.xml.jsoup;
/*
* jsoup快速入门
* */

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.List;

//Xpath查询的功能
public class JsoupDemo6 {
    public static void main(String[] args) throws Exception {
        //1.获取student.xml的path
        String path = JsoupDemo6.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.根据document对象,创建JXDocument对象
        JXDocument jxDocument = new JXDocument( document);
        //4.结合xpath语法查询
        //4.1查询所有student标签
        List<JXNode> JxNodes =jxDocument.selN(  "//student" );
        for (JXNode jxNode:JxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("-----------------------");
        //4.2查询所有student标签下的name标签
        List<JXNode> JxNodes2 =jxDocument.selN(  "//student/name" );
        for (JXNode jxNode:JxNodes) {
            System.out.println(jxNode);
        }
        //4.3查询student标签下带有id属性的name标签
        List<JXNode> JxNodes3 =jxDocument.selN(  "//student/name[@id]" );
        for (JXNode jxNode:JxNodes) {
            System.out.println(jxNode);
        }
        //4.4查询student标签下带有id属性的name标签并且id属性值为itcast
        List<JXNode> JxNodes4 =jxDocument.selN(  "//student/name[@id='itcast']" );
        for (JXNode jxNode:JxNodes) {
            System.out.println(jxNode);
        }


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