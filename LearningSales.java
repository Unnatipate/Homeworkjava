 import java.util.Scanner;
    public class LearningSales{
        public static void main(String[] args) {
            String salesid;
            String name;
            double sale, comm = 0.0;
            int rate;
            Scanner scan = new Scanner(System.in);

            {

                System.out.println("Enter the sales id");//taking all the inputs from the user
                salesid = scan.next();
                System.out.println("Enter the seller's name");
                name = scan.next();
                System.out.println("Enter the sales amount");
                sale = scan.nextDouble();
                if (sale >= 50000) {
                    rate = 35;
                    comm = sale * 0.35;
                } else if (sale >= 30000) {
                    rate = 20;
                    comm = sale * 0.2;
                } else if (sale >= 20000) {
                    rate = 10;
                    comm = sale * 0.1;
                } else if (sale >= 10000) {
                    rate = 5;
                    comm = sale * 0.5;
                } else if (sale <= 10000) {
                    rate = 2;
                    comm = sale * 0.2;
                }
                System.out.println("commision amount=" + comm);

            }
        }
    }




