import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    int[] selection = new int[5];

    public QuestionService(){
        questions[0] = new Question(1, "What do you learning now1?", "Java", "JavaScript", "Python", "Golang", 1);
        questions[1] = new Question(2, "What do you learning now2?", "Java", "JavaScript", "Python", "Golang", 2);
        questions[2] = new Question(3, "What do you learning now3?", "Java", "JavaScript", "Python", "Golang", 3);
        questions[3] = new Question(4, "What do you learning now4?", "Java", "JavaScript", "Python", "Golang", 4);
        questions[4] = new Question(5, "What do you learning now5?", "Java", "JavaScript", "Python", "Golang", 1);
    }
    // public void displayQuestion(){
    //     for(Question q : questions){
    //         System.out.println(q);
    //     }
    // }

    public void playQuiz(){
        // get data from keyboard by Scanner
        Scanner sc = new Scanner(System.in);

        for(Question q : questions){
            System.out.print("Q" + q.getID() + " : ");
            System.out.println(q.getQuestion());
            System.out.println("  1. " + q.getQtp1());
            System.out.println("  2. " + q.getQtp2());
            System.out.println("  3. " + q.getQtp3());
            System.out.println("  4. " + q.getQtp4());

            System.out.print("Enter your choice (1-4): ");
            int answer;
            while (true) {
                if (sc.hasNextInt()) {
                    answer = sc.nextInt();
                    if (answer >= 1 && answer <= 4) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    }
                } else {
                    System.out.print("Invalid input. Please enter a valid number.");
                    sc.next(); // clean data
                }
            }
        }
        sc.close();
    }

    public void printScore(){
        int score = 0;

        for(int i=0 ; i<questions.length; i++){
            Question que = questions[i];

            // Answer
            int actualAnswer = que.getAnswer();
            int userAnswer = selection[i];

            // Check Answer
            if (userAnswer == actualAnswer) {
                score = score + 1;
            }
        }

        System.out.println("Your Score = " + score);
    }
}
