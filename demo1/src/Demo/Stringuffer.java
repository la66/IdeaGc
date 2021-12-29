package Demo;

public class Stringuffer {
    public static void main(String[] args) {
        CharSequence str="www.mldn.cn";
        CharSequence sub=str.subSequence(4,8);
        System.out.println(sub);
    }
}
/*
* 课时26 StringBuffer类
*   String类是在所有项目开发之中一定会使用到的一个功能类，并且这个类拥有如下的:
*       .每一个字符串的常量都属于一个 StringDemo 类的匿名对象，并且不可更改;
*       . String有两个常量池:静态常量池、运行时常量池;
*       . String类对象实例化建议使用直接赋值的形式完成，这样可以直接将对象保
*    虽然 String类很好使用，但是如果认真去思考也会发现其最大的弊端:内容不允计符串内容的频繁修改
*可以调用方法执行处理，而这个时候可以考虑使用StringBuffer类中的如下方法:.
*       ·构造方法: public StringBuffer();
*       ·数据追加: public StringBuffer append(数据类型变量);。
* 1、插入数据:public StingBuffer insert(int offset，数据类型b).
* 2、删除指定范围的数据: public StringBuffer delete(int start, int end).
* 3、字符串内容反转:public StringBuffer reverse().
*实际上与 StringBuffer类还有一个类似的功能类:StringBuilder_类。
*    CharSequence本身是一个接口，在该接口之中也定义有如下操作方法:
*        ·获取指定索引字符: public char charAt(int index);
*        ·获取字符串的长度: public int length();
*        ·截取部分字符串:public CharSequence subSequence(int start,int end);
*
*
* */
/*
* 课时28 AutoCloseable接口
* */