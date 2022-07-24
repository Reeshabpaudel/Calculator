//import java.io.IOException;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator app!!");
        System.out.println("It  can perform +,-,/,* operations.(enter 'exit' to terminate)");
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        while(true) {
            System.out.print("Enter expression:");
            String expr = input.nextLine();
            if(expr.equals("exit")) break;
            String result=calc.solve(expr);
           if(!expr.equals(result)) {
               System.out.println(result);
           } else{
                System.out.println("The expression is not valid");
            }
        }
    }
}
