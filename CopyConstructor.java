import java.sql.SQLOutput;

public class CopyConstructor {
    String name;
    int id;
    CopyConstructor(String name, int id){
        this.name=name;
        this.id=id;
    }
    CopyConstructor(CopyConstructor obj2)
    {
        this.name=obj2.name;
        this.id=obj2.id;
    }

}
class copy{
    public static void main(String[] args) {
        System.out.println("First Object");
        CopyConstructor geek1=new CopyConstructor("Suvom",67);
        System.out.println("Name: "+geek1.name+" and ID: "+geek1.id);
        System.out.println( );
        //This would invoke the copy constructor
        CopyConstructor geek2=new CopyConstructor(geek1);
        System.out.println("Copy Constructor used second object");
        System.out.println("Name:"+geek2.name+" and ID:"+geek2.id);

    }
}