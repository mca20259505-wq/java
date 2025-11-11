import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        try {
            File f = new File("ISTAR.txt");
            File f2 = new File("MCA.txt");

            if (f.createNewFile()) {
                System.out.println("files created   " + f.getName());
            } else {
                System.out.println("Something went wrong!!");
            }
            if (f2.createNewFile()) {
                System.out.println("files created   " + f2.getName());
            } else {
                System.out.println("Something went wrong!!");
            }

            FileWriter fw = new FileWriter("MCA.txt");
            FileWriter fw2 = new FileWriter("ISTAR.txt");

            fw.write("Hello!!! I am MCA!!");
            fw2.write("Hello!!! I am ISTAR");

            fw.close();
            fw2.close();

            Scanner scAppend = new Scanner(f2);
            FileWriter fwAppend = new FileWriter(f, true); // append mode
            while (scAppend.hasNextLine()) {
                fwAppend.write(scAppend.nextLine() + System.lineSeparator());
            }
            fwAppend.close();
            scAppend.close();

            Scanner sc1 = new Scanner(f);
            System.out.println("Reading ISTAR.txt file :");
            while (sc1.hasNextLine()) {
                System.out.println(sc1.nextLine());
            }
            sc1.close();

            Scanner sc2 = new Scanner(f2);
            System.out.println("Reading MCA.txt file :");
            while (sc2.hasNextLine()) {
                System.out.println(sc2.nextLine());
            }
            sc2.close();

        } catch (FileNotFoundException fe) {
            System.out.println("file not found");
            fe.printStackTrace();
        } catch (IOException e) {
            System.out.println("exception called");
            e.printStackTrace();
        }
    }
}