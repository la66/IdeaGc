package Demo05;

class Animal {//动物
    private String name;//名字
    private String food;//食物

    public Animal() {//构造方法
    }

    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void live(){
        System.out.println("---它爱吃:"+"【"+getFood()+"】");
    }
}

class Mammal extends Animal{//哺乳动物(继承动物)
    private String name;//名字
    private String food;//食物
    public Mammal(){//无参构造
    }
    public Mammal(String name, String food) {
        this.name = name;
        this.food = food;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    public void live(){
        System.out.println("---它爱吃:"+"【"+getFood()+"】");
    }
}

class Cat extends Mammal{//猫类(继承哺乳动物)
    private String name;//名字
    private String food;//食物

    public Cat(String name, String food) {//构造方法
        this.name = name;
        this.food = food;
    }

    public Cat(String name, String food, String name1, String food1) {
        super(name, food);//调用父类属性
        this.name = name1;
        this.food = food1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    public void live(){
        System.out.println("---它爱吃:"+"【"+getFood()+"】");
    }
}

class Dog extends Mammal{//狗类(继承哺乳动物)
    private String name;//名字
    private String food;//食物

    public Dog(String name, String food) {//构造方法
        this.name = name;
        this.food = food;
    }

    public Dog(String name, String food, String name1, String food1) {
        super(name, food);//调用父类属性
        this.name = name1;
        this.food = food1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    public void live(){
        System.out.println("---它爱吃:"+"【"+getFood()+"】");
    }
}

public class Test {//测试类

    public static void main(String[] args) {
        Animal a=new Animal("蜥蜴","昆虫");//实例化动物(蜥蜴)并赋值
        Animal m=new Mammal("刺猬","🍎");//实例化哺乳动物(刺猬)并赋值(多态【向上转型】)
        Animal d=new Dog("二哈","🥩");//实例化狗(二哈)并赋值(多态【向上转型】)
        Animal c=new Cat("小花猫","🐟");//实例化狗(小花猫)并赋值(多态【向上转型】)

        raiseAnimal(a);// Animal(蜥蜴)的相关信息(预判)
        a.live();

        System.out.println("---------------------------------------");

        raiseAnimal(m);// Mammal(刺猬)的相关信息(预判)
        m.live();

        System.out.println("---------------------------------------");

        raiseAnimal(d);// Dog(二哈)的相关信息(预判)
        d.live();

        System.out.println("---------------------------------------");

        raiseAnimal(c);// Cat(小花猫)的相关信息(预判)
        c.live();

    }
    public static void raiseAnimal(Animal a){
        System.out.print("我养的动物:"+"---【宠物名】:"+a.getName());//养动物

    }
}
