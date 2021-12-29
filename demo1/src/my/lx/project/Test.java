package my.lx.project;

/**
 * 一、门（Door）
 * <p>
 * 1、Door为抽象类
 * <p>
 * 2、Door具有成员属性重量（weight）、厚度（thickness）
 * <p>
 * 3、默认构造方法
 * <p>
 * 4、自定义构造方法，方法体初始化2个成员属性
 * <p>
 * 5、普通方法关门（close），返回值void，参数列表空，方法体自定义
 * <p>
 * 6、抽象方法阻止（prevent），返回值String，参数列表空
 */
abstract class Door {//门（Door）抽象类
    //员属性
    private String weight;//员属性重量（weight）
    private String thickness;//厚度（thickness）

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    //构造方法
    public Door() {
    }

    public Door(String weight, String thickness) {
        this.weight = weight;
        this.thickness = thickness;
    }

    public void close() {//普通方法关门（close）
        System.out.print("关门");
    }

    public abstract String prevent();//抽象方法阻止（prevent），返回值String，参数列表空
}

/**
 * 二、防盗门（SecurityDoor）
 * <p>
 * 1、成员属性防盗等级（level）
 * <p>
 * 2、默认构造方法
 * <p>
 * 3、自定义构造方法1，方法体初始化1个成员属性（level）
 * <p>
 * 4、自定义构造方法2，方法体初始化3个成员属性（weight、thickness、level）
 * <p>
 * 5、实现抽象方法阻止（prevent），方法体自定义
 */
class SecurityDoor extends Door {//二、防盗门（SecurityDoor）
    private String level;

    public SecurityDoor() {
    }

    public SecurityDoor(String level) {
        this.level = level;
    }

    public SecurityDoor(String weight, String thickness, String level) {
        super(weight, thickness);
        this.level = level;
    }

    public String getInfo() {
        return "【防盗门】---" + super.getWeight() + "---" + super.getThickness() + "---" + this.level + "---";
    }

    @Override
    public String prevent() {
        return "我不想让你进来,你能怎样";//功能(阻止)
    }
}

/**
 * 三、心门（HeartDoor）
 * <p>
 * 1、成员属性开放程度（openDegree）
 * <p>
 * 2、默认构造方法
 * <p>
 * 3、自定义构造方法1，方法体初始化1个成员属性（openDegree）
 * <p>
 * 4、自定义构造方法2，方法体初始化3个成员属性（weight、thickness、openDegree）
 * <p>
 * 5、实现抽象方法阻止（prevent），方法体自定义
 */
class HeartDoor extends Door {
    private String openDegree;//

    public HeartDoor() {
    }

    public HeartDoor(String openDegree) {
        this.openDegree = openDegree;
    }

    public HeartDoor(String weight, String thickness, String openDegree) {
        super(weight, thickness);
        this.openDegree = openDegree;
    }

    public String getInfo() {
        return "【心门】---" + super.getWeight() + "---" + super.getThickness()+ "---" + this.openDegree + "---";
    }

    @Override
    public String prevent() {
        return "亲:我关了一扇们！！！";//功能(阻止)
    }
}

/**
 * 四、测试（Test）
 * <p>
 * 1、main方法
 * <p>
 * 2、静态方法testDoor，要求该方法参数列表既能传防盗门也可以传心门，方法体中运行参数传递过来的那个门的prevent方法
 * <p>
 * 3、在main方法中分别实例化一个防盗门类的对象、一个心门类的对象，将这个两个门对象作为参数来运行testDoor方法
 */
public class Test {
    public static void main(String[] args) {
        Door door1 = new SecurityDoor("【很重】", "【很厚】", "【防盗特级】");
        Door door2 = new HeartDoor("【不重】", "【不厚】", "【你让我怎样】");

        System.out.print(((SecurityDoor)door1).getInfo());
        System.out.println(testDoor(door1));
        System.out.println("------------------------------------------------------------");
        System.out.print(((HeartDoor)door2).getInfo());
        System.out.println(testDoor(door2));

    }

    public static String testDoor(Door door) {
        return door.prevent();
    }
}
