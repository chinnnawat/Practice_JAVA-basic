abstract class A{
    public abstract void show();
    public abstract void config();
}
class B extends A {
    public void show(){
        System.out.println("in B show");
    }
    public void config(){
        System.out.println("in config");
    }
}

public class Demo {
    public static void main(String[] args) {
        
        A obj = new B();
        obj.show();
        obj.config();
    }
}