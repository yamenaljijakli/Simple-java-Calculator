import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int num1,num2,sum;
    String sign;

        System.out.print("Enter a first number: ");
        num1 = input.nextInt();

        System.out.println("Chois the operation you would like to perform: ");
        System.out.println("+ - * /");
        sign = input.next();

        System.out.print("Enter a second number: ");
        num2 = input.nextInt();

        if(sign.equals("+")){
            sum = num1 + num2;
            System.out.printf("%d + %d = %d\n", num1, num2, sum);
        }
        else if(sign.equals("-")){
            sum = num1 - num2;
            System.out.printf("%d - %d = %d\n", num1, num2, sum);
        }
        else if(sign.equals("*")){
            sum = num1 * num2;
            System.out.printf("%d * %d = %d\n", num1, num2, sum);
        }
        else if(sign.equals("/")){
            sum = num1 / num2;
            System.out.printf("%d / %d = %d\n", num1, num2, sum);
        }
        else
            System.out.println("Invalid input");
        input.close();
    }
}