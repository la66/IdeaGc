package cn.itcast.reflect;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

public class ReflectDemo1 {
    /**
     * 获取class对象的方法
     * 1. class.forName("全类名"):将字节码文件加载进内存，返回class对象
     *2．类名.class:通过类名的属性class获取
     * 3．对象.getclass(): getclass()方法在object类中定义着。
     * */
    public static void main(String[] args) throws Exception {
        //1.Class.forName( "全类名")
         Class cls=Class.forName("cn.itcast.domain.Person");

        System.out.println(cls);
        //2.类名class
        Class cls2= Person.class;
        System.out.println(cls2);
        // 3.对象.getclass()
        Person p=new Person();
        Class cls3=p.getClass();
        System.out.println(cls3);
        //==
        System.out.println(cls==cls2);
    }
}
