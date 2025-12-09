class Animal{
    void Sound()
    {
        System.out.println("animal makes sound, hoop!! HOOP!!");
    }
}
class Dog extends Animal{
    @Override
    void Sound()
    {
        System.out.println("animal makes sound,weep!! weep!!");
    }
}
public class qs_5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Sound();
    }
}
