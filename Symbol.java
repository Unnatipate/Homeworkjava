//it is number (0-9) or an alphabet or symbol
import java.util.Scanner;
public class Symbol {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter any character : ");
            char ch = scanner.next().charAt(0);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                System.out.println(ch + " is A ALPHABET.");

            } else if(ch >= '0' && ch <= '9') {

                System.out.println(ch + " is A Number.");

            } else {

                System.out.println(ch + " is A Symbol.");
            }

        }
    }

