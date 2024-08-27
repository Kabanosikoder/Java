public class Checking_Account {
    private int balance;
    private int accountID = Person.SSN;
    private Person accountHolder;

    public Checking_Account(int balance, int accountID, Person person) {
        this.balance = balance;
        this.accountID = accountID;
        this.accountHolder = person;
    }

    public int getBalance() {
        return balance;
    }

    protected int depositAmount(int deposit){
        balance += deposit; //cannot do .add to primitive data types like int
        return balance;
    }
    protected int withdrawAmount(int withdraw){
        balance -= withdraw;
        return balance;
    }
    protected boolean isAccountHolder(Person person){
        accountID = Person.SSN ;
        return true;
    }
    protected boolean isAccountSSN(int accountID){
        if (accountID == Person.SSN) {
            System.out.println("This is your account");
            return true;
        } else System.out.println("This isn't your account");
        return false;
    }

}
