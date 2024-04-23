import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] questions = new String[5];
        questions[0] = "What is the capital of France?";
        questions[1] = "What is the chemical symbol for carbon?";
        questions[2] = "Who is your favorite son?";
        questions[3] = "Who was in Paris?";
        questions[4] = "Fortnite or Minecraft?";

        String[] answers = new String[5];
        answers[0] = "Paris";
        answers[1] = "C";
        answers[2] = "Kaspian";
        answers[3] = "Ninja";
        answers[4] = "Minecraft";

        Scanner scanner = new Scanner(System.in);
        int points = 0;

            for (int i = 0; i < questions.length; i++) {
                printQuestion(questions[i]);
                String userAnswer = scanner.next();
                if (isCorrectAnswer(userAnswer, answers[i])) {
                    System.out.println("That was correct");
                    points++;
                    System.out.println("You got " + points + " points!");
                } else {
                    System.out.println("Incorrect answer");
                    System.out.println("the Correct answer was " + answers[i]);
                }
            }
    }

    public static void printQuestion(String question){

        System.out.println(question);
    }
    public static boolean isCorrectAnswer(String userAnswer, String realAnswer){
        return userAnswer.equals(realAnswer);
        // this checks if 'userAnswer' is equal to 'realAnswer' using the .equals
    }
}