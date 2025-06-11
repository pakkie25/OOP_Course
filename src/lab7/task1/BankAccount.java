package lab7.task1;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }else{
            System.out.println("Початковий баланс не може бути від'ємним.");
            this.balance = 0;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0 ){
            this.balance = balance;
        } else {
            System.out.println("Баланс не може бути від'ємним.");
        }
    }
    public void  deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Успішно поповнено: " + amount);
            System.out.println("Тепер ваша сума складає: " +  balance);
        } else {
            System.out.println("Сума для поповвнення має бути більшою за 0");
        }
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Некоректна сума");
        }
        if (amount > balance){
            System.out.println("Не достатньо коштів");

        } else {
            balance -= amount;
            System.out.println("Успішно знято: " + amount);
        }
    }
    public String getAccountNumber() {
        return  accountNumber;
    }

}