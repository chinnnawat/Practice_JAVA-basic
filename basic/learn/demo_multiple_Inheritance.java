
class A extends Object{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int num) {
        System.out.println("In A INT Num");
    }
}

class B extends A{
    public B() {
        super();
        System.out.println("In B");
    }
    public B(int num) {
        //  super => A.A(int num)
        // super(num);
        this();
        System.out.println("In B INT Num");
    }
}

public class demo_multiple_Inheritance {
    public static void main(String[] args) {
        // B obj = new B();
        B_accessModify obj = new B_accessModify(5);
    }
}
