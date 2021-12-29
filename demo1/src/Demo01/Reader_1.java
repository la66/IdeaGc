package Demo01;
import java.io.*;

public class Reader_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:"+ File.separator +
                "hello" + File.separator + "mldn.txt" );
        if(file.exists()){//文件存在则读取
            Reader in=new FileReader(file);//实例化对象
            char data[]=new char[1024];//开辟数组
            int len =in.read(data);
            System.out.println("读取类容："+new String(data,0,len));
            in.close();
        }
    }
}
/*
*课时76 Reader字符输入流
* 字符输入流:Reader.
* Reader是实现字符输入流的一种类型，其本身属于一个抽象类，这个类定义如下：
* ·接收数据: public int read(char[] cbuf) throws IOException;

* */
/*
* 课时77 字节流与字符流的区别
*
* */