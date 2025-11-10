import java.io.File;
import java.io.IOException;

public class FileHandling{
    public static void main(String[] args) {
        try{
            File f = new File("ISTAR.txt");
            if (f.createNewFile()){
                System.out.println("file created   " + f.getName());
            }else{
                System.out.println("Something went wrong!!");
            }
        }catch (IOException e){
            System.out.println("exception called");
            e.printStackTrace();
        }
    }
}