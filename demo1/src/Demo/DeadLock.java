package Demo;

class Jian{
    public synchronized  void say(XiaoQiang xq){
        System.out.println("此路是我开，要想从从次过，留下买路财");
        xq.get();
    }
    public void get(){
        System.out.println("啊见说得到了101元钱可以开饭了，于是让出了路");
    }
}
class XiaoQiang{
    public synchronized  void say(Jian jj){
        System.out.println("小强说，让我先跑，我再给钱");
        jj.get();
    }
    public void get(){
        System.out.println("小强说，逃过了一劫可以继续送饭了");
    }
}
public class DeadLock implements Runnable{
    private Jian jj=new Jian();
    private XiaoQiang xq=new XiaoQiang();
    @Override
    public void run() {
        jj.say(xq);

    }
    public DeadLock(){
        new Thread(this).start();
        xq.say(jj);
    }
    public static void main(String[] args) {
        new DeadLock();
    }
}
/*
* 若干个线程访问同一资源时一定要进行同步处理，而过多的同步会造成死锁。
*
* 在多线程的开发过程之中最为著名的案例就是生产者与消费者操作,该操作的主要流程如下:
*       .生产者负责信息内容的生产;
*       ·每当生产者生产完成一项完整的信息之后消费者要从这里面取走信息;
*       ·如果生产者没有生产者则消费者要等待它生产完成，如果消费者还没有对信息进行消费，则生产者应该等待消费处理完成后再继续生产
*
* */
/*
* 主要依靠的是 Object类中提供的方法处理的:
*      等待机制:
*         死等: public final void wait() throws InterruptedException;
*         设置等待时间: public final void wait(long timeout) throws InterruptedException
*         -设置等待时间: public final void wait(long timeout,int nanos) throws InterruptedException
*      ·唤醒第一个等待线程: public final void notify();
*      .唤醒全部等待线程:public final void notifyAll();
* */
/*
* volatile关键字，表示的就是副使用副本，而是直接操作原始变量，相当于节约了:拷贝
*  volatile主要在属性上使用，而synchronized是在代码块与方法上使用的;
* .volatile无法描述同步的处理，它只是一种直接内存的处理，避免了副本的
*
* */