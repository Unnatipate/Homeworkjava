import java.util.Scanner;
public class Voting {

        public static void main(String []args){
            int age;
            Scanner sc=new Scanner(System.in);
            age=sc.nextInt();
            // get age from user

            if(age>18){

                System.out.println(" eligible for vote");

            }

            else{

                System.out.println("Not eligible for vote");

            }

        }

    }

