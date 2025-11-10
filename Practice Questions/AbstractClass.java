abstract class University{
    public abstract void setCollegeName();
    public abstract void getCollegeName();
    void getUniversityName(){};


}

class College extends University{
   
    public void setCollegeName(String college){
        String collegeName = college;

    }
}
public class AbstractClass{
    public static void main(String[] args) {
        College c1  = new College();
        
    }
}