// @FunctionalInterface
interface A {
    // void show(int i);
    int add(int i, int j);
}

public class Demo {

    public static void main(String[] args) {
        // E.g.
        // ****************Full***************
        // A obj = new A() {
        //     public void show(int i){
        //         System.out.println("in show" + i);
        //     }
        // };

        // *****************Cut for use****************
        // A obj = (i) -> System.out.println("in show" + i);
        // obj.show(5);

        A obj = (i,j) -> {
            return i+j;
        };

        int result = obj.add(1, 2);
        System.out.println(result);
    }
}