import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("Enter two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a - b > 0){
            System.out.println("Differance is Positive");
        }
        else if(a - b < 0){
            System.out.println("Differance is Negative");
        }
        else {
            System.out.println("they are same");
        }

        if(a == 1)
        {
            System.out.println("a is 1");
            if(a>0)
            {
                System.out.println("a is positive");
            }
            else {
                System.out.println("a is negative");
            }
        }
        else
        {
            System.out.println("a is not 1");
        }
         */

        //Switch-case(Enhanced)
        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch (age) {
            case 19 -> System.out.println("You are 19");
            case 20 -> System.out.println("You are 20");
            case 40 -> System.out.println("You are 40");
            default -> System.out.println("Hello");
        }

        String name = sc.next();

        switch (name){
            case "hello" :
                System.out.println("Printed Hello");
                break;
            case "why":
                System.out.println("Printed Why");
                break;
            default:
                System.out.println("bas abhi");
                break;
        }
    }
}
