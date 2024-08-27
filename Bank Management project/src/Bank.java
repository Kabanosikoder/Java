import java.util.*;

public class Bank{
   private String name;
   private List<Checking_Account> accounts;
   private static final int min_deposit = 100;
   private static final int max_withdraw = 500;

   public Bank(String name) {
      this.name = name;
      accounts = new ArrayList<>();

   }
   public boolean withdrawAmount(int amount, Person person) {
      if (getAccountByPerson(person).getBalance() - amount <= -max_withdraw){
         System.out.println("Cannot withdraw beyond 500");
         return false;
      }
      getAccountByPerson(person).withdrawAmount(amount);
      return true;
   }
   public boolean openBankAccount(Person person, int userDepot){
         boolean bankOpened = canOpenAccount(person,userDepot);

         if (bankOpened) {
            accounts.add(new Checking_Account(100, person.getSSN(),person));
         }
      return bankOpened;
   }
   public boolean canOpenAccount(Person person, int userDepot){
      boolean bankOpened = false;
      if(userDepot < min_deposit) {
         System.out.println("The deposit of " + userDepot + " is not enough, please deposit at least " + min_deposit);
         bankOpened = false;
      }else if(!person.isOlder(18)) {
         System.out.println(person.getFullName() + " isn't old enough to open a bank account...");
         bankOpened = false;

      } else{
         bankOpened = true;
      }
      return bankOpened;
   }

   public Checking_Account getAccountByPerson(Person person){
      for(Checking_Account account: accounts) {
         if(account.isAccountHolder(person)){
            return account;
         }
      }
      return null;
   }

}
