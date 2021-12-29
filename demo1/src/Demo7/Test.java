package Demo7;

class Car {//汽车类Car，具有汽车最基本的特点
    public double weight;//成员属性，重量weight
    public String maxSpeed;//最高时速maxSpeed

    public Car() {
    }

    public Car(double weight, String maxSpeed) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //成员方法
    public void speedUp() {//加速speedUp
        System.out.print("加速");
    }

    public void fix() {//维修fix
        System.out.println("洗车");
    }
}

class FireFightingTruck extends Car {//消防车
    public double weight;//成员属性，重量weight
    public String maxSpeed;//最高时速maxSpeed
    public double waterVolume;//成员属性，装水容量

    public FireFightingTruck(double weight, String maxSpeed, double waterVolume) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.waterVolume = waterVolume;
    }

    public FireFightingTruck(double weight, String maxSpeed, double weight1, String maxSpeed1, double waterVolume) {
        super(weight, maxSpeed);
        this.weight = weight1;
        this.maxSpeed = maxSpeed1;
        this.waterVolume = waterVolume;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(double waterVolume) {
        this.waterVolume = waterVolume;
    }

    //成员方法
    public void speedUp() {//加速speedUp
        System.out.print("加速");
    }

    public void fix() {//维修fix
        System.out.println("洗车");
    }

    public void fireFight() {//灭火
        System.out.print("我要灭火");
    }
}

class Ambulance extends Car {//三、救护车Ambulance
    public double weight;//成员属性，重量weight
    public String maxSpeed;//最高时速maxSpeed
    public String function;//1、成员属性，救护功能function
    public Ambulance(){}
    public Ambulance(double weight, String maxSpeed, String function) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.function = function;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Ambulance(double weight, String maxSpeed, double weight1, String maxSpeed1, String function) {
        super(weight, maxSpeed);
        this.weight = weight1;
        this.maxSpeed = maxSpeed1;
        this.function = function;
    }

    //3、成员方法，覆写加速speedUp，覆写维修fix，灭火fireFight
    public void speedUp() {//加速speedUp
        System.out.print("加速");
    }

    public void fix() {//维修fix
        System.out.print("洗车");
    }

    public  void fireFight(String x) {//灭火
        System.out.print("x");
    }
}

public class Test {//测试类

    public static void main(String[] args) {
        //Car、FireFightingTruck、Ambulance
        Car c = new Car(1,"1km/h");//实例化对象小汽车
        Car f = new FireFightingTruck(3,"1.5km/h",11);//实例化对象消防车
        Car a = new Ambulance(2,"2.5km/h","救人");//实例化对象救护车，
        System.out.print("【小气车】---"+"【重量】:"+ c.getWeight()+"---【时速】:"+ c.getMaxSpeed()+"---");
        c.speedUp();
        System.out.print("---【维修】");
        upkeep(c);
        System.out.println("----------------------------------------------");
        System.out.print("【消防车】---"+"【重量】:"+ f.getWeight()+"---【时速】:"+ f.getMaxSpeed()+"---【储水】:"
                + ((FireFightingTruck) f).getWaterVolume()+"---");
        f.speedUp();
        System.out.print("---【维修】");
        upkeep(f);
        System.out.println("----------------------------------------------");
        System.out.print("【救护车】---"+"【重量】:"+ a.getWeight()+"---【时速】:"+ a.getMaxSpeed()+"---【救人】"+
                ((Ambulance) a).getFunction()
                +"---");
        a.speedUp();
        System.out.print("---【维修】");
        upkeep(a);
    }

    public static void upkeep(Car c) {
        c.fix();
    }
}
