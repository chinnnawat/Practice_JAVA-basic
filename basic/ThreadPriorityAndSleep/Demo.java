class A extends Thread{
    public void run(){
        for(int i = 1; i<=100 ; i++){
            System.out.println("hi");
            
            // wait
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i<=100 ; i++){
            System.out.println("Hello");

            // wait
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Demo {

    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();

        // System.out.println(obj1.getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);

        obj.start();
        obj1.start();

    }
}