class Person{
    String name;
    int age;
    static String University = "CVM University";

    Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("name : " + name + "\n age : " + age + "\n University :" + University);
    }
    static void  getUniversity()
    {
        System.out.println("University : " + University);
        // System.out.println("name : " + name); error
    }
    static{
        System.out.println("class person is loaded...");
        University = "Nanjing University";
    }
}    
public class qs_3 {
    static int num = 5;
    public static void main(String[] args) {
        
        System.out.println("\nUniversity Name{from main direct} :" + Person.University);
        System.out.print("\ncalling static method without an object :" );Person.getUniversity();
        Person p  = new Person("rehan",20);

        num++;
        System.out.println("\nnumber of students :" + num + "\n");
        p.display();
        p.getUniversity();
    }   
}
