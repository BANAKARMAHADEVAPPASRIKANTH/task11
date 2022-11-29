public class account1 extends customer implements Bank1{

    int acc_no;
    float acc_bal;

    public account1(String name, int cus_id, int acc_no, float acc_bal) {
        super(name, cus_id);
        this.acc_no = acc_no;
        this.acc_bal = acc_bal;
    }

    public void show()
    {
        display();
        System.out.println(acc_bal+"    "+acc_no);
    }
    void interest()
    {
        show();
        float intr=(rate*acc_bal*no_of_years)/100;
        System.out.println(intr);
    }
}
