import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int points = 0;
        String q1 = "What is the capital of France";
        String q2 = "What is the chemical symbol for carbon";
        String q3 = "Who is your favorite son";

        String answer1 = "Paris";
        String answer2 = "C";
        String answer3 = "Kaspian";

        Scanner scanner = new Scanner(System.in);

        System.out.println(q1);
        String userInput1 = scanner.next();

        if(userInput1.equals(answer1)){
            System.out.println("Your answer was correct! And your answer was "+ userInput1);
        ++points;
        } else{
            System.out.println("Nah uh, you got the wrong answer buckaroo. Your answer was " + userInput1);
        }

        System.out.println(q2);
        String userInput2 = scanner.next();

        if(userInput2.equals(answer2)){
            System.out.println("Your answer was correct! And your answer was  "+ userInput2);
            ++points;
        } else{
            System.out.print("Wrong answer goofballs, your answer was  " + userInput2);
        }

        System.out.println(" ");
        System.out.println(q3);
        String userInput3 = scanner.next();

        if(userInput3.equals(answer3)) {
            System.out.println("Your answer was correct! And your answer was "+ userInput3);
            ++points;
        }else{
            System.out.println("Gay  "+userInput3);
        }
        System.out.println("You have "+points+" points susout of 3!!!");

    }

}