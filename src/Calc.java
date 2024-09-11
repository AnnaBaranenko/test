import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        double num1 = getNumber();

        char operation = getOperation();
        double num2 = getNumber();
        double result = calc(num1, num2, operation);
        System.out.println("результат: " + result);
    }

    public static double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("ошибка, повторите ввод");
            return getNumber();
        }
    }

    public static char getOperation() {
        Scanner sc = new Scanner(System.in);
        char operation;
        System.out.println("введите операцию!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("   ");
        operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                return '+';
            case '-':
                return '-';
            case '*':
                return '*';
            case '/':
                return '/';
            default:
                System.out.println("ошибка, повторите ввод");
                return getOperation();
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        if ((num2 != 0)) return num1 / num2;
        else System.out.println("делить на 0 нельзя");
        return Double.NaN;
    }

    public static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }
}