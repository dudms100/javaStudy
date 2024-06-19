package banking;

public class HighCreditAccount extends Account {
    private String creditRating;
    private static final double BASE_INTEREST_RATE = 0.02;

    public HighCreditAccount(String accountNumber, String ownerName, int balance, int interestRate, String creditRating) {
        super(accountNumber, ownerName, balance, interestRate);
        this.creditRating = creditRating;
    }

    public String getCreditRating() {
        return creditRating;
    }

    @Override
    public void deposit(int amount) {
        setBalance((int) (getBalance() + (getBalance() * (getInterestRate() / 100.0)) + (getBalance() * getAdditionalInterestRate()) + amount));
    }

    @Override
    public void withdraw(int amount) {
        if (amount > getBalance()) {
            System.out.println("잔고가 부족합니다. 금액 전체를 출금할까요?");
            System.out.print("YES: 금액 전체 출금처리 / NO: 출금 요청 취소\n선택: ");
            String answer = AccountManager.scanner.nextLine();
            if (answer.equalsIgnoreCase("YES")) {
                setBalance(0);
                System.out.println("계좌에서 모든 금액을 출금했습니다.");
            } else {
                System.out.println("출금 요청을 취소합니다.");
            }
        } else {
            setBalance(getBalance() - amount);
            System.out.println("출금이 완료되었습니다.");
        }
    }

    @Override
    public void showAccountInfo() {
        System.out.println("-------------");
        System.out.println("계좌번호>" + getAccountNumber());
        System.out.println("고객이름>" + getOwnerName());
        System.out.println("잔고>" + getBalance());
        System.out.println("기본이자>" + getInterestRate() + "%");
        System.out.println("신용등급>" + getCreditRating());
    }

    private double getAdditionalInterestRate() {
        switch (creditRating) {
            case "A":
                return BASE_INTEREST_RATE + 0.07;
            case "B":
                return BASE_INTEREST_RATE + 0.04;
            case "C":
                return BASE_INTEREST_RATE + 0.02;
            default:
                return BASE_INTEREST_RATE;
        }
    }
}
