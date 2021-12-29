package Demo01;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Writer_1 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:"+ File.separator + "hello"+ File.separator +
                "mldn.txt" );
        if (!file.getParentFile().exists()) {
            file.getParentFile( ).mkdirs(); //父目录必须存在
        }
        Writer out =new FileWriter(file,true);
        String str ="www.mldn.cn\r\n";
        out.write(str);
        out.append("中国人民万岁");//追加输出的内容
        out.close();
    }
}
/*
* 课时75 Writer字符输出流
* 使用OutputStream字节输出流进行数据输出的时候使用的都是字节类型的,数据，而很多的情况下字符串的输出是比较方便的，
*所以对于java.io包而言，在JDK1.1的时候又推出了字符输出流:Writer
*public abstract class Writer extendls Object implements Appendable, Closeable,Flushable.
*在 Writer类里面提供有许多的输出操作方法，重点来看两个:。
*       ·输出字符数组:public void write(char[]cbuf) throws IOException;
*       ·输出字符串:public void write(StringDemo str) throws IOException;
*使用Writer输出的最大优势在于可以直接利用字符串完成。Writer是字符流，字符处理的优势在于中文数据上。。
* */