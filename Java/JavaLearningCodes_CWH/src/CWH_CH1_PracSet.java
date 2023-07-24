import java.util.Scanner;

public class CWH_CH1_PracSet {
    public static void main(String[] args) {
        //Question 1
        int a = 1;
        int b = 2,c = 3;
        a += b + c;
        System.out.println(a);

        //Question 2
        float sub1 = 45;
        float sub2 = 95;
        float sub3 = 65;
        float avg = (sub1+sub2+sub3)/30;
        System.out.println(avg);

        //Question 3
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!!");

        //Question 5
        System.out.println("Enter your Number");
        System.out.println(sc.hasNextInt());
    }
}
