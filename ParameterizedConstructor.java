public class ParameterizedConstructor {
    String name;
    int id;
    int code;
    ParameterizedConstructor(String name,int id){
        this.name=name;
        this.id=id;

        }
    ParameterizedConstructor(String name, int id,int code){
        this.name=name;
        this.id=id;
        this.code=code;

    }
}
class Parameterized{
    public static void main(String[] args) {
        ParameterizedConstructor hello= new ParameterizedConstructor("Tahman",2723478,8945678);
        System.out.println("Name:"+hello.name+" ID:"+hello.id+" Code:"+hello.code);
    }
}
