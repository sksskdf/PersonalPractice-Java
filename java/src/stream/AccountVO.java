package stream;

public class AccountVO {
    private long balance;
    private String number;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "AccountVO{" +
                "balance=" + balance +
                ", number='" + number + '\'' +
                '}';
    }
}
