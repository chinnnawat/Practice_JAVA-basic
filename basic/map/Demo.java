import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        
        Map<String, Integer> students = new HashMap<>();

        students.put("Mark", 56);
        students.put("North", 23);
        students.put("John", 67);
        students.put("Kavin", 92);

        System.out.println(students.get("Mark"));
    }
}