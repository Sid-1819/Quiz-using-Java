import java.util.Objects;
import java.util.Scanner;

public class QuestionService {

    Question[] questions  = new Question[5];
    String[] sel = new String[5];

    public QuestionService(){
        questions[0] = new Question(1,"What is the captial of France?","London","Tokyo","Las Vegas","Paris","Paris");
        questions[1] = new Question(2,"What is the captial of India?","London","Mumbai","Delhi","Berlin","Delhi");
        questions[2] = new Question(3,"What is the captial of UK?","London","San Francisco","Riyadh","Madrid","London");
        questions[3] = new Question(4,"What is the captial of USA?","Tokyo","New York","Washington","Manchester","Washington");
        questions[4] = new Question(5,"What is the captial of Japan?","Mumbai","Bali","Tokyo","Cape Town","Tokyo");
    }


    public  void playQuiz(){
        int i =0;
        for(Question q:questions) {
            System.out.println("Question No."+q.getQuestionNumber());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println("=================================");
           // System.out.println("Answer: "+q.getAns());
            Scanner sc =new Scanner(System.in);
            sel[i] = sc.nextLine();
            i++;

        }
        for (String s :sel){
            System.out.println(s);
        }
    }

    public void answer() {
        int score =0;
        for(int i=0;i< questions.length;i++){
            Question que = questions[i];
            String correctAns = que.getAns();
            String userAns = sel[i];

            if(Objects.equals(correctAns, userAns)){
                score++;
            }
        }
        System.out.println("Final Score: "+score+ " out of 5");
    }
}
