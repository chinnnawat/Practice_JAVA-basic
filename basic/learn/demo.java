package basic;
/**
 * Innerdemo
 */
class Computer {

    public void playMusic() {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10){
            return "Pen";
        } else {
            return "Nothing Pen";
        }
    }
}

/**
 * demo
 */
public class demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(8);
        System.out.println(str);
    }
}
