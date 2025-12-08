// package LAB_MANUAL.QS-3;
class OverloadDemo{
    public void test(){
        System.out.println("test() with no params ");
    }
    public void test(int a){
        System.out.println("test() with single param : "+ a);
    }
    public void test(int a,int b)
    {
        System.out.println("test() with 2 params :" + ( a +  b));
    }
    public void test(double d)
    {
        System.out.println("test() with double param :" + d);
    }
}
public class qs_2 {
      public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        od.test();
        od.test(5);
        od.test(1,2);
        od.test(5.95);
      }    
}
