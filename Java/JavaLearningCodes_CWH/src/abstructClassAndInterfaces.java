abstract class Parent{
    Parent()
    {
        System.out.println("constructor of base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
}
class child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}


interface Hello{
    public void turnLeft();
    public void turnRight();
    public void moveForward();
}

 class greet implements Hello{
    public void turnLeft(){

    }
    public void turnRight(){

    }
    public void moveForward(){

    }
}





public class abstructClassAndInterfaces {
    public static void main(String[] args) {
    }
}
