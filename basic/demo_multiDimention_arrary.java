package basic;
public class demo_multiDimention_arrary {
    public static void main(String[] args) {

        // [rows][column]
        // Set the dimensions of nums
        int nums[][] = new int [3][4];

        // First Metrix
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                nums[i][j] = (int)(Math.random()*10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Second Metrix
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                nums[i][j] = (int)(Math.random()*10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
