import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class qs_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name to write data: ");
        String fileName = sc.nextLine();

        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter text to write into the file (type 'exit' to finish):");

            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(line + "\n");
            }

            writer.close();
            System.out.println("Data written to file successfully.");

            FileReader reader = new FileReader(fileName);
            System.out.println("\nContents of the file:");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
