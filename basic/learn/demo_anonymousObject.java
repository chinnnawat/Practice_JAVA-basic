package basic;
class A {
    public void show(){
        System.out.println("in A show");
    }

    public A(){
        System.out.println("Object Created");
    }

}

public class demo_anonymousObject {
    public static void main(String[] args) {
        new A().show(); // anonymous object
        
    }
}
