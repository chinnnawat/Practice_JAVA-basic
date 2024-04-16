enum Laptop {
    Mackbook(2000), XPS(2100), Surface, ThinkPad(2300);

    private int price;

    // new price
    private Laptop(){
        price = 500;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        for( Laptop lap : Laptop.values() ){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }   
    }