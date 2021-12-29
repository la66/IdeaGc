package Demo8.leiji.kuang;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        Xs x1=new Xs("A","1");
        Xs x2=new Xs("B","2");
        Xs x3=new Xs("C","3");
        HashMap<Integer,Xs> map=new HashMap<Integer,Xs>();
        //(按照"key=value")
        //put 向集合中保存数据
        map.put(1,x1);
        map.put(2,x2);
        map.put(3,x3);
//        map.put(null,"4");
//        map.put("三","我离开了");
        System.out.println(map.get(1));
        System.out.println(map);
    }
}
