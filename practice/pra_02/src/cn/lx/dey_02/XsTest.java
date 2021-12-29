package cn.lx.dey_02;

import java.util.ArrayList;

class Xs{
    private String xm;
    private String xh;

    public Xs() {
    }

    public Xs(String xm, String xh) {
        this.xm = xm;
        this.xh = xh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }
}
public class XsTest {
    public static void main(String[] args) {
        Xs x1=new Xs("张三","111111111");
        Xs x2=new Xs("李四","211111111");
        Xs x3=new Xs("王五","311111111");
        ArrayList<Xs> LI=new ArrayList<Xs>();
        LI.add(x1);
        LI.add(x2);
        LI.add(x3);
        Xs mt=LI.get(1);
        System.out.println(mt);
    }

}
