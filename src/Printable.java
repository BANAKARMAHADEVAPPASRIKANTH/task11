public interface Printable {
    void print();
    default void msg() {
        System.out.println("default method");
    }
    void arithmetic();
    int a=0;
    public int b=1;
    public static final int c=10;
    final int d=2;
    static int e=3;
}
