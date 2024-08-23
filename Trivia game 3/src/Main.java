public class Main {
    public static void main(String[] args) {

        QandApairs qa1 = new QandApairs("Who is the goofiest goober?", "Gooberman");
        UserInput.input();

        if (UserInput.userAnswer.equals(qa1.answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect! The correct answer is: " + qa1.answer);
        }
    }



}