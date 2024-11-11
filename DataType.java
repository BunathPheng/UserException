import javax.security.auth.Subject;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DataType {
    public static void main(String[] args) {
        Scanner subject = new Scanner(System.in);
        System.out.print("Math :");
        Double math = subject.nextDouble();
        System.out.print("Khmer :");
        Double khmer = subject.nextDouble();
        System.out.print("English :");
        Double english = subject.nextDouble();
        System.out.print("Bio :");
        Double bio = subject.nextDouble();
        Double  sub  = math+ khmer+ english+ bio / 4;// Example Double value
        int subs = sub.intValue();
        System.out.println(sub);
        if (subs > 90) {
            System.out.printf("This is grade A for getting score: %d%n", subs);
        } else if (subs >= 80 && subs <= 90) { // Corrected condition
            System.out.printf("This is grade B for getting score: %d%n", subs);
        } else if (subs >= 70 && subs < 80) {
            System.out.println("This is grade C for getting  score: " + subs);
        } else if (subs >= 60 && subs < 70) {
            System.out.println("This is grade D for getting score: " + subs);
        } else if (subs >= 50 && subs < 60) {
            System.out.println("This is grade E for getting score: " + subs);
        } else
        {
            System.out.println("This is grade F for getting score: " + subs);
        }
    }
}
