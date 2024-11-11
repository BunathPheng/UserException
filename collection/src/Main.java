import model.Student;
import model.StudentO;
import model.SubStudent;

import java.util.*;

public class Main{
    public static void main(String[] args) {
//       List<Student> students = new ArrayList<>();
//        System.out.print("input class for student:");
//       String[] classes = new Scanner(System.in).nextLine().split(",");
//       Student student= new Student(1, "Bunath" , 12 , new String[]{"DevOps" ,"DataAnalyst"} , classes );
//       students.add(student);
//        Student student1= new Student(2, "Bunath" , 12 , new String[]{"DevOps" ,"DataAnalyst"} , classes );
//        students.add(student);
//        students.add(student1);

//        System.out.println(" old list :" + students);
//        for (model.StudentO student2 : students)
//        {
//            if(student2.getId().equals(id))
//            {
//                student2.setName("Nana");
//            }
//        }
//        System.out.println("New List" + students);
//        System.out.println("Before to  deleted element ");
//        System.out.println(students);
//        System.out.print("Input id  for  deleted element ");
//        Integer deletedId = new Scanner(System.in).nextInt();
//        Student deletedElement  = null;
//        for (Student stud : students) {
//            if (stud.getId().equals(deletedId)) {
//                deletedElement = stud;
//            }
//        }
//        students.remove(deletedElement);
//        System.out.println("After to  deleted element ");
//        System.out.println(students);
//        StudentO student1 = new StudentO();
//        student1.show();
//         String  name = "Nana";
//         name = "lolo" ;
//        System.out.println(name);
//        LinkedList<String> newname =  new LinkedList<>();
//        newname.add("Nana");
//        newname.add("lolo");
//        Iterator<String> it = newname.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        HashMap<String ,String>  hashMap = new HashMap<>();
        hashMap.put("ITE" , "Lyly");
        hashMap.put("Java" , "Nana");
        hashMap.put("Python" , "Python");
        System.out.println(hashMap);
        System.out.println(hashMap.get("ITE"));

  }
}