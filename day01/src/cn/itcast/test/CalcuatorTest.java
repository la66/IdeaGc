package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalcuatorTest {
    /**
     * 初始化方法
     * 用于资源申请。所有的测试方法在执行之前的都会先执行该方法
     */
    @Before
    public  void init(){
        System.out.println("init......");
    }

    /**
     * 释放资源方法
     * 在所有测式方法执行后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("colse....");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        System.out.println("-----我被执行了-----");
        //创建计算器对象
        Calculator c =new Calculator();
        //调用add方法
        int result = c.add(1, 2);
        System.out.println(result);
        //3.断言 我断言这个结果的3
        Assert.assertArrayEquals(new int[]{1}, new int[]{result});
        
    }
    @Test
    public void testSub(){
        //创建计算器对象
        Calculator c =new Calculator();
        int result=c.sub(1,2);
        System.out.println("testSub...");
    }

}
