public class Main {
    public static void main(String[] args) {

        // PEOPLE
        Person jonathan = new Person("Jonathan", "SkinWalker","Human",99723562,123);
        Person nex = new Person("Mateusz","RealOlive","Nex",16,543);
        Person finger = new Person("Rok","Finger","Lilek",15,192);

        //Bank
        Bank gb = new Bank("GooberBank");
        gb.openBankAccount(finger, 150); // not old enough for bank account so silly
        gb.openBankAccount(nex, 50); // not enough deposit haha poor
        gb.openBankAccount(jonathan,5000); // rich "human" and old enough for bank account

        System.out.println(gb.getAccountByPerson(jonathan).getBalance()); //5000
        gb.withdrawAmount(510, jonathan); // goober can't withdraw beyond the limit, get pranked

    }
}