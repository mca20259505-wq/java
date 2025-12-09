interface interface1{
    public void show();
}
interface interface2{
    public void display();
}

class A implements interface1,interface2 {
    public void show()
    {
        System.out.println("Hey there!!!");
    }

    public void display()
    {
        System.out.println("weep weep");
    }
}
public class qs_8 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.display();
    }
}
