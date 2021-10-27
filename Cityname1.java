import java.util.Scanner;

public class Cityname1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            char a='a';
            char b='b';
            char c='c';
            char d='d';
            char e='e';
            char f='f';

            System.out.println("Enter cityname (a to f) : ");
            int cityname= scanner.nextInt();

            if(cityname == a) {

                System.out.println("anand");

            } else if(cityname == b) {

                System.out.println("baroda");

            } else if(cityname == c) {

                System.out.println("Chennai");

            } else if(cityname == d) {

                System.out.println("dehradun");

            } else if(cityname == e) {

                System.out.println("egypt");

            } else if(cityname == f) {

                System.out.println("faridabad");
                {

                System.out.println("Please enter weekday number between 1-7.");
            }

        }
    }

}
