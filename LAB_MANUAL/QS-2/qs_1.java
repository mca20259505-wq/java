public class qs_1 {

    String name;
    int age;

    qs_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println(this.name + " " + this.age);
    }

    public static void main(String[] args) {
        qs_1 d = new qs_1("rehan", 20);
        d.display();
    }
}