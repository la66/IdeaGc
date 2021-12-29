package Demo01;

import java.io.File;

public class Filee {
    public static void main(String[] args) throws Exception{
        File file=new File("d:"+File.separator);//设置要操作完整路径
        if(file.isDirectory()){//当前是一个目录
            File result []=file.listFiles();//列出全部的类容
            for(int x=0;x<result.length;x++){
                System.out.println(result[x]);
            }
        }
    }
}
/*
* 课时67 File类基本操作
*在 Java语言里面提供有对于文件操作系统操作的支持,File类是唯一一个与文件本身操作（创建、删除、重命名）有关的类。而如果要想进行File类的操作，
*必须要提供有完整的路径，而后可以调用相应的方法进行处理。
* File类的使用
*File类是 Comparable接口的子类，所以File类的对象是可以进行排序处理
*需要为其设置访问路径，那么对于路径的配置主要通过File类的构造方法的处理。
*   ·构造方法: public File(StringDemo pathname)，设置要操作完整路径(pathname);
*   ·构造方法: public File(File parent, StringDemo child)，设置父路径与子目路
*如果现在要想进行文件的基本操作，可以使用如下的方法:
*   .创建新的文件:public boolean createNewFile() throws IOException;
*   ·判断文件是否存在:public boolean exists();
*   .删除文件: public boolean delete();
*范例:使用File类创建一个文件（(d:\mldn.txt)
*       File file=new File("d:\\File\\mldn.txt");//设置要操作完整路径
        if(file.exists()){
            file.delete();
        }else{
            System.out.println(file.createNewFile());//创建新的文件
        }
*
*
* */
/*
* 课时68 File类操作深入
*File类提供有一个常量: public static final StringDemo separator;
* 范例:正常的路径编写
*   File file = new File("d : " + File.separator + "mldn.txt" ) ;
*3、在进行文件创建的时候有一个重要的前提:文件的父路径必须首先存在。
*   .如何获取父路径:public File getParentFile();
*   .创建目录: public boolean mkdirs();
* */
/*
*课时69 获取文件信息
*   除了可以进行文件的操作之外也可以通过File类来获取一些文件本身提供的信息!
*       ·文件是否可读: public boolean canRead();
*       ·文件是否可写: public boolean canWrite();
*       ·获取文件长度: public long length()，该方法返回的是 long数据类型;
*       ·最后一次修改日期时间: public long lastModified();
*       ·判断是否是目录:public boolean isDirectory();
*       .判断是否是文件:public boolean isFile()。
*.列出目录内容:public File[] listFiles();
*      File file=new File("d:"+File.separator);//设置要操作完整路径
        if(file.isDirectory()){//当前是一个目录
            File result []=file.listFiles();//列出全部的类容
            for(int x=0;x<result.length;x++){
                System.out.println(result[x]);
            }
        }
* */
/*
* 课时70 综合案例：列出目录结构
*课时71 综合案例：文件批量更名
*
* */