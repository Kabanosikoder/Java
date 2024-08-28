import java.time.LocalDateTime;
import java.util.function.Supplier;

// CHECK OUT: https://stackoverflow.com/questions/40244571/when-we-should-use-supplier-in-java-8
public class Main {
    public static void main(String[] args) {
        // parameter -> expression
        // (n) --> return
        // () --> return
        // (n) -->
        


        LocalDateTime dateTime = LocalDateTime.now();
        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now(); // the empty parentheses represents a method with no parameters
        // supplier will load the time, updating the variable

        System.out.println(dateTime);
        System.out.println(dateSupplier.get());

        System.out.println("Waiting for 3 Seconds!");
        // Sleep for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(dateTime);
        System.out.println(dateSupplier.get());
    }
}