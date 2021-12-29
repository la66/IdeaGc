package Demo;

import java.util.Date;
import java.util.Random;

public class Digital_operation {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
    }
}
/*
*  Math数学计算类
*   程序就是一个数学的处理过程，所以在 Java语言本身也提供有相应的
*   Math类的主要功能是进行数学计算的操作类，提供有基础的计算公式.这个类的构造方法被私有化了，而且该类之中提供的.
*   所有方法都是static型的方法，即:这些方法都可以通过类名称直接调用.
*课时34 Random随机数生成类
*   java.util.Random类的主要功能是产生随机数的，这个类主要是依靠内部提供的方法来
*      ·产生一个不大于边界的随机正整: public int nextInt(int bound);
*
*
*   BigInteger bigA = new BigInteger("234234234234234234") ;
*   BigInteger bigB = new BigInteger("23423423") ;
*   System.out.println("加法操作:" + bigA.add(bigB));
*   System.out.println("减法操作:" + bigA.subtract(bigB));
*   System.out.println("乘法操作:" + bigA.multiply(bigB));
*   System.out.println("除法操作:" + bigA.divide(bigB));
*
*   【DateFormat】将日期格式化: public final Sting format(Date date);
*   【DateFormat】将字符串转为日期:public Date parse(StringDemo source) throws ParseException;
*    ·构造方法: public SimpleDateFormat(StringDemo pattern);
*        l-日期格式:年 (yyy)、月(MM)、日(ad)、时（HH)、分(mm)、秒(ss)、毫秒(SSs);
* 通过到现在的学习发现，String字符串可以向所有类型转换，基本类型、日期类型。
*
*
 * */