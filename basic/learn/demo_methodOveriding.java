class Calc_methodOveride {
    public int add(int n1, int n2){
        return n1 + n2 ;
    }
}

class AdvCalc_methodOveride extends Calc_methodOveride {
    public int add(int n1, int n2){
        return n1 + n2 + 1 ;
    }
}

public class demo_methodOveriding {
    public static void main(String[] args) {
        AdvCalc_methodOveride obj = new AdvCalc_methodOveride();

        // overide can do in JAVA
        System.out.println(obj.add(1,2));
    }
}
