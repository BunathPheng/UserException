package generictype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
class Parents
{
    private Integer ID;
    private String name;
}
class Child extends Parents
{



}
public class MyClass {
    public static  void data (List< ? super Child> list)
    {
        for (Object p : list)
        {
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        Parents p = new Parents(1 , "lala");
        ArrayList list = new ArrayList();
        list.add(p);
        MyClass.data(new ArrayList<Parents>());
    }
}
