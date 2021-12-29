package cn.mldn.vo;
public class Person {
    //任何情况下如果要实例化类对象则,定要调用类中的构造方法
    public Person(){
        System.out.println("*********Person");
    }
    @Override
    public String toString() {
        return "我是一个人，一个脱离低级趣味的好人";
    }

    public static void main(String[] args) {

    }
}
