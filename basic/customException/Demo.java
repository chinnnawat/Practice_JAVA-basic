// custome Exception
class JohnException extends Exception{
    public JohnException(String string){
        super(string);
    }
}
public class Demo {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            if (j == 0) {
                throw new JohnException("I dont want to print zero");
            }
            j = 18/i;
        } catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("That is default output" + e);
        }  catch (Exception e){
            System.out.println("Something Went Wrong..." + e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
}