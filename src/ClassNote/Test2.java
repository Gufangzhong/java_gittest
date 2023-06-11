package ClassNote;

import pojo.Student;

import java.lang.reflect.Constructor;

/**
 * 利用反射机制来创建对象
 * 在反射机制中 万物都是对象
 * 类可以是对象 构造方法 方法 成员变量都可以当作是对象来进行使用
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //获取学生类的类对象
        Class sClass = Class.forName("pojo.Student");
        //根据类对象 获取无参构造方法的反射对象
        Constructor c = sClass.getConstructor();
        //借助构造方法的反射对象直接实例化对象
        Student s = (Student) c.newInstance();
        //访问对象属性
        System.out.println(s);
        //也可以获取有参构造方法所对应的反射对象
        //如果你要获取有参有参的反射对象 需要提供参数类型所对应的反射对象
        Constructor <Student> c1 = sClass.getConstructor(Integer.class,String.class);
        //实例化对象 需要强制转换 但在构造方法时传入了创建对象的泛型就不需要
        Student s1 = c1.newInstance(3,"渣男");
        System.out.println(s1);

        //ioc思想
        //基于io流 利用配置文件
        //定义一个父接口 Person
        //有两个子类 一个是已有的学生 还有一个是老师类
        //请你提供一个配置文件叫做 person.config
        //在这个配置文件中 提供类的完整路径
        //pojo.Student
        //利用反射的特性 在代码不修改的情况下
        //只修改配置文件 创建出一个Teacher对象
        //缓存流输入流读取
    }
}
