package banking;

public class NormalAccount extends Account {

    public NormalAccount(String accountNumber, String ownerName, int balance, int interestRate) {
        super(accountNumber, ownerName, balance, interestRate);
    }

    @Override
    public void deposit(int amount) {
        setBalance(getBalance() + amount + (int)(getBalance() * getInterestRate() / 100.0));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NormalAccount that = (NormalAccount) o;
        return getBalance() == that.getBalance() &&
                getInterestRate() == that.getInterestRate();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
