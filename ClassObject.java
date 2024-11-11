import java.awt.desktop.AppReopenedEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

public class ClassObject {
    static class Student{
         private UUID ID ;
         private String fristname ;
         private String lastname;
         private int age;
         private String gender;

        public UUID getID() {
            return ID;
        }

        public void setID(UUID ID) {
            this.ID = ID;
        }

        public String getFristname() {
            return fristname;
        }

        public void setFristname(String fristname) {
            this.fristname = fristname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Student(UUID ID, String fristname, String lastname, int age, String gender) {
            this.ID = ID;
            this.fristname = fristname;
            this.lastname = lastname;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "ID=" + ID +
                    ", fristname='" + fristname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student [] students = new Student[2];
        students[0] = new Student(
                UUID.randomUUID(),
                "nana",
                "lolo",
                12,
                "M"
        );
        students[1] = new Student(
                UUID.randomUUID(),
                "nana",
                "popo",
                12,
                "M"
        );

        System.out.println(Arrays.toString(students));
    }
}
