package Demo01;
import  java.io.File;
import  java.io.FileOutputStream;
import java.io.FileWriter;
import  java.io.PrintWriter;
import java.io.BufferedReader;
import  java.io.InputStreamReader;
public class CharacterEncoding {
    public static void main(String[] args)throws Exception {
       BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
       System.out.print("请输入你的年龄");
       String msg =input.readLine();//接收输入信息
        if(msg.matches("\\d{1,3}")){//是否由数字组成
            int age =Integer.parseInt(msg);
            System.out.println("年龄为:"+age);
        }else{
            System.out.println("请确保你看懂了我的提示，不要随意输入");
        }

    }
}
/*
* 课时80 字符编码
*那么在实际的开发之中对于常用的编码有如下几种:
*       .GBK/GB2312:国标编码，可以描述中文信息，而GBK之，而GBK包含有简体中文与繁体中文;
*       ·ISO8859-1:国际通用编码，可以用其描述所有的字母信息;
*
* */
/*
* 课时81 内存操作流
*   ·字节内存操作流: ByteArrayOutputStream、ByteArrayInputStream;
*
*课时83 RandomAccessFile
*
* */