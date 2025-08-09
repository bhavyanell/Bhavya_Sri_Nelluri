import java.util.Scanner;
public class Program1 {
    double a;
    double b;
    String operation;
    public Program1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }
    public double calculate() {
        switch (operation) {
            case "addition":
                return a + b;
            case "subtraction":
                return a - b;
            case "multiplication":
                return a * b;
            case "division":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation");
                return Double.NaN;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter operation (Addition, Subtraction, Multiplication, Division): ");
        String operation = sc.nextLine();
        Program1 calc = new Program1(a, b, operation);
        double result = calc.calculate();
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}
