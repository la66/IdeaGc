package Demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Flow_2 {
    private static int len;

    public static void main(String[] args) throws Exception {
        File file =new File("d:"+File.separator+"hello"+
                File.separator+"mldn.txt");//1、指定要操作的文件的路径
        InputStream input =new FileInputStream(file);
        byte data[]=new byte[1024];//开辟一个缓冲区读取数据
        input.read(data);//读取数据，数据全部保存在字节数组之中，返回读取个数
        System.out.println("【"+new String(data,0,len)+"】");
        input.close();
    }
}
/*
*课时74 InputStream字节输入流
* 与OutputStream类对应的一个流就是字节输入流，InputStream类主要实现的就是字
* public abstract class InputStream extends Object implements Closeable.
* 在 InputStream类里面定义有如下的几个核心方法:
* public abstract int read() throws IOException.读取单个字节数据
* public int read(byte[] b) throws IOException.读取一组字节数据.
* public int read(byte[] b, int off, int len) throws IOException 读取一组字节数据（只占数组的部分）。
*
* InputStream类属于一个抽象类，这时应该依靠它的子类来实例化对象，如果要从文件读取一定使用FileInputStream子类;
*对于字节输入流里面最为麻烦的问题就在于:使用read()方法读取的时候只能够以字节数组为主进行接收。
*j增加了一个新的方法: public byte[] readAllBytes() throws IOException;.
* */
