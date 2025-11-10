interface Animal{
    public void AnimalSound();
    public void sleep();
}

interface Humans{
    public void HumanSound();
    public void sleep();
}

class Dog implements Animal{
    public void AnimalSound(){
        System.out.println("Dog is talking.....");
    }
    public void sleep(){
        System.out.println("dog is sleeping....");
    }
}

class Human implements Humans{
    public void HumanSound(){
        System.out.println("Humans are barking.....");
    }
    public void sleep(){
        System.out.println("they are sleeping ....");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        Dog d  = new Dog();
        Human h = new Human();

        d.AnimalSound();
        h.HumanSound();
    }
}
