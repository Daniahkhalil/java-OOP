public class BankAccount{
    private double checkingBalance;
    private double savingBalance;
    private static int  numberOfAccounts=0;
    private static double totalBalance=0;

    public BankAccount {
        numberOfAccounts++;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public String getSavingsBalance(){
        return this.savingsbalance;
    }

    public static int getNumberOfAccounts(){
        return numberOfAccounts;
    }

    public static double getTotalBalance(){
        return totalBalance;
    }

    public double depositeMoney(double amount , String account){
       if("Checking" == account){
            this.checkingBalance += amount;
            totalBalance+=amount;
            return this.checkingBalance;


       }else{
           this.savingBalance+=amount;
           totalBalance+=amount;
           return this.savingBalance;

       }
       
       
       
    }

    public double withdrawMoney(double amount, String account){
        if("Checking" ==account ){
            if(this.checkingBalance - amount >=0 ){
                this.checkingBalance -= amount;
                totalBalance-=amount;
                return this.checkingBalance;


            }else{
                System.out.println("Insufficient Funds");
                return this.checkingBalance;

            }
        }else{
                if(this.checkingBalance - amount >=0 ){
                this.savingsbalance -= amount;
                totalBalance-=amount;
                return this.savingBalance;


            }else{
                System.out.println("Insufficient Funds");
                return this.savingBalance;

            }

        }
       
       
       
    }

    public void displayCheckingAndSaving(){
        System.out.println("Checking Balance",+this.checkingBalance);
        System.out.println("Saving Balance",+this.savingBalance);

    }


}