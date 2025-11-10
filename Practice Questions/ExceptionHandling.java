public class ExceptionHandling {
    static void checkAge(int age){
        if(age <= 18 ){
            throw new ArithmeticException("ur age is less than required");
        }
    }
    public static void main(String[] args) {
        try{
            // int[] numbers = {1,2,3,4,5};
            // System.out.println(numbers[10]);
            checkAge(17);
        // }catch(Exception e){
        //     System.out.println("error....");
        }finally{
            System.out.println("Inside Fiannly block.....");
        }

    }
}
