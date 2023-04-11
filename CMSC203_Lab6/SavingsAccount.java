
public class SavingsAccount extends BankAccount
{
      private double rate = 0.025; 
      private int savingsNumber = 0; 
      private static String accountNumber; 
      
      public SavingsAccount(String name, double amount)
      {
            super(name,amount);
            String acntNumber = super.getAccountNumber();
            accountNumber = acntNumber + "-"+ savingsNumber; 
               
      }
      
      public SavingsAccount(SavingsAccount oldAccount, double amount)
      {
            super(oldAccount, amount);
            savingsNumber ++;
            String acntNumber = super.getAccountNumber();
            accountNumber = acntNumber + "-"+ savingsNumber; 
                         
      }
      
      public void postInterest()
      {
            double monthInterest = getBalance()*(1+(rate*0.0834));
            super.setBalance(monthInterest); 
      }
      
      public String getAccountNumber()
      {
            return accountNumber;
      }
}