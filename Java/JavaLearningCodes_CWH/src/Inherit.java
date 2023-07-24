class Base{
    int x;
    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void getMe()
    {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
}


public class Inherit {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(45);
        System.out.println(d.getX());

        //cases for constructor
        //1 TRUE runs Base class con.
        //Base a = new Base();
        //2 TRUE runs
        //Base a2 = new Derived();
        //3 FALSE
        //Derived a3 = new Base();
        //4 TRUE runs 1st Base class than Derived class con. will be called
        //Derived a4 = new Derived();

    }
}
