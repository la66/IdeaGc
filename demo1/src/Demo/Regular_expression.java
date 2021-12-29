package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Regular_expression {
    public static void main(String[] args) {
        String str="1981-10-15";
        String regex="\\d{4}-\\d{2}-\\d{2}";//正则表达式
        String result [] = str.split(regex);
        if(str.matches(regex)) {
            try {
                System.out.print(new SimpleDateFormat("yyyy-MM-dd").parse(str));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

    }
}
/*
*通过之前一系列的分析可以发现，String是一个非常万能的类型，因为 StringDemo 不仅仅持有向各个数据类型的转换功能，所以在项目的开发之中，只要是用户输入的信息基本.
* 所以在项目的开发之中，只要是用户输入的信息基本上都用String表示。
*   认识正则表达式
*   正则标记（背)
*      这个包里面提供有一个Pattern程序类，在这个程序类里面定义有所有支持的正则标记。
*   1、【数量:单个】字符匹配.
*       ·x任意字符:表示由任意字符组成;
*       .\\:匹配“\”;
*       .\n:匹配换行;
*       .\t:匹配制表符;
*   2、【数量:单个】字符集（可以从里面任选一个字符).
*       .[abc]:表示可能是字母a、b、c 中的任意一个;
*       .[^abc]:表示不是由字母a、b、c中的任意一个; .
*       .[a-zA-Z]:表示由一个任意字母所组成，不区分大小写;
*       .[0-9]:表示由一位数字所组成;
*   3.【数量:单个】简化字符集:
*       ..:表示任意的一个字符;
*       .\d:等价于“[0-9]”范围;
*       ·\D:等价于“[^0-9]”范围;
*       .\s:匹配任意的一位空格，可能是空格、换行、制表符;
*       .\S:匹配任意的非空格数据;
*       .\w:匹配字母、数字、下划线，等价于“[a-ZA-Z...0-9]”;
*       .\W:匹配非字母、数字、下划线，等价于“[^a-zA-Z_0-9]”;
*   4、边界匹配:
*       .^:匹配边界开始;
*       .$:匹配边界结束;
*   5、数量表示，默认情况下只有添加上了数量单位才可以匹配多位字符;
*       ·表达式?:该正则可以出现О次或1次;
*       ·表达式*:该正则可以出现О次、1次或多次;
*       ·表达式+:该正则可以出现1次或多次;
*       ·表达式{n}:表达式的长度正好为n次;
*       ·表达式{n.}:表达式的长度为n次以上;
*       ·表达式{n.m}:表达式的长度在n~m 次;
*   6、逻辑表达式:可以连接多个正则:
*       ·表达式X表达式Y:X表达式之后紧跟上Y表达式;
*       ·表达式X|表达式Y:有一个表达式满足即可;
*       ·(表达式):为表达式设置一个整体描述，可以为整体描述设置数量单位;
*
* */
/*
*
* String类对正则的支持
*    在进行正则表达式大部分处理的情况下都会基于String类来完成，并且在 String类里面提供有如下与正则有关的操作方法:.
*       1、public boolean matches(StringDemo regex)将指定字符串进行正则判断。
*       2、public StringDemo replaceAll(StringDemo regex, StringDemo replacement)    替换全部。
*       3、public StringDemo replaceFirst(StringDemo regex, StringDemo replacement)  替换首个
*       4、public StringDemo[] split(StringDemo regex) 正则拆分。
*       5、public StringDemo[] split(StringDemo regex, int limit)正则拆分
*
*
*
* */
/*
* 字符串的拆分
*  StringDemo str="a1b22c333d4444e55555f666666g";
        StringDemo regex="\\d+";//正则表达式
        StringDemo result [] = str.split(regex);
        for(int x=0;x<result.length;x++){
            System.out.print(result[x]+"、");
        }
   在正则处理的时候对于拆分与替换的操作相对容易一些，但是比较麻烦的是数据验证部分。
*
*需要注意的是，正则表达式无法对里面的内容进行判断，只能够对格式进行判断处理。
*既然已经可以使用正则进行验证了，那么下面就可以利用其来实现一个email地址格式的验证。.
*   范例:验证email格式
*        email 的用户名可以由字母、数字、_所组成;。
*        email的域名可以由字母、数字、_、-所组成;
*        域名的后缀必须是: .cn、.com、.nct、.com.cn、.gov;
*
* */
/*
* 虽然在大部分的情况下都可以利用String类实现正则的操作，但是也有一些情况下需要使用到
*   正则处理类，在这个包里面一共定义有两个类:Pattern(正则表达式编译)、Matcher(匹配)。
* 1、Pattern类提供有正则表达式的编译处理支持: public static Pattern compile(StringDemo regex);
*       同时也提供有字符串的拆分操作: public StringDemo[] split(CharSequence input);
* 2、Matcher类，实现了正则匹配的处理类，这个类的对象实例化依靠P.attern类完成:
*       .Pattern类提供的方法: public Matcher matcher(CharSequence input).
*   当获取了Matcher类的对象之后就可以利用该类中的方法进行如下操作:
*       ·正则匹配:public boolean matches():
*       ·字符串替换:public StringDemo replaceAll(StringDemo replacement)。
*
*
* */