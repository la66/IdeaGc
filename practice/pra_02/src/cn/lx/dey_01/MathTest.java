package cn.lx.dey_01;

import java.util.Random;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));//绝对值
        System.out.println(Math.round(3.14));
        Random R=new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(R.nextInt()*10);

        }
    }
}
