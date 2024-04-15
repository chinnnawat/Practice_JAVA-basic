public class Question {
    private int id;
    private String question;
    private String qpt1;
    private String qpt2;
    private String qpt3;
    private String qpt4;
    private int answer;

    public Question(int id, String question, String qpt1, String qpt2, String qpt3, String qpt4, int answer) {
        this.id = id;
        this.question = question;
        this.qpt1 = qpt1;
        this.qpt2 = qpt2;
        this.qpt3 = qpt3;
        this.qpt4 = qpt4;
        this.answer = answer;
    }

    // id
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    // question
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    // get qtp
    public String getQtp1() {
        return qpt1;
    }
    public String getQtp2() {
        return qpt2;
    }
    public String getQtp3() {
        return qpt3;
    }
    public String getQtp4() {
        return qpt4;
    }
    // set qtp
    public void setQtp1(String qpt1) {
        this.qpt1 = qpt1;
    }
    public void setQtp2(String qpt2) {
        this.qpt2 = qpt2;
    }
    public void setQtp3(String qpt3) {
        this.qpt3 = qpt3;
    }
    public void setQtp4(String qpt4) {
        this.qpt4 = qpt4;
    }

    // Answer
    public int getAnswer() {
        return answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    // to string
    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", qpt1=" + qpt1 + ", qpt2=" + qpt2 + ", qpt3=" + qpt3
                + ", qpt4=" + qpt4 + ", answer=" + answer + "]";
    }
}
