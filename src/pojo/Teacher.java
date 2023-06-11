package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher implements Person{
    public Teacher() {
    }
    private Integer tno;
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setNo(Integer no) {
        this.tno = no;
    }

    @Override
    public void display() {
        System.out.println("tno:"+tno+",name:"+name);
    }
}
