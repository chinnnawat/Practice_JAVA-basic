class A {
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class B extends A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}
public class Demo {

    public static void main(String[] args) {
        B obj;
        obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}