package Demo6;
class Student{
    //该类有成员变量xm、xh、xx，分别对应姓名、学号、学校
    private  String xm;//姓名
    private double xh;//学号
    private String xx;//学校

    public Student() {
    }

    public Student(String xm, double xh, String xx) {
        this.xm = xm;
        this.xh = xh;
        this.xx = xx;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public double getXh() {
        return xh;
    }

    public void setXh(double xh) {
        this.xh = xh;
    }

    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    public String student(){
        return this.xm+"好好学习天天向上";
    }
}
class CollegeStudent extends Student{
    //该类有成员变量xm、xh、xx，分别对应姓名、学号、学校
    //性ah (爱好)，静态属性班级clazz
    private  String xm;//姓名
    private double xh;//学号
    private String xx;//学校
    private String ah;// (爱好)
    static String clazz="C班";//静态属性班级

    public CollegeStudent(){}

    public CollegeStudent(String xm, double xh, String xx, String ah) {
        this.xm = xm;
        this.xh = xh;
        this.xx = xx;
        this.ah = ah;
    }

    public CollegeStudent(String xm, double xh, String xx, String xm1, double xh1, String xx1, String ah) {
        super(xm, xh, xx);
        this.xm = xm1;
        this.xh = xh1;
        this.xx = xx1;
        this.ah = ah;
    }

    @Override
    public String getXm() {
        return xm;
    }

    @Override
    public void setXm(String xm) {
        this.xm = xm;
    }

    @Override
    public double getXh() {
        return xh;
    }

    @Override
    public void setXh(double xh) {
        this.xh = xh;
    }

    @Override
    public String getXx() {
        return xx;
    }

    @Override
    public void setXx(String xx) {
        this.xx = xx;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public static String getClazz() {
        return clazz;
    }

    public static void setClazz(String clazz) {
        CollegeStudent.clazz = clazz;
    }

    public String student(){
        return this.xm+"好好学习天天向上";
    }
}
public class Test {
    public static void main(String[] args){
        Student s=new Student("张三",3435,"A校");//实例化
        CollegeStudent c=new CollegeStudent("李四",34351,"B校","钓鱼");//实例化
    }

}
