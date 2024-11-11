package exception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        String name;
        try {
            System.out.print("[+] Insert name: ");
            name = new Scanner(System.in).nextLine();

            // Check if the name contains only alphabetic characters
            if (name.matches("[a-zA-Z]+")) {
                System.out.println("Valid name: " + name);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
