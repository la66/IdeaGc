package Demo01;
import java.util.Arrays;
interface comparable<T> {
    /*
    * 实现对象的比较处理操作
    * @param要比较的对象
    * @return 当前数据比传入的对象小返回负数，如果大于返回整数，如果等于返回0
    *
    * */
    public int compareTo(T o);
}
class  Person implements comparable<Person>{
    private String name;
    private  int age;
    public Person(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }//无参构造setter,getter省略
    @Override
    public int compareTo(Person per){
        return  this.age- per.age;
    }
    @Override
    public String toString(){
        return "【Person类对象】姓名:"+this.name+"年龄:"+this.age+"\n";
    }
}
public class Comparator {
    public static void main(String[] args) {
        Person data[]=new Person[]{
                new Person("小强-A",80),
                new Person("小强-B",50),
                new Person("小强-C",100),
        } ;
        Arrays.sort(data);//进行对象数组的排序
        System.out.println(Arrays.toString(data));


    }
}
/*
* 比较器问题的引出
*   所谓的比较器指的就是进行大小关系的确定判断，下面首先来分析一下比较器存在的意义
*   如果要进行数组操作，肯定使用java.util.Arrays_的操作类完成，这个类里面提供有绝大部分的数组操作支持，
*   还提供有一种对象数组的排序支持: public static void sort(Object[]a);
*课时53 Comparable比较器
*
* 通过分析可以发现如果要实现对象的比较肯定需要有比较器来制定比较规则，而而比较的规则就通过Comparable来实现，对于,
*Comparable 而言，需要清楚其基本的定义结构:
*
*课时54 Comparator比较器
*    Comparator属于一种挽救的比较器支持，其主要的目的是解决一些没有使用Compar.
*      public static<T> void sort(T[]a, Comparator ? super T> c);
*
* */