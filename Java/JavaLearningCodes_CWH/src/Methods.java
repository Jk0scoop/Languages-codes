import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //class_name identifier = new class_name();
        calculate ca = new calculate();
        Scanner sc = new Scanner(System.in);


        float a = 5f;
        float b = 7f;
        float c = sc.nextFloat();
        System.out.println(ca.sum(a,b,c));
    }

}
class calculate{
    int logic(int x,int y){
        int c=0;
        if(x>y){
            c = x+y;
        }
        else {
            c = (x+y)*5;
        }
        return c;
    }

    float sum(float x,float y)
    {
        return x+y;
    }
    float sum(float x, float y, float z){
        return x+y+z;
    }
}
