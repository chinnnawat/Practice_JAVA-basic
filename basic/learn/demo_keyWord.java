class Human_Keyword {
    private int age = 16;
    private String name = "John";

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // set new name => change name Instance
    public void setName(String name){
        this.name = name;
    }

    // set new age => change age Instance
    public void setAge(Integer age){
        this.age = age;
    }
}
public class demo_keyWord {
    public static void main(String[] args) {
        Human_Keyword obj = new Human_Keyword();
        // System.out.println(obj.getName() + " : " + obj.getAge());

        obj.setName("Ready");
        obj.setAge(30);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}
