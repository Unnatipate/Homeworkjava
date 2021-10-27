import java.util.Scanner;
public class OddEven {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First number");

        int number=scanner.nextInt();
        System.out.println("Enter Second number");
        int a=scanner.nextInt();

        //Ternary operator to check Odd or Even
        String result=number%2==0 ? "Odd" : "Even";
        System.out.println(number +"is" + result);
        String name =a%2==0 ? "Odd" : "Even";
        System.out.println(a +"is" + name);

    }
}
