package Demo01;
import javax.swing.text.Style;
import java.io.*;
import java.io.File;
class FileUtil{//定义一个文件操作的工具类
    private File srcFile;//原文件路径
    private File desFile;//目标文件路径
    public FileUtil(String src,String des){
        this(new File(src),new File(des));
    }
    public FileUtil(File srcFile,File desFile){
        this.desFile=desFile;
        this.srcFile=srcFile;
    }
    public boolean copy()throws Exception{//文件拷贝处理
        if (!this.srcFile.exists()){//源文件必须存在
            System.out.println("拷贝的原文件不存在");
            return false;//拷贝失败
        }
        if(!this.desFile.getParentFile().exists()){
            this.desFile.getParentFile().mkdirs();//创建父目录
        }
        byte data[]=new byte[1024];//开辟一个拷贝的缓冲区
        InputStream input=null;
        OutputStream output=null;
        try{
            input =new FileInputStream(this.srcFile);
            output=new FileOutputStream(this.desFile);
            int len=0;
            //1、读取数据到数组之中，随后返回数组的个数、lenlen=input.read(data);//拷贝
            //2、判断个数是否位-1如果不是则进行写入
            while ((len=input.read(data))!=-1){
                output.write(data,0,len);
            }
            return  true;
        }catch (Exception e){
            throw e;
        }finally {
            if (input!=null){
            input.close();
            }
            if(output!=null){
            output.close();
            }
        }
    }
}
public class Filecopy {
    public static void main(String[] args)throws Exception {
        if(args.length!=2){//程序执行出错
            System.out.println("命令执行错误，执行结构，java Filecopy原文件路径目标文件路径");
            System.exit(1);
        }
        long start = System.currentTimeMillis();
        FileUtil fu =new FileUtil(args[0],args[1]);
        System.out.println(fu.copy()?"文件拷贝成功":"文件拷贝失败！");
        long end=System.currentTimeMillis();
        System.out.println("拷贝完成的时间:"+(end-start));
    }
}
/*
* 课时79 综合实战：文件拷贝
*
*
*
* */