package cn.lx.dey_01;
class a{
    private String aa;
    private String cc;

    public a() {
    }

    public a(String aa, String cc) {
        this.aa = aa;
        this.cc = cc;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
    public String getInfo(){
        return "我很好";
    }
}
public class JavaDemo extends Object {
    public static void main(String[] args) {
        a a1=new a();
        System.out.println( a1.getInfo());

    }

}
