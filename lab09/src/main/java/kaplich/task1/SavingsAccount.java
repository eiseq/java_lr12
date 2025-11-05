package kaplich.task1;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return String.format("Номер сберегательного счёта '%s', баланс %.2f рублей, процент %.2f",
                getAccountNumber(), getBalance(), interestRate);
    }
}