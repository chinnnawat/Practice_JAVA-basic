import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable <Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

}
public class Demo {

    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j){
                return i.age > j.age?1:-1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Mark"));
        studs.add(new Student(12, "North"));
        studs.add(new Student(18, "John"));
        studs.add(new Student(20, "Kavin"));

        Collections.sort(studs, com);
        for(Student s : studs){
            System.out.println(s);
        }

    }
}