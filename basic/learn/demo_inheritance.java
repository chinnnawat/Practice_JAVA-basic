
public class demo_inheritance {
    public static void main(String[] args) {
        // AdvCalc is subclass of Calc(SuperClass)
        VeryAdv obj = new VeryAdv();

        // super
        int result1 = obj.add(1, 2);
        int result2 = obj.sub(3, 2);

        // subclass 1st
        int result3 = obj.mult(2, 3);
        int result4 = obj.div(4, 2);

        // subclass 2nd
        double result5 = obj.power(2, 10);

        System.out.println("result1 = "+ result1 + " : " + "result2 = " + result2+ " : " + "result3 = " + result3+ " : " + "result4 = " + result4 + " : " + "result5 = "+ result5);
    }
}
