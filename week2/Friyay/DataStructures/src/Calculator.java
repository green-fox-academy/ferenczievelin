import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the expression: ");
        Scanner scanner = new Scanner(System.in);
        String op = scanner.next();
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("The result is : " +calculator(op, firstNumber, secondNumber));


    }
    public static double calculator (String operation, int op1, int op2){
        double answer=0;
        switch (operation){
            case "+" :
                answer = op1 + op2;
                break;
            case "-" :
                answer = op1 - op2;
                break;
            case "*":
                answer = op1 * op2;
                break;
            case "/":
                answer = op1 / op2;
                break;
        }
        return answer;
        }
    }


