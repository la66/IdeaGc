package Demo01;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Flow {
    public static void main(String[] args) throws Exception {
        File file =new File("d:"+File.separator+"hello"+
                File.separator+"mldn.txt");//1、指定要操作的文件的路径
        if(!file.getParentFile().exists()){//文件不存在
            file.getParentFile().mkdirs();//创建目录
        }
        try(OutputStream output =new FileOutputStream(file)) {//2、通过子类实例化
            String str = "www.mldn.cn";//要输出的文件类容
            output.write(str.getBytes());//3、将字符串变为字节数组
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*
* 课时72 流的基本概念
* 处理形式在java.io包里面提供有两类支持:
*       ·字节处理流:OutputStream（输出字节流)、InputStream (输入字节流).
*       ·字符处理流: Writer(输出字符流)、Reader(输入字符流)。
* 所有的流操作都应该采用如下统一的步骤进行，下面以文件处理的流程为例:
*       ·如果现在要进行的是文件的读写操作，则一定要通过File类找到一个
*       ·通过字节流或字符流的子类为父类对象实例化;
*       ·利用字节流或字符流中的方法实现数据的输入与输出操作;
*       ·流的操作属于资源操作，资源操作必须进行关闭处理。
* 课时73 OutputStream字节输出流
*       字节的数据是以byte类型为主实现的操作，在进行字节内容输出的时候可以使用OutputStream_类完成，这个类的基本定义如下：
*           public abstract class OutputStream extends Object implements Closeable,Flushable.
*首先可以发现这个类实现了两个接口，于是基本的对应关系如下:
*OutputStream类定义的是一个公共的输出操作标准，而在这个操作标准里面一共定义有三个内容输出的方法|
*      public abstract void write(int b) throws IOException ;输出单个字节数据
*      public void write(byte[] b) throws IOException.输出一组字节数据。
*      public void write(byte[] b, int off,int len) throws IOException.输出部分字节数据
*但是需要注意的一个核心问题在于:OutputStream类毕竟是一个抽象类，而这个抽象类如果要想获得实例化对象，按照传统的认识应该通过子类实例的向上转型完成。
*如果说现在要进行的是文件处理操作，则可以使用FileOutputStream子类;
*因为最终都需要发生向上转型的处理关系，所以对于此时的 FileOutputStream子类核心的关注点就可以放在构造方法:
*       ·【覆盖】构造方法: public FileOutputStream(File file) throws FileNotFoundException;
*       ·【追加】构造方法: public FileOutputStream(File file, boolean append)throws FileNotFoundException。
*
* File file =new File("d:"+File.separator+"hello"+
                File.separator+"mldn.txt");//1、指定要操作的文件的路径
        if(!file.getParentFile().exists()){//文件不存在
            file.getParentFile().mkdirs();//创建目录
        }
        OutputStream output =new FileOutputStream(file);//2、通过子类实例化
        StringDemo str="www.mldn.cn";//要输出的文件类容
        output.write(str.getBytes());//3、将字符串变为字节数组
        output.close();//4、关闭资源
*   本程序是彩用了最为标准的形式实现了输出的操作处理，并且在整体的处理之中，只是创建了文件的父目录，但是并没有建文件，而在执行后会发现文件可以自动
* 帮助用户创建。另外需要提醒的是，由于OutputStream子类也属于AutoCloseable接口.类，所以对于close()方法也可以简化使用。
*
*
* */