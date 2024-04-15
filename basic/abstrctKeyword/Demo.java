
abstract class Car {
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }

    public void fly(){
        System.out.println("Flying...");
    }
}

class UpdateWaganR extends WagonR{
    public void fly(){
        System.out.println("Flying...");
    }
}

public class Demo {

    public static void main(String[] args) {
        Car obj = new UpdateWaganR();
        obj.drive();
        obj.playMusic();
        obj.fly();

    }
}