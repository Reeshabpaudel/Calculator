import java.util.Scanner;

public class Tools {
    public void add(int x, int y){
        System.out.println("the sum of "+x+" and "+y+" is "+(x+y));
    }
    public void subtract(int x, int y){
        System.out.println("the difference of "+x+" and "+y+" is "+(x-y));
    }
    public void multiply(int x, int y){
        System.out.println(x+" times "+y+" is "+(x*y));
    }
    public  void divide(int x, int y){
        try{
            System.out.println(x+" divided by "+y+" is "+(x/y));
        }catch (ArithmeticException ae){
            System.out.println("cannot be divided by zero.");
        }
    }
    public void modulusDivision(int x, int y){
        try {
            System.out.println("the remainder when "+x+" is divided by "+y+" is "+(x%y));
        }catch (ArithmeticException ae){
            System.out.println("cannot bo divided by zero.");
        }
    }
    public String whatOperation(){
        System.out.print("""
                        Press:
                         (+) for addition operation
                         (-) for subtraction operation
                         (*) for multiplication operation
                         (/) for division
                         (%) for modulus division
                         (=) for simple arithematic expression
                         :""");
        Scanner keyboardInput=new Scanner(System.in);
        String operation=keyboardInput.next();
        if(operation.equals("+")||operation.equals("-")||operation.equals("*")||operation.equals("/")||operation.equals("%")||operation.equals("=")) {
            return operation;
        } else{
            System.out.println("only the operators in the menu below are accepted :)");
            return whatOperation();
        }
    }
    public int returnInt(){
        System.out.print("enter number:");
        try{
            Scanner keyInt=new Scanner(System.in);
            int myInt=keyInt.nextInt();
            return myInt;
        }catch(java.util.InputMismatchException ex){
            System.out.println("Invalid input. Only  enter integer:)");
            return returnInt();
        }

    }
}
