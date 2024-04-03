import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] questions = new String[3];
        questions[0] = "What is the capital of France";
        questions[1] = "What is the chemical symbol for carbon";
        questions[2] = "Who is your favorite son";

        String[] answers = new String[3];
        answers[0] = "Paris";
        answers[1] = "C";
        answers[2] = "Kaspian";

        // i++ increments by 1
        for(int i = 0; i < 100; i++){
            System.out.println(i);
        }
        // outputs all questions and answers
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            System.out.println(answers[i]);

        }
        // outputs all questions
        for(String question : questions){
            System.out.println(question);

        }
        Scanner scanner = new Scanner(System.in);

        // while loop: and this is endless
        while(true){
            System.out.println("Do u want to continue?");
            if(scanner.next().toLowerCase().equals("yes")){
                continue;
            }else{
                break;
            }

        }

    }
}