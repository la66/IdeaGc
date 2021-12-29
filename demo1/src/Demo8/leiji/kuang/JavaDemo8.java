package Demo8.leiji.kuang;

import java.util.ArrayList;
import java.util.List;

class Xs {
    public String xm;
    public String bj;

    public Xs() {
    }

    public Xs(String xm) {
        this.xm = xm;
    }

    public Xs(String xm, String bj) {
        this.xm = xm;
        this.bj = bj;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }
}

public class JavaDemo8 {
    public static void main(String[] args) /*throws Exception*/ {
        Xs x1 = new Xs("A", "1");
        Xs x2 = new Xs("B", "2");
        Xs x3 = new Xs("C", "3");
        List<Xs> li = new ArrayList<>();//实例化list集合
        try {
            li.get(1);//访问越界
            //如果有异常则不执行下面的语句
            System.out.println("没有异常");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("有异常");
        }finally {
            System.out.println("好的了");
        }

        li.add(x1);
        li.add(x2);
        li.add(x3);
        System.out.println(li.size());
        System.out.println(li.get(0));
    }
}
