import java.util.Random;

public class BankAccount {

    public static int numAccounts = 0; 
    public static int numMoney = 0; 

    private double checkingBalance; 
    private double savingBalance;
    private long accountNumber;
    
    public BankAccount(){
        Random random = new Random();
        BankAccount.numAccounts++;
        this.checkingBalance = 0; 
        this.savingBalance = 0; 
        this.accountNumber =  (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingBalance;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public void depositToChecking(double money){
        this.checkingBalance += money;
        BankAccount.numMoney+= money;
    }

    public void depositToSavings(double money){
        this.savingBalance += money;
        BankAccount.numMoney+= money;
    }

    public String withdrawFromChecking(double money){
        if( money > this.checkingBalance){
            return "INSUFFICIENT FUNDS";
        }
        else{
            this.checkingBalance -= money;
            return "WITHDREW SUCCESSFULLY";
        }

    }

    public String withdrawFromSavings(double money){
        if( money > this.savingBalance){
            return "INSUFFICIENT FUNDS";
        }
        else{
            this.savingBalance -= money;
            return "WITHDREW SUCCESSFULLY";
        }
    }
}
