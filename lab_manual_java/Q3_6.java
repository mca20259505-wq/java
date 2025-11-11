interface info{
    public void studdetails();
   
}
class stud implements info{
    public void studdetails(){
        System.out.println("Name : kaifclash");
        System.out.println("Roll no : 47");
        System.out.println("Course :  MCA");

    }

}
public class Q3_6{
    public static void main(String[] args)
    {
        stud s1=new stud();
        s1.studdetails();
    }
}