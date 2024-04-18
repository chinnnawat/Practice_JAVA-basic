import java.util.ArrayList;
import java.util.List;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums.indexOf(5));
        System.out.println(nums.get(2));

        System.out.println("***************************************");

        for(int n : nums){
            System.out.println(n);
        }
    }
}