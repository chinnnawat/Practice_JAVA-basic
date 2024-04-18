// ***********************FULL*****************************
// class A {
//     public void show() {
//         try {
//             Class.forName("Demo");
//         } catch(ClassNotFoundException e) {
//             System.out.println("Not able to find the class");
//         }
//     }
// }

// public class Demo {

//     static {
//         System.out.println("class Loaded");
//     }

//     public static void main(String[] args) {

//         A obj = new A();
//         obj.show();
//     }
// }

// **********************CUT************************
class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Demo");
    }
}

public class Demo {

    static {
        System.out.println("class Loaded");
    }

    public static void main(String[] args){

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}