import java.io.File;
import java.util.Scanner;

public class qs_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name or path: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File exists: Yes");
            System.out.println("Readable: " + (file.canRead() ? "Yes" : "No"));
            System.out.println("Writable: " + (file.canWrite() ? "Yes" : "No"));
            System.out.println("Type: " + (file.isFile() ? "File" : file.isDirectory() ? "Directory" : "Unknown"));
            System.out.println("File length: " + file.length() + " bytes");
        } else {
            System.out.println("File exists: No");
        }
       sc.close();
    }
}
