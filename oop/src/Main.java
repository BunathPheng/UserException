
import model.Product;
import org.nocrala.tools.texttablefmt.Table;
import teching.Student;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void writeToFile(Student student) {
        try {
            ObjectOutputStream on = new ObjectOutputStream(new FileOutputStream("products.txt"));
            on.writeObject(student);
            on.flush();
            System.out.println("Write  object to file is  successful");
            on.close();
        }catch (Exception ignore) {

        }
    }
    public static void readFromFile() {
        try {
             ObjectInputStream on = new ObjectInputStream(new FileInputStream("products.txt"));
             Student student = (Student) on.readObject();
            System.out.println(student);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
//        TextBook  textBook = new TextBook(
//                UUID.randomUUID().toString() ,
//                "Jivit",
//                new String[]{"Lika" , "Nana"},
//                LocalDate.now(),
//                200
//        );
//        System.out.println(textBook);
//        Shap shap = new Rectangle();
//        shap.printShap();
//        Rectangle rectangle = new Circle();
//        rectangle.printShap();
//        Functionalies  functionalies = new Account(10D , "Saving");
//        functionalies.ShowBlance();
//        functionalies.deposit(10D);
//        functionalies.withdraw(10D);
//        functionalies.ShowBlance();
//        functionalies.deposit(50D);
//        functionalies.ShowBlance();
//        functionalies.withdraw(10D);
//        functionalies.ShowBlance();
//        Email email = new Email();
//        email.setId(12);
//        System.out.println(email);
//        try {
//            Product product = new Product(
//                    UUID.randomUUID().toString(),
//                    12,
//                    50D,
//                    LocalDate.now().toString()
//            );
//            FileOutputStream fileOutputStream = new FileOutputStream("data.csv");
//            String content;
//            content = product.getUuid() + "," + product.getQty() +  "," +product.getPrice() +"," + product.getDate() + "\n";
//            fileOutputStream.write(content.getBytes(StandardCharsets.UTF_8));
//            fileOutputStream.close();
//            System.out.println("Successfully wrote to the file");
//        }catch (exception ignore){}
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.csv"));
//            String line;
//            String[] content  = null;
//            List<Product> products = new ArrayList<>();
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//                content = line.split(",");
//                products.add(new Product(content[0] , Integer.valueOf(content[1]) ,Double.valueOf(content[2]),content[3]));
//            }
//            Table table = new Table(4);
//            table.addCell("UUID");
//            table.addCell("QTY");
//            table.addCell("Price");
//            table.addCell("Date");
//            //data
//            for (Product product : products) {
//                table.addCell(product.getUuid() , 0);
//                table.addCell(String.valueOf(product.getQty()), 1);
//                table.addCell(String.valueOf(product.getPrice()), 2);
//                table.addCell(product.getDate(), 3);
//
//            }
//            System.out.println(table.render());
//            bufferedReader.close();
//        }catch (exception ignore){}
        Student  student = new Student(UUID.randomUUID().toString() , new String[]{"Lolo" , "Thyna"} , 12, new String[]{"DevOps" , "Java_Programming"},
        "M");
        writeToFile(student);
        readFromFile();
    }
}