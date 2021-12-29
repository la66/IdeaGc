package Demo03;

import javax.xml.namespace.QName;

class Mammal extends Animal{//哺乳动物类(继承动物类)
    public String food="吃奶";//食物
    public String name;
    public Mammal(){}
    public Mammal(String name){
        this.name=name;
    }
    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    public String getInfo(){
        return name;
    }
    public void live(){
        System.out.print("【类别】:我们是"+getInfo()+"---------");
    }
}
class Dog extends Mammal{//狗继承哺乳动物类
    public String food="啃骨头";//食物
    public String name;
    public Dog(String name){
        this.name=name;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getInfo(){
        return name;
    }
    public void live(){
        System.out.print("【类别】:我们是"+getInfo()+"---------");
    }
}
class Cat extends Mammal{//猫继承哺乳动物类
    public String food="吃鱼";//食物
    public Cat(String name){
        this.name=name;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getInfo(){
        return name;
    }
    public void live(){
        System.out.print("【类别】:我们是"+getInfo()+"---------");
    }
}

public class Animal {//动物类
    public String name;//类别
    public String food="animal肉食或者素食";//食物
    public Animal(){}
    public Animal(String name){
        this.name=name;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public String getInfo(){
        return name;
    }
    public void live(){
        System.out.print("【类别】:我们是"+getInfo()+"---------");
    }
    public static void main(String[] args) {

        Animal a= new Animal("动物类");//动物类实例化
        Mammal m =new Mammal("哺乳动物类");//哺乳动物类实例化
        Cat c =new Cat("猫类");//猫类实例化
        Dog d =new Dog("狗类");//狗类实例化
        //动物类
        a.live();
        System.out.println("【食物】:"+a.food);
        //哺乳动物类
        m.live();
        System.out.println("【食物】:"+m.food);
        //狗类
        d.live();
        System.out.println("【食物】:"+d.food);
        //猫类
        c.live();
        System.out.println("【食物】:"+c.food);
    }

}