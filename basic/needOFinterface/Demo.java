interface Computer {
    void code();
}

class Labtop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : faster");
    }
}

class Developer {
    public void devApp(Computer lab) {
        lab.code();
    }
}


public class Demo {

    public static void main(String[] args) {
        Developer john = new Developer();


        Computer desk = new Desktop();
        Computer lab = new Labtop();
        // john.devApp(lab);
        john.devApp(desk);
    }
}