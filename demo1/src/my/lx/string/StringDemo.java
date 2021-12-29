package my.lx.string;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String sta="hello";
        String stb="hello";
        System.out.println(sta.toLowerCase());//转化小写
        System.out.println(sta.toUpperCase(Locale.ROOT));//转化大写
        System.out.println(sta.charAt(0));//截取第一个

    }
}
