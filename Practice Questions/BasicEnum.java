enum Level{
    LOW,
    MEDIUM,
    HIGH
}
public class BasicEnum {
   public static void main(String[] var0) {
      Level var1 = Level.HIGH;
      System.out.println(var1);



    //   Looping enum 
    for(Level var : Level.values())
    System.out.println(var);
   }



}
