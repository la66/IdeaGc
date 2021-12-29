package Demo;

interface IMessage extends AutoCloseable{
    public void send();//消息发送
}
class NetMessage implements IMessage{//实现消息的处理机制
    private String msg;
    public NetMessage(String msg){
        this.msg=msg;
    }
    public boolean open(){//获取资源连接
        System.out.println("【OPEN】获取消息发送连接资源");
        return true;
    }
    @Override
    public void send(){
        System.out.println("***发送消息***"+this.msg);
    }
    public void close() throws Exception{
        System.out.println("【CLOSE】关闭消息发送通道");
    }
}
public class AutoCloseable_{
    public static void main(String[] args) throws Exception{
        try(IMessage nm=new NetMessage("www.mldn.cn")){
            nm.send();
        }catch (Exception e){}

    }
}
/*
*
* AutoCloseable主要是用于日后进行资源开发的处理上，以实现资源的自动关闭(释放资源) .
*    ·关闭方法: public void close() throws Exception;
*  课时29 Runtime类
*    ·获取实例化对象:public static Runtime getRuntime(); .
* */