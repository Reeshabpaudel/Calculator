import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationCore {
    void myCases(String operations){
        float firstNum,secondNum;
        Tools actions=new Tools();
        Tools toReturnInt=new Tools();
        switch (operations) {
            case ("+"):
                firstNum=toReturnInt.returnFloat();
                secondNum=toReturnInt.returnFloat();
                actions.add(firstNum, secondNum);
                break;
            case ("*"):
                firstNum=toReturnInt.returnFloat();
                secondNum=toReturnInt.returnFloat();
                actions.multiply(firstNum, secondNum);
                break;
            case ("-"):
                firstNum=toReturnInt.returnFloat();
                secondNum=toReturnInt.returnFloat();
                actions.subtract(firstNum, secondNum);
                break;
            case ("%"):
                firstNum=toReturnInt.returnFloat();
                secondNum=toReturnInt.returnFloat();
                actions.modulusDivision(firstNum, secondNum);
                break;
            case ("/"):
                firstNum=toReturnInt.returnFloat();
                secondNum=toReturnInt.returnFloat();
                actions.divide(firstNum, secondNum);
                break;
            case ("="):
                try {
                    Simplification getAnswer = new Simplification();
                    double answer = getAnswer.solve();
                    System.out.println("the result of the expressin is "+answer);
                }catch (NumberFormatException e){
                    System.out.println(" 'Invalid input format' do not:\n" +
                            "i)begin with a operator\n" +
                            "ii)do not enter string values\n" +
                            "iii)use only ( +,-,/,* ) operators");
                }catch (IndexOutOfBoundsException eob){
                    System.out.println("do not end the expression with operator");
                }
        }
    }
}
