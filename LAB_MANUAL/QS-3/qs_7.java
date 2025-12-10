abstract class shape{
    abstract void number_of_sides();
}
class trapezoid extends shape{
    void number_of_sides()
    {
        System.out.println("Trapezoid has 4 sides...");
    }
}
class triangle extends shape{
    void number_of_sides(){
        System.out.println("triangle has 3 sides...");
    }
}
class hexagone extends shape{
    void number_of_sides()
    {
        System.out.println("hexagone has 6 sides...");
    }
}
public class qs_7 {
    public static void main(String[] args) {
        shape t1 = new trapezoid();
        shape t2 = new triangle();
        shape h1 = new hexagone();

        t1.number_of_sides();
        t2.number_of_sides();
        h1.number_of_sides();
    
    }
}
