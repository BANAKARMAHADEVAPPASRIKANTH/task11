public class customer {
    String name;
    int cus_id;

    public customer(String name, int cus_id) {
        this.name = name;
        this.cus_id = cus_id;
    }
    void display(){
        System.out.println(name+cus_id);
    }
}
