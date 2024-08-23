import java.util.Scanner;

public class UserInput {

    public static String userAnswer;
    public static String answer;

    // Method to take input from the user
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(QandApairs.question);
        userAnswer = scanner.nextLine(); // Save the user's input to userAnswer
    }

    // Method to check if the user's answer is correct
    public boolean isCorrectAnswer(String input) {
        UserInput.answer = input; // Set the correct answer to the class's answer variable
        return userAnswer.equalsIgnoreCase(input); // Compare
    }

}

