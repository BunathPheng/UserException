import java.util.Arrays;
import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;


public class Array {
    public static void main(String[] args) {
//        String[] name = new String[2];
//        for(int i=0; i<name.length; i++)
//        {
//            System.out.print("Insert name:");
//            name[i] = new Scanner(System.in).nextLine();
//        }
//        System.out.println(Arrays.toString(name));
//        int [] numbers = new int[]{1,2,3,4,5,6,7,8,9};
//        Arrays.stream(numbers).forEach(System.out::println);
//        System.out.print("Inert numbers you want to array:");
//        int  num  =  new Scanner(System.in).nextInt();
//        int [] numbers =  new  int[num];
//        int  sum  = 0;
//        for(int i=0 ;  i<numbers.length; i++){
//            System.out.printf("input index  of array [%d]:", i);
//            numbers[i] = new  Scanner(System.in).nextInt();
//            sum += numbers[i];
//        }
//        System.out.println("Total of sum :" + sum);
//        double average = (double) sum/numbers.length;
//
//        System.out.println("Average  of number have in arrays :" + average);
        System.out.print("Insert size  of  array:");
        int  size = new Scanner(System.in).nextInt();
        int [] numbers  = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input number [" + i + "]:");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
