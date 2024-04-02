public class Main {
    public static void main(String[] args) {
        String q1 = "What is the capital of France";
        String q2 = "What is the chemical symbol for carbon";
        String q3 = "Who is your favorite son";

        String answer1 = "Paris";
        String answer2 = "C";
        String answer3 = "Kaspian";

        // Lists
        String[] questions = new String[3];
        questions[0] = "What is the capital of France";
        questions[1] = "What is the chemical symbol for carbon";
        questions[2] = "Who is your favorite son";

        String[] answers = new String[3];
        answers[0] = "Paris";
        answers[1] = "C";
        answers[2] = "Kaspian";

        System.out.println(questions[0]);
        System.out.println(answers[0]);

        questions[0] = "How old is Connor Mcgregor in 2024?";
        System.out.println(questions[0]);
        System.out.println(questions[0]);

        System.out.println(questions.length);

        //ArrayIndexOutOfBoundsException (uncomment line below)

        // System.out.println(questions[3]);

        // if 3 elements, start with 0, 2 is the highest index
    }
}