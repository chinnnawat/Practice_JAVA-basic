// final - variable, method, class

class Calc_finalKeyword{
    public final void show(){
        System.out.println("By John");
    }

    public void add(int a, int b){
        System.out.println(a + b);
    }
}

class AdvCalc_finalKeyword extends Calc_finalKeyword{
    public void show(){
        System.out.println("By Jane");
    }
}

public class Demo_finalKeyword {
    public static void main(String[] args) {
        AdvCalc_finalKeyword obj = new AdvCalc_finalKeyword();
        obj.show();
        obj.add(1, 2);
    }
}
