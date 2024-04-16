enum Status {
    Running, Failed, Pending, Success;
}
public class Demo {
    public static void main(String[] args) {

        Status s = Status.Pending;

        // if else
        if (s == Status.Running){
            System.out.println("All Good");
        } else if (s == Status.Failed) {
            System.out.println("Try Again");
        } else if (s == Status.Pending) {
            System.out.println("Please Wait");
        } else if (s == Status.Success) {
            System.out.println("Done");
        }

        // switch
        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }   
    }
}