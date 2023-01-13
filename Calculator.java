import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulo(double num1, double num2) {
        return num1 % num2;
    }

    public static double sin(double num) {
        return Math.sin(num);
    }

    public static double cos(double num) {
        return Math.cos(num);
    }

    public static double tan(double num) {
        return Math.tan(num);
    }

    public static double log(double num) {
        return Math.log10(num);
    }

    public static double ln(double num) {
        return Math.log(num);
    }

    public static double pow(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static double calculate(String operator, double num1, double num2) {
        switch (operator) {
            case "+":
                return add(num1, num2);
            case "-":
                return subtract(num1, num2);
            case "*":
                return multiply(num1, num2);
            case "/":
                return divide(num1, num2);
            case "%":
                return modulo(num1, num2);
            case "sin":
                return sin(num1);
            case "cos":
                return cos(num1);
            case "tan":
                return tan(num1);
            case "log":
                return log(num1);
            case "ln":
                return ln(num1);
            case "^":
                return pow(num1, num2);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter operation and follow the spacing (e.g. 1 - 2) or type 'q' to quit: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            String[] parts = input.split(" ");
            double num1 = Double.parseDouble(parts[0]);
            String operator = parts[1];
            double num2 = 0;
            if (parts.length > 2) {
                num2 = Double.parseDouble(parts[2]);
            }
            double result = calculate(operator, num1, num2);
            System.out.println("Result: " + result);
        }
    }
}
