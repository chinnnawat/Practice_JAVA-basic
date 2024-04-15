class A_UpcaseAndDowncase{
    public void show1(){
        System.out.println("in A show");
    }
}
class B_UpcaseAndDowncase extends A_UpcaseAndDowncase{
    public void show2(){
        System.out.println("in B show");
    }
}

public class Demo_upcaseAnDdowncase {
    public static void main(String[] args) {
        // same thing
        //  same : A_UpcaseAndDowncase obj = (A_UpcaseAndDowncase)new B_UpcaseAndDowncase();
        A_UpcaseAndDowncase obj = new B_UpcaseAndDowncase(); /*Upcase */
        obj.show1();

        B_UpcaseAndDowncase obj2 = (B_UpcaseAndDowncase)obj; /* Downcase */
        obj2.show2();
    }
}
