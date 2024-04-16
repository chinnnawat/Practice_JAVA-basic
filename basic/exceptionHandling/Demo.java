
public class Demo {

    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try{
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("connot divide by zero");
        }  catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("limit your arrays");
        } catch (Exception e){
            System.out.println("Something Went Wrong...");
        }

        System.out.println(j);
        System.out.println("bye");
    }
}