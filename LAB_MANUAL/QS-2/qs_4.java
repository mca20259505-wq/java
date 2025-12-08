class Demon{
    final int x = 5;
    final void display(){
        System.out.println("value of x is : "+x);
    }
}
final class Demon_jr{
    Demon_jr(){
        System.out.println("This is final class and can't be extended...");
    }
}
public class qs_4 {
    
    public static void main(String[] args) {
        Demon d = new Demon();
        d.display();
        Demon_jr dj = new Demon_jr();
    }
}
