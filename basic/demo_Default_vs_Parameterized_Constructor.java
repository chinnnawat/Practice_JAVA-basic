class Human_Default_vs_Parameterized_Constructor {
    private int age;
    private String name;

    public Human_Default_vs_Parameterized_Constructor() /*Default */
    {
        age = 12;
        name = "John";
    }

    public Human_Default_vs_Parameterized_Constructor(int a, String n) /*Parameterized Constructor */
    {
        age = a;
        name = n;
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


public class demo_Default_vs_Parameterized_Constructor {
    public static void main(String[] args) {
        Human_Default_vs_Parameterized_Constructor obj = new Human_Default_vs_Parameterized_Constructor();
        Human_Default_vs_Parameterized_Constructor obj1 = new Human_Default_vs_Parameterized_Constructor(18, "Jane");
        System.out.println(obj.getName() + " : " + obj.getAge()); /* null : 0*/
        System.out.println(obj1.getName() + " : " + obj1.getAge());

        // obj.setName("Ready");
        // obj.setAge(30);

        // System.out.println(obj.getName() + " : " + obj.getAge()); /* name : age*/
    }
}
