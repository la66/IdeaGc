package my.lx.ifce;

/**
 * 一、设计USB接口Iusb（USB接口），要求如下：
 * <p>
 * 0、属性1，pin，表示引脚数量，值为4
 * <p>
 * 1、方法1，plugin，表示插入USB设备
 * <p>
 * 2、方法2，communicate，传输数据
 * <p>
 * 3、方法3，popup，表示弹出USB设备
 */
interface Iusb {//（USB接口）
    public static final int pin = 4;//属性1，pin，表示引脚数量，值为4

    public String plugin();//方法1，plugin，表示插入USB设备

    public String communicate();//传输数据

    public String popup();//方法3，popup，表示弹出USB设备


}

/**
 * 二、设计BLE接口Ible（蓝牙接口），要求如下：
 * <p>
 * 0、属性1，version，表示蓝牙技术版本，值为5.0
 * <p>
 * 1、方法1，connect，表示连接蓝牙设备
 * <p>
 * 2、方法2，transport，传输数据
 * <p>
 * 3、方法3，disconnect，表示断开蓝牙连接
 */
interface Ible {//蓝牙接口
    public static final float version = 5.0f;//属性1，version，表示蓝牙技术版本，

    public String connect();//方法1，connect，表示连接蓝牙设备

    public String transport();//方法2，transport，传输数据

    public String disconnect();//方法3，disconnect，表示断开蓝牙连接
}

/**
 * 三、设计打印机类Printer，同时支持USB连接和蓝牙连接2种方法，要求如下：
 * <p>
 * 1、实现Iusb接口
 * <p>
 * 2、实现Ible接口
 * <p>
 * 3、其他必须的方法请自由发挥
 */
class Printer implements Iusb, Ible {//打印机类Printer


    public Printer() {
    }

    @Override
    public String plugin() {
        return "USB接口已连接打印机";
    }

    @Override
    public String communicate() {
        return "USB接口开始传输给打印机";
    }

    @Override
    public String popup() {
        return "USB接口已弹出打印机";
    }

    @Override
    public String connect() {
        return "已通过蓝牙连接打印机";
    }

    @Override
    public String transport() {
        return "通过蓝牙开始传输给打印机";
    }

    @Override
    public String disconnect() {
        return "断开蓝牙连接的打印机";
    }

}

/**
 * 四、设计蓝牙耳机类BluetoothHeadset，仅支持蓝牙连接，要求入下：
 * <p>
 * 1、实现Ible接口
 * <p>
 * 2、其他必须的方法请自由发挥
 */
class BluetoothHeadset implements Ible {//蓝牙耳机类

    public BluetoothHeadset() {
    }

    @Override
    public String connect() {
        return "通过蓝牙已连接蓝牙耳机";
    }

    @Override
    public String transport() {
        return "通过蓝牙开始传输给蓝牙耳机";
    }

    @Override
    public String disconnect() {
        return "已断开蓝牙--蓝牙耳机已失联";
    }
}

/**
 * 五、设计电脑类Computer，要求如下：
 * <p>
 * 1、方法1，表示使用USB设备，要求能插入所有实现了Iusb的接口的设备、模拟USB设备的插入、数据传输、弹出设备全部过程
 * <p>
 * 2、方法2，表示使用蓝牙设备，要求能插入所有实现了Ible的接口的设备、模拟蓝牙设备的连接入、数据传输、断开连接全部过程
 * <p>
 * 3、其他方法、属性，请根据情况自行设计
 */
class Computer {//电脑类Computer

    public void SxUSB(Iusb usb){
        System.out.println(usb.plugin()+"---"+usb.communicate()+"---"+usb.popup());//方法1，表示使用USB设备，
    }
    public void SxIble(Ible ible){//方法2，表示使用蓝牙设备
        System.out.println(ible.connect()+"---"+ible.transport()+"---"+ible.disconnect());

    }

}

public class CmputerTest {
    /**
     * 1、实例化一个Computer对象c
     * <p>
     * 2、实例化一个Printer对象p
     * <p>
     * 3、实例化一个BluetoothHeadset对象bh
     * <p>
     * 4、先让c分别使用usb、蓝牙的方式使用p，再让c使用bh
     */
    public static void main(String[] args) {
        Computer c = new Computer();//电脑
        Printer p = new Printer();//打印机
        BluetoothHeadset bh = new BluetoothHeadset();//蓝牙
        c.SxIble(p);
        c.SxIble(bh);
        c.SxUSB(p);
    }
}
