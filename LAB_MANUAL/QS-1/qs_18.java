
public class qs_18 {
    static int volume(int height, int width, int depth) {
        return height * width * depth;
    }

    static void box() {
        System.out.println("Volume-1 :" + volume(110, 20, 15));
        System.out.println("Volume-2 :" + volume(23, 9, 6));
    }

    public static void main(String[] args) {
        box();
    }
}
