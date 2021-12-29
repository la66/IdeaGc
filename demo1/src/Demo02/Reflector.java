package Demo02;

import cn.mldn.vo.Person;

//import cn.mldn.vo.Person;
public class Reflector {
    public static void main(String[] args) throws Exception {
        Class<?> cls=Class.forName("cn.mldn.vo.Person");
        Object obj=cls.newInstance();
        System.out.println(obj);//获取类的完整名称

    }
}
/*
*课时99 反射机制简介
*
* 在Java语言里面之所以会有如此众多的开源技术支撑，很大的一部分是来自于.Java最大的特征——反射机制，如果你现在
*    反：Date date=new Date();//通过类产生的实例化对象
        System.out.println(date.getClass());
*    getClass(可以帮助使用者找到对象的根源
*课时100 Class类对象的三种实例化模式
*
* 反射之中所有的核心操作都是通过Class类对象展开的，可以说Class类是反射操作的根源所在，但是这个类如果要想获取J实例化对象，可以采用三种方式完成。
* public final class Class<T>extends Object.implements Serializable, GenericDeclaration. Type, AnnotatedElement.
* 从JDK1.5开始Class类在定义的时候可以使用泛型进行标记，这样的用法主要是希望可以避免所谓的向下转型
*操作讲解三种实例化形式:
*   l、【Object类支持】Object类可以根据实例化对象获取Class对象: public final Class<?>getClass();
*       Person per=new Person();//已经有指定类的实例化对像
        Class<? extends Person> cls=per.getClass();
        System.out.println(cls);
        System.out.println(cls.getName());//获取类的完整名称
*   2、【JVM直接支持】采用“类.class”的形式实例化.
*       Class<? extends Person> cls=Person.class;
        System.out.println(cls.getName());//获取类的完整名称
*   3、【Class类支持】在Class类里面提供有一个static方法:
*       ·加载类: public static Class<?>forName(StringDemo className) thrdws ClassNotFoundException;
*
*
* */
