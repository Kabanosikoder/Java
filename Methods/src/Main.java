public class Main {
    public static void main(String[] args) {
        String[] questions = new String[3];
        questions[0] = "How many states does the USA have?";
        questions[1] = "What is the chemical symbol for carbon";
        questions[2] = "What is the capital of France";

        String[] answers = new String[3]; // String[] = array
        answers[0] = "50";
        answers[1] = "C";
        answers[2] = "Paris";

        outputQuestionsAndAnswersXTimes(2, questions, answers);

        System.out.println(sum(10,12));




    }
    // make method names as long as they need to be to describe the use
    public static void outputQuestionsAndAnswersXTimes(int loopAmount, String[] questions, String[] answers){
        // axis modifiers = public static, return type = void and parameters = (int loopAmount)
      for (int y = 0; y < loopAmount; y++)
          extracted(questions, answers);
    }
    public static void extracted(String[] questions, String[] answers) {
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }
    }
    public static int sum(int x, int y){ // int = returns an integer
        return x+y;
    }

}