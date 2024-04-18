import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        // *********************Start***********************
        System.out.println("Enter a number");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
        // ********************End**************************

        // Can use Scanner instead
        // Scanner sc= new Scanner(System.in);
        // System.out.println(num);
    }
}