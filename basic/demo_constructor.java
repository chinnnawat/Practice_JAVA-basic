class Human_Constructor {
    private int age;
    private String name;

    public Human_Constructor() {
        age = 12;
        name = "John";
    }

    // get
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    // set
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
}


public class demo_constructor {
    public static void main(String[] args) {
        Human_Constructor obj = new Human_Constructor();
        System.out.println(obj.getName() + " : " + obj.getAge()); /* null : 0*/
        obj.setName("Ready");
        obj.setAge(30);

        // System.out.println(obj.getName() + " : " + obj.getAge()); /* name : age*/
    }
}
