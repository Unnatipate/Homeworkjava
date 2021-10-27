import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks[] = new int[6];
        int i;
        float total = 0, avg;
        System.out.print("Enter name of student: ");
        String n = in.nextLine();
            System.out.print("Enter roll no of student: ");
            int r = in.nextInt();

                System.out.print("Enter marks in 1st subject: ");
            int m1 = in.nextInt();
            System.out.print("Enter marks in 2nd subject: ");
            int m2 = in.nextInt();
            System.out.print("Enter marks in 3rd subject: ");
            int m3 = in.nextInt();
            int t = m1 + m2 + m3;
            double p = t / 500.0 * 100.0;
            String g = "";
            avg=total/3;
        System.out.print("The student Grade is: ");
            if (p >= 80)
                g = "A+";
            else if (p >= 60)
                g = "A";
            else if (p >= 50)
                g = "B";
            else if (p >= 35)
                g = "C";
            System.out.println("Total Marks = " + t);
            System.out.println("Percentage = " + p);
            System.out.println("Grade = " + g);
        }
        //pass or fails on the basis of...student needs to pass all the subjects
        int num;
        Scanner reader = new Scanner(System.in);
        {
            System.out.println("Enter score: ");
            num = reader.nextInt();
            if (num >= 50) {
                System.out.println("Pass!");
            } else
                System.out.println("Fail!");
        }
    }

