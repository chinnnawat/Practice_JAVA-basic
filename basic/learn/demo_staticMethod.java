
class Mobile_StaticMethod {
    String brand;
    int price;
    String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // Static Method To use func show1
    public static void show1(Mobile_StaticMethod obj){
        System.out.println("Instatic Method");
    }
    
}

public class demo_staticMethod {
    public static void main(String[] args) {
        // Object 1
        Mobile_StaticMethod obj1 = new Mobile_StaticMethod();
        obj1.brand = "Apple";
        obj1.price = 1999;
        obj1.name = "SmartPhone";

        // Object 2
        Mobile_StaticMethod obj2 = new Mobile_StaticMethod();
        obj2.brand = "Sumsung";
        obj2.price = 1599;
        obj2.name = "SmartPhone";

        // Object3
        Mobile_StaticMethod obj3 = new Mobile_StaticMethod();
        obj3.brand = "Redmi";
        obj3.price = 899;
        obj3.name = "SmartPhone";

        Mobile_StaticMethod.show1(obj1);
    }
    
}