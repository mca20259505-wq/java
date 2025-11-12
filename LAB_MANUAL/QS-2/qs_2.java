 class Person{
    String name;
    int age;
   
    Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name : " + this.name + "\n Age :" + this.age);
    }
}
class Child extends Person{
   

    Child(String name,int age)
    {
       super(name, age);
    }
    public void display()
    {
        System.out.println("child Name : " + this.name + "\n age : " + this.age);
    }
}
public class qs_2 {
    public static void main(String[] args) {
        Person p = new Person("rehan", 20);
        p.display();

        Child c = new Child("Rehan jr",20);
        c.display();
    }
}
