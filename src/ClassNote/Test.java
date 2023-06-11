package ClassNote;

/**
 * 反射
 * 将类当作对象来处理
 * 如果将类当作是一个对象
 * 类的方法 成员变量 构造方法
 * 都作为类这个对象的属性
 * 每一个类的类对象是唯一的
 * 1.通过class.forName 获取
 * 2.通过.class方式直接获取
 * 3.通过该类的实例对象获取
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.通过class.forName 获取
        //需要异常处理
        Class c1 = Class.forName("pojo.Student");

//        //2.通过.class方式直接获取
//        Class c2 = Student.class;
//        //3.通过该类的实例对象获取
//        Class c3 = new Student().getClass();
//        System.out.println(c1==c2);
//        System.out.println(c1==c3);

        //在获取类对象的时候
        //第一种类的静态属性会被自动加载
        //第二种普通代码块和静态代码块都不会被加载
        //第三种普通代码块和静态代码块都会被加载（先静态后普通



    }
}
