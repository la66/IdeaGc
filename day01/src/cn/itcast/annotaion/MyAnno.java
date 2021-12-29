package cn.itcast.annotaion;

import cn.itcast.domain.Person;

public @interface MyAnno {
    int value();
    String name() default "zhangsan";
//    String show2();
//
////    Person per();
//    MyAnoo2 ann02();
//    String[] strs[] = new String[0][];
}
