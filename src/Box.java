public class Box {
    public double width;
    public double height;
    public double depth;

    public Box(double width, double height, double depth) {
        System.out.println("parameterd constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(double width, double height) {
        System.out.println("parametersied constor with overoading");
        this.width = width;
        this.height = height;
        depth=2;
    }
    Box (Box s)
    {
        System.out.println("copy constructor");
        height =s.height;
        depth =s.depth;
        width =s.width;
    }
    Box(){
        System.out.println("default constrcor");
        width=10;
        height=10;
        depth=10;
    }
    public double volume()
    {
       return (width*height*depth);
    }
}
