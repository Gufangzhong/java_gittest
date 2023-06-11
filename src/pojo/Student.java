package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class Student implements Person{
    private Integer sno;
    private String name;
    public Student(){

    }

    {
        System.out.println("普通代码块");
    }
    static {
        System.out.println("静态代码块");
    }

    @Override
    public void display() {
        System.out.println("sno:"+sno+",name:"+name);
    }

    @Override
    public void setNo(Integer no) {
        this.sno=no;
    }


}
