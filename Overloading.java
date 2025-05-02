public class Overloading {
    Overloading(String name){
        System.out.println("Constructor with one"+"String and Integer:"+name);

    }
    Overloading(String name,int age){
        System.out.println("Constructor with two"+"String and Integer:"+name+""+age );

    }
    Overloading(long id){
        System.out.println("Constructor with one parameter:"+ "Long"+id );

    }
}
class Faria{
    public static void main(String[] args) {
        Overloading geek2=new Overloading("Taki");
        Overloading geek3=new Overloading("Abir",28);
        Overloading geek4=new Overloading(479823868);
    }
}