package generictype;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Util<T> {
    private T data;
    public static double sum (List< ? extends Number> numbers) {
        double sum = 0.0;
        for (Number i : numbers) {
            sum += i.doubleValue();
        }

        return sum;
    }
    public  T  getData()
    {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Util<Integer> util = new Util<>();
        util.setData(10);
        System.out.println(util);
        Util<String> util1 =  new Util<>();
        util1.setData("test");
        System.out.println(util1);
        Util<Object> util2 =  new Util<>();
        util2.setData("LOlo");
        System.out.println(util2);

        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1));

        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list2));
        System.out.println( "Data :" + util1.getData());
        System.out.println( "Data :" + util2.getData());
        System.out.println( "Data :" + util.getData());
        util1.setData("");
    }

}
