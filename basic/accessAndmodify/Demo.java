import other.*;
import other.tools.*;

class C_accessModify extends A_accessModify {
    public void abc(){
        System.out.println(marks);
    }
}

public class Demo {
    public static void main(String[] args) {
        A_accessModify obj = new A_accessModify();
        System.out.println(obj.marks);
        obj.show();

        B_accessModify obj1 = new B_accessModify();
        System.out.println(obj1.marks);

    }
}
