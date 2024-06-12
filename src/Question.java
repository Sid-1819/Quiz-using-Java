public class Question {
int questionNumber;
String question;
String opt1;
    String opt2;
    String opt3;
    String opt4;

    String ans;

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Question(int questionNumber, String question, String opt1, String opt2, String opt3, String opt4,String ans) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans =ans;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionNumber=" + questionNumber +
                ", question='" + question + '\'' +
                ", opt1='" + opt1 + '\'' +
                ", opt2='" + opt2 + '\'' +
                ", opt3='" + opt3 + '\'' +
                ", opt4='" + opt4 + '\'' +
                ", ans='" + ans + '\'' +
                '}';
    }
}
