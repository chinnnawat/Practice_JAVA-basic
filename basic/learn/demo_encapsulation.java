class Human 
{
    private int age = 16;
    private String name = "John";

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }
}

public class demo_encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();

        // Show Age
        System.out.println(obj.getAge());

        // Show Name
        System.out.println(obj.getName());

        // Set Name
        obj.setName("Jane");
        System.out.println(obj.getName());
    }
}
