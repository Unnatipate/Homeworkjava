import java.util.*;
public class Emp {


    public static void main(String[]args){
         String employeeid;
         String empname;
         int basicsalary,HRA,DA,GS,incometax,Grosssalary;

        {
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter the employee id");//taking all the inputs from the user
            employeeid=scan.next();
            System.out.println("Enter the employee name");
            empname=scan.next();
            System.out.println("Enter the basic salary of an employee");
            basicsalary=scan.nextInt();

        }


        double da = 0.8 * basicsalary;
        double hra = 0.10 * basicsalary;
        double pf = 0.20 * basicsalary;
        double ta = 0.9 * basicsalary;
        double gs = basicsalary + da + hra+ta-pf;

        System.out.println("Gross salary = " + gs);
        }

    }




