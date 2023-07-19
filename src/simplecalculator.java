import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice = 'Y';

        while (choice == 'Y' || choice == 'y') {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.print("Do you want to perform another calculation? (Y/N): ");
            choice = scanner.next().charAt(0);
        }

        System.out.println("Thank you for using our calculator!");
    }
}

