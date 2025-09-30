 class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog's Barking");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Lion's roaring");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
       Animal a1 = new Animal();
       Dog d1 = new Dog();
       Animal a2 =new  Dog();
       Lion l1 = new Lion();
       Animal a3 =new  Lion();
       a1.sound();
       d1.sound();
       a2.sound();
       l1.sound();
       a3.sound();
    }
}
