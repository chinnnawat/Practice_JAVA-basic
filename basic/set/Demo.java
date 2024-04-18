import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        // nums.add(6);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}