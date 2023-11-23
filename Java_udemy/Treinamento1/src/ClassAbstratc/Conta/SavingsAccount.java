package ClassAbstratc.Conta;


public  class  SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    // atualizar o saldo com base taxa de juros
    public void updateBalance() {
        balance += balance * interestRate;
    }


    // final no metodo n deixa ele ser sobreprosto na subclass
    @Override
    public final void withdraw(double amount ){
        balance -= amount ;
    }
}
