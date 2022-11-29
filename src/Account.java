public class Account {
    private long accno;
    private String name,email;
    private float amount;
    private double contact;

    public Account(long accno, String name, String email, float amount, double contact) {
        this.accno = accno;
        this.name = name;
        this.email = email;
        this.amount = amount;
        this.contact = contact;
    }

    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public double getContact() {
        return contact;
    }

    public void setContact(double contact) {
        this.contact = contact;
    }
}
