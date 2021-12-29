package Demo;

public class Student {//学生类
//成员属性
    public static String name="徐乐";//姓名
    public String gender;//性别
    public static String bjname="智能班";//静态
    public static String xbname="应用技术系";//静态
//构造方法
    public Student() {}
    public Student(String name,String gender) {
        this.gender=gender;
    }
     public static void update(String bj,String xb){//(分别对应系部名称、班级名)静态方法
         bjname=bj;
         xbname=xb;
     }
     /*
     * 1、静态方法中访问静态属性，可以通过类名访问来避免变量名冲突
     *
     * */
     public static  void gmz(String xm){//意为改名字静态方法
        name=xm;
     }
    public String getInfo() {
        return "【学生信息】: - -学生姓名: "+this.name+" - -学生性别: " +this.gender +" - -学生班级: "+ this.bjname
                +" - -学生系部: " +this.xbname;
    }
    public static void main (String args[]) {
        //实例化
        Student A=new Student("徐乐","男");
        //打印学生基本信息
        System.out.println(A.getInfo());
        //在main方法中，通过徐乐同学对象调用方法update()修改系部、班级名称
        System.out.println("通过徐乐同学对象调用方法update()修改系部、班级名称");
        A.update("数教一班","初等教育系");
        System.out.println(A.getInfo());
        //在main方法中，通过Student类调用update()修改系部、班级名称
        System.out.println("通过Student类调用update()修改系部、班级名称");
        Student.update("声乐一班","艺术系");
        System.out.println(A.getInfo());
        //通过徐乐同学或Student类调用gmz()方法
        System.out.println("通过徐乐同学或Student类调用gmz()方法修改名字");
        Student.gmz("哈登");
        System.out.println(A.getInfo());
    }

}
