package Banco.Contas.entity;

public class Account {

    private final int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initilDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initilDeposit);
    }

    public int getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // sacar
    public void withdram(double amount) {
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account{  " +
                "number= " + number +
                ", holder=' " + holder + '\'' +
                ", balance= " + String.format("%.2f",balance) +
                '}';
    }
}