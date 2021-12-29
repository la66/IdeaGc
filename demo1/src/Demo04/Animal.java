package Demo04;
class Mammal extends Animal {//哺乳动物类(继承动物类)
    public String food="吃奶";//食物
    public Mammal(){}
    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    public void live(){
        super.live();
        System.out.print("【类别】:我们是哺乳动物类---------");
    }
    public String getSuperFood(){
        return super.getFood();
    }
}
class Dog extends Mammal{//狗继承哺乳动物类
    public String food="啃骨头";//食物

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void live(){
        super.live();
        System.out.print("【类别】:我们是狗类---------");
    }
    public String getSuperFood(){
        return super.getFood();
    }
}
class Cat extends Mammal{//猫继承哺乳动物类
    public String food="吃鱼";//食物

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void live(){
        super.live();
        System.out.print("【类别】:我们是猫类---------");
    }
    public String getSuperFood(){
        return super.getFood();
    }
}

public class Animal {//动物类
    public String food="animal肉食或者素食";//食物
    public Animal(){}

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void live(){
        System.out.print("【类别】:我们是动物类---------");
    }
    public static void main(String[] args) {

        Animal a= new Animal();//动物类实例化
        Mammal m =new Mammal();//哺乳动物类实例化
        Cat c =new Cat();//猫类实例化
        Dog d =new Dog();//狗类实例化
        //动物类
        a.live();
        System.out.println("【食物】:"+a.food);
        //哺乳动物类
        m.live();
        System.out.println("【食物】:"+m.getSuperFood());
        //狗类
        d.live();
        System.out.println("【食物】:"+d.getSuperFood());
        //猫类
        c.live();
        System.out.println("【食物】:"+c.getSuperFood());
    }

}
