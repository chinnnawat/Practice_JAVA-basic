
class Mobile_StaticBlock {
    String brand;
    int price;
    static String name;


    public Mobile_StaticBlock()
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    static{
        name = "Phone";
        System.out.println("in static block");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class demo_staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile_StaticBlock");

        // // Obj1
        // Mobile_StaticBlock obj1 = new Mobile_StaticBlock();
        // // obj1.brand = "Apple";
        // // obj1.price = 1999;
        // // Mobile_StaticBlock.name = "SmartPhone";
    }
}
