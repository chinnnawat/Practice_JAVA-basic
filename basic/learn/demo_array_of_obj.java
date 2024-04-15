/**
 * Innerdemo_array_of_obj
 */
class Student {
    int rollno;
    String name;
    int marks;
}
public class demo_array_of_obj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 85;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Jane";
        s2.marks = 86;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Junne";
        s3.marks = 87;

        // Make Object keep Data student
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].rollno+ " " + students[i].name+ " " + students[i].marks);
        }
    }
}
