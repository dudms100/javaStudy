package banking;

import java.util.Objects;

public abstract class Account {
    private String accountNumber;
    private String ownerName;
    private int balance;
    private int interestRate;

    public Account(String accountNumber, String ownerName, int balance, int interestRate) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public abstract void deposit(int amount);

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔고가 부족합니다. 금액전체를 출금합니다.");
            balance = 0;
        } else {
            balance -= amount;
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void showAccountInfo() {
        System.out.println("계좌번호>" + accountNumber);
        System.out.println("고객이름>" + ownerName);
        System.out.println("잔고>" + balance);
        System.out.println("기본이자>" + interestRate + "%");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}
