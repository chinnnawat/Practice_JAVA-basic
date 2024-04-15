class Laptop_hashCode {
    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }

    // *************************** Source Action - Start *********************************
    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((model == null) ? 0 : model.hashCode());
    //     result = prime * result + price;
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Laptop_hashCode other = (Laptop_hashCode) obj;
    //     if (model == null) {
    //         if (other.model != null)
    //             return false;
    //     } else if (!model.equals(other.model))
    //         return false;
    //     if (price != other.price)
    //         return false;
    //     return true;
    // }
    // *************************** Source Action - End *********************************


    public boolean equals(Laptop_hashCode that){
        /* String use .equals*/
        /* int use == */
        if (this.model.equals(that.model) && this.price == that.price) {
            return true;
        }
        else {
            return false;
        }
    }

    
}

public class Demo_hashCode {
    public static void main(String[] args) {
        // obj1
        Laptop_hashCode obj1 = new Laptop_hashCode();
        obj1.model = "Jenovo";
        obj1.price = 23500;

        // obj2
        Laptop_hashCode obj2 = new Laptop_hashCode();
        obj2.model = "Jenovo";
        obj2.price = 23500;

        boolean result = obj1.equals(obj2);
        System.out.println(result);
    }
}
