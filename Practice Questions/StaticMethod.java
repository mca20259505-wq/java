class School{
    static void ring(){
        System.out.println("ring ");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        School s = new School();
        s.ring();
    }
}
