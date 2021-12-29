package cn.abst.com;
//抽象类
abstract class  Message{//定义一个抽象类
    private String type;//消息
    public abstract String getConnectInfo() ; //抽象方法

    public Message(String type) {
        this.type = type;
    }

    public void setType(String type) {//普通方法
        this.type = type;
    }
    public String getType() {//普通方法
        return type;
    }
}
class DatabaseMessage extends Message{//普通类继承抽象类(必须覆写抽象方法才能使用)
    public DatabaseMessage (String str) {
        super(str);
    }
    @Override
    public String getConnectInfo() {
        return "mysql的数据的连接";//方法的覆写
    }

}
public class JavaDemo {
    public static void main(String[] args) {
        Message msg = new DatabaseMessage("客户消息");
        System.out.println(msg.getConnectInfo());
        System.out.println(msg.getType());
    }
}
