package basic;
public class demo_array {

    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        // nums[4] = 5 ไม่มีจริง เพราะกำหนดข้อมูลแค่ 4 ตัวเท่านั้น
        // nums[4] = 5;
        for (int i = 0; i<4; i++){
            System.out.println(nums[i]);
        }

    }
}