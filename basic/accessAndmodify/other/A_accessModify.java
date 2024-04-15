package other;

class Launch{
    public void abc(){
        A_accessModify obj = new A_accessModify();
        System.out.println(obj.marks);
    }
}

public class A_accessModify {
    protected int marks = 6;

    public void show(){

    }
}
