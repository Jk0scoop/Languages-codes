import java.util.Scanner;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My ID is " +id+ " and name is "+name);
    }
    int salary=12000;
    public int getSalary(){
        return salary;
    }
}


public class ClassesAndObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee vats;
        vats = new Employee();
        vats.id = sc.nextInt();
        vats.name = sc.next();
        vats.printDetails();

        Employee john = new Employee();
        john.id=7;
        john.name="4";
        int salary = john.getSalary();
        System.out.println(salary);
        john.printDetails();


    }
}
