public class Runtime1 {
    public static void main(String[] args) {
        String info="你好啊";

    }
}
/*
* 通过这个类中的availableProcessors()方法可以获取本机的CPU内核数.
* 但是除了以上的方法之外，在 Runtime类里面还提供有以下四个重要的操作方法:
*      ·获取最大可用内存空间:public long maxMemory(),默认的配置为本机系统内存的四分之一;
*      ·获取可用内存空间:public long totalMemory(),默认的配置问本机系统内存的64分之1;
*      ·获取空闲内存空间:public long freeMemory();
*      ·手工进行GC处理:public void gc().
* */
/*
* System类是一直陪伴着我们学习的程序类，之前使用的系统输出采就是 System类中的方法。
*      .数组拷贝: public static void arraycopy((Object src. int srcPos, Object dest,int destPos. int length);
*      ·获取当前的日期时间数值:public static long currentTimeMillis();
*      ·进行垃圾回收: public static void gc();
*
*耗时案例:
*       long start = System.currentTimeMillis();
        Runtime run =Runtime.getRuntime();//获取实力化对象
        for(int x=0;x<30000;x++){
            str+=x;//可以产生大量的垃圾空间
        }
        long end = System.currentTimeMillis();
        System.out.println("操作好时，"+(end-start));
        打印结果：操作好时，512
* */