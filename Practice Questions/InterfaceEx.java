interface Animal{
    public void AnimalSound();
    public void sleep();
}


class Dog implements Animal{
    public void AnimalSound(){
        System.out.println("Dog is barking");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}

public class InterfaceEx{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.AnimalSound();
        d.sleep();
    }
}