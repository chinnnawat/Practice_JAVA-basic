class Mobile {
    String brand;
    int price;
    String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class demo_staticVariable {
    public static void main(String[] args) {

        // Object 1
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1999;
        obj1.name = "SmartPhone";

        // Object 2
        Mobile obj2 = new Mobile();
        obj2.brand = "Sumsung";
        obj2.price = 1599;
        obj2.name = "SmartPhone";

        // Object3
        Mobile obj3 = new Mobile();
        obj3.brand = "Redmi";
        obj3.price = 899;
        obj3.name = "SmartPhone";

        Mobile data[] = new Mobile[3];
        data[0] = obj1;
        data[1] = obj2;
        data[2] = obj3;

        for(int i=0; i<data.length; i++){
            data[i].show();
        }

    }
}
