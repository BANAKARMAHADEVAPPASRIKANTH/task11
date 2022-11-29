public class Student
{
    public String name;
    public String address;
    public int id;
    public double contact;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", contact=" + contact +
                '}';
    }

    public Student(String name, String address, int id, double contact) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.contact = contact;
    }


}
