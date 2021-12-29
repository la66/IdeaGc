package Demo;
class MyThread implements  Runnable{
    private int titcket=10;//总票数为10张
    public synchronized boolean sale(){
        if (this.titcket > 0) {
            try {
                Thread.sleep(100);//延时
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "买票.ticket" + this.titcket--);
            return true;
        } else {
            System.out.println("***票以经买完***");
            return false;

        }
    }
    @Override
    public void run(){
        while (this.sale());
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        new Thread(mt,"票贩子A").start();
        new Thread(mt,"票贩子B").start();
        new Thread(mt,"票贩子C").start();
    }
}
/*
* 1、利用同步代码块进行处理:
*      synchronized(同步对象){
*           同步代码操作;
*      }
* 一般要进行同步对象处理的时候可以采用当前对象this进行同步。
* 加入同步处理之后，程序的整体的性能下降了。同步实际上会造成性能的降低。
* synchronized (this) {//同步代码块操作（每一次只允许一个线程操作）
                if (this.titcket > 0) {
                    try {
                        Thread.sleep(100);//延时
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "买票.ticket" + this.titcket--);
                } else {
                    System.out.println("***票以经买完***");
                    break;
                }
            }
*
*2、利用同步方法解决:只需要在方法定义上使用synchronized关键字即可。
*   public synchronized boolean sale(){
        if (this.titcket > 0) {
            try {
                Thread.sleep(100);//延时
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "买票.ticket" + this.titcket--);
            return true;
        } else {
            System.out.println("***票以经买完***");
            return false;

        }
    }
* */
/*
* 死锁是在进行多线程同步的处理之中有可能产生的一种问题，所谓的死锁指的是若干个
* */