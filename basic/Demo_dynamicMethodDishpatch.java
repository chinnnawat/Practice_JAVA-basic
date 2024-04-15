class Computer_dynamicDispatch{

}

class Laptop extends Computer_dynamicDispatch{

}

class A_dynamicMethodDishpatch{
    public void show(){
        System.out.println("in show A");
    }
}

class B_dynamicMethodDishpatch extends A_dynamicMethodDishpatch{
    public void show(){
        System.out.println("in show B");
    }
}

class C_dynamicMethodDishpatch extends A_dynamicMethodDishpatch{
    public void show(){
        System.out.println("in show C");
    }
}

public class Demo_dynamicMethodDishpatch {
    public static void main(String[] args) {
        A_dynamicMethodDishpatch obj = new A_dynamicMethodDishpatch();
        obj.show();

        obj = new B_dynamicMethodDishpatch();
        obj.show();

        obj = new C_dynamicMethodDishpatch();
        obj.show();
    }
}
