package my.lx.file;

import org.junit.Test;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws Exception {//此处直接抛出异常
        File file=new File("F:\\Desktop\\test.txt");//设置文件路径
        //file.mkdir();
        //file.mkdirs() 复数形式
       /* if(file.exists()){//如果存在则删除
            file.delete();
        }else {//如果不存在则创建
            System.out.println(file.createNewFile());//创建文件
            OutputStream os=new FileOutputStream(file,true);//打开输出流
            String s="ftvghcjbfhmkgkj";//存入类容
            byte []h=s.getBytes();//转为字节流
            os.write(h);//输出到文件中
            os.close();//关闭流
        }*/
        InputStream is=new FileInputStream(file);//输入流
        byte h[]=new byte[40];//获取字节流
        //is.read(h);//读取
        int len =0;
        while ((len=is.read(h))>0){
            String s=new String(h,0,40);//存入
            System.out.println(s);//打印
        }
        is.close();
    }
    @Test
    public void main1(){
        File f=new File("F:\\Desktop\\test\\test.txt");//设置文件路径
        try {
            f.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
