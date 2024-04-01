public class Main {
    public static void main(String[] args){
        // casting (spells)
        int loan = 750;
        float interestRate = 0.0525f;

        // cuts it off at zero
        int interest = loan * (int)interestRate;
        System.out.print(interest);

        float x = (int)50.5f + 20.6f;
        System.out.print(x);



    }
}