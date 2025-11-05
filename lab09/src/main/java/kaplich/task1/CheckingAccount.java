package kaplich.task1;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public String toString() {
        return String.format("Номер расчётного счёта '%s', баланс %.2f рублей, лимит %.2f", getAccountNumber(), getBalance(), overdraftLimit);
    }
}
