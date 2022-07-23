import java.io.IOException;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the calculator app!!");
        System.out.println("Calculator can do add, reduce, divide, product.");
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        String expr = "";
        while(true) {
            System.out.print("Expression:");
            expr = input.nextLine();
            if(expr.equals("exit")) break;
            System.out.println(calc.solve(expr));
        }
    }
}
