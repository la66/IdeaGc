package Demo;

public class Mammal {
    public String name;
    public static void main(String[] args) {
        //三、编写测试类，在测试类main方法中，实例化Dog类实例yellow、Cat类实例tom，
        // 依次访问yellow和tom的全部属性和方法（包括父类的方法和属性）。
        Dog yellow =new Dog("导盲犬","导盲");
        Cat tom =new Cat("小猫",false);
        //【Dog的基本信息】
        System.out.print(yellow.getInfo());
        yellow.sayHello();
        //【Cat的基本信息】
        System.out.print(tom.getInfo());
        tom.cute();



    }
}
class Dog extends Mammal{
    public String speciality;//意为特长（比如导盲、牧羊）
    public Dog(String name,String speciality){
        this.name=name;//继承父类
        this.speciality=speciality;
    }
    public void sayHello() {//意味摇尾巴打招呼，public访问权限，返回值为void，参数列表为空，方法体自由发挥
        System.out.println("--动作:摇尾巴打招呼");
    }
    public String getInfo(){
        return "【Dog的基本信息】:--名字:"+this.name+"--特长:"+this.speciality;
    }
}
class Cat extends Mammal{
    public Boolean night;//意味昼伏夜出，public访问权限，Boolean类型。
    public Cat(String name,Boolean night){
        this.name=name;
        this.night=night;
    }
    public void cute() {//意味卖萌，public访问权限，返回值为void，参数列表为空，方法体自由发挥
        System.out.println("--动作:卖萌");
    }
    public String getInfo(){
        String x;
        if(this.night){
            x="昼伏夜出";
        }else {
            x="不是昼伏夜出";
        }
        return "【Cat的基本信息】:--名字:"+this.name+"--特长:"+x;
    }
}