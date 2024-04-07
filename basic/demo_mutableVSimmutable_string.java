/**
 * demo_mutableVSimmutable_string
 */
public class demo_mutableVSimmutable_string {

    public static void main(String[] args) {
        String name = "John";
        name = name + " Olsen";
        System.out.println(name.charAt(9));

        String s1 = "John";
        String s2 = "john";

        System.out.println(s1 == s2);
    }
}