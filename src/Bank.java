public class Bank {

    private String name;
    private long balance;
    private float card;

    public Bank(String name, long balance, float card) {
        this.name = name;
        this.balance = balance;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public float getCard() {
        return card;
    }

    public void setCard(float card) {
        this.card = card;
    }
}
