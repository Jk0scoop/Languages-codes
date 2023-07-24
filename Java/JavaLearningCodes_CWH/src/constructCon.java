class myEmployee{
    private int id;
    private String name;
    myEmployee(){
        System.out.println("Hello world");
    }
    myEmployee(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

}
class copyConstructor{
    int a;
    String name;
    copyConstructor(int a, String name){
        System.out.println("Constructor Invoked");
        this.a = a;
        this.name = name;
    }
    copyConstructor(int a){
        System.out.println("Copy Constructor Invoked");
        this.a = a;
    }
}
public class constructCon {
    public static void main(String[] args) {
        copyConstructor cc = new copyConstructor(12,"vats");
        copyConstructor cc2 = new copyConstructor(1);

        System.out.println(cc.a);
        System.out.println(cc.name);
        System.out.println(cc2.a);
    }
}