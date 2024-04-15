/**
 * demo_stringBuffer_stringBuilder
 */
public class demo_stringBuffer_stringBuilder {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("John");
        sb.append(" Olsen");

        // Delete Any Char by Index position
        sb.deleteCharAt(9);

        // Insert Any Char by Index position
        sb.insert(0, "Player1 ");
        System.out.println(sb);
    }
}