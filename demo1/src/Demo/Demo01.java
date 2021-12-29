package Demo;

class A{
    public String info="Helo";//公共的
    public A(){
        System.out.println("A默认的构造的方法为空");
    }//默认构造方法
    public A(String info){
        this.info=info;
        System.out.println("A自定义的构造的方法");
    }
    public void fun(){
        System.out.println("njknjvfkcmv");
    }
}

/***
 * 如果子类没有调用父类的构造方法编译器会自动调用
 * super()表示调用父类的构造的方法（无参默认，有参自定义）
 * 子类调用父类构造方法必须放在第一行
 * 如果父类有自定义构造,则默认构造必须存在，此时不会调用构造
 */
class B extends A{
    int info=100;
    public B(){
        //super.fun();//自定义构造方法
        //super();//等价于父类的默认构造方法
        //自动运行父类的默认构造方法
        System.out.println("默认构造方法B运行了");
    }
    public  void print(){
        System.out.println(super.info);//super
        System.out.println(this.info);
    }
    public void fun(){
        System.out.println("hgkj hdnccjdfk");
    }
}
class C extends A{
    public void fun(){
        System.out.println("nzvjkdvnfsc");
    }
}
public class Demo01 {
    public static  void main(String[] args){
        //System.out.println("你经常富兰克林政府");
        A a=new A();
        B b=new B();
        C c=new C();
        //a.fun();
        b.fun();
        c.fun();
        System.out.println("c");

    }
}
/*
* 子类与父类相同的方法叫覆写
* 子类与父类相同的属性叫覆盖
* 子类对象只能直接访问子类的属性，父类的而属性就被覆盖了
* java一般遵循驼峰式命名
* */