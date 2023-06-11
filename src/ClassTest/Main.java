package ClassTest;

import pojo.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // 创建文件对象，指定配置文件的路径
        File f = new File
                ("F:\\Working\\java\\java_software\\idea_workspace\\d0610_java\\src\\person.config");
        try(
                // 创建 FileReader 和 BufferedReader 对象，用于逐行读取配置文件内容
                FileReader fileReader = new FileReader(f);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ){
            // 读取配置文件中的类路径
            String className = bufferedReader.readLine();
            // 加载类对象
            Class clazz = Class.forName(className);
            // 获取无参构造函数对象
            Constructor constructor = clazz.getConstructor();
            // 公共的无参构造函数，使用 getConstructor() 方法是更简洁的选择。
            // 如果目标类有非公共的无参构造函数，
            // 或者具有其他特殊的构造函数参数，
            // 需要使用 getDeclaredConstructor() 方法，
            // 并根据需要设置其可访问性，
            // 以便正确地获取构造函数对象。

            // 使用反射创建对象实例
            Person person = (Person) constructor.newInstance();
            // constructor.newInstance() 方法返回的是一个实际类的对象，
            // 该对象是使用反射动态创建的。
            // 通过使用 (Person) 将返回的对象进行类型转换，
            // 你将把这个对象当作 Person 接口的实例来处理。
            // 这使得你可以通过 person 变量访问在 Person 接口中定义的方法和行为，
            // 而不需要知道具体的实现类。
            person.display();

            //Method对象

            //获取指定类（clazz）中名为 "setName" 的公共方法，
            //并指定该方法的参数类型为 String.class
            Method method = clazz.getMethod("setName",String.class);
            //实现方法调用
            method.invoke(person,"买买提");
            person.display();

            Method method1 = clazz.getMethod("setNo",Integer.class);
            method1.invoke(person,1);
            person.display();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
