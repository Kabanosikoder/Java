import jdk.incubator.vector.VectorOperators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TestException {
        // EXCEPTIONS, TRY & CATCH
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        checkForZero(i);

        // In general, you want the code to fail loud. Alarm bells n stuff

        int z = scanner.nextInt();

        try{
            checkForZero(z);
        } catch(Exception e){
            //Do something about this exception
            System.out.println("Caught exception!" + e.getMessage());
        } finally{
            // Doing something is happening regardless of caught or not
            System.out.println("Finally");
        }
        System.out.println("This happens always!");

    }

    private static void checkForZero(int number) throws TestException{
        if(number == 1) {
            throw new TestException("NUMBER IS ZERO!!");
        }
    }
}