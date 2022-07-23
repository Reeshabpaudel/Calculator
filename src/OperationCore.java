import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationCore {
    void myCases(String operations){
        int firstNum,secondNum;
        Tools actions=new Tools();
        Tools toReturnInt=new Tools();
        //default -> System.out.println("something missing here");
        /*default -> {
                System.out.println("You can only enter the operator in the list.");
                Tools getOperation = new Tools();
                String operation = getOperation.whatOperation();
                OperationCore coreObj = new OperationCore();
                coreObj.myCases(operation);
            }*/
        switch (operations) {
            case ("+"):
                firstNum=toReturnInt.returnInt();
                secondNum=toReturnInt.returnInt();
                actions.add(firstNum, secondNum);
                break;
            case ("*"):
                firstNum=toReturnInt.returnInt();
                secondNum=toReturnInt.returnInt();
                actions.multiply(firstNum, secondNum);
                break;
            case ("-"):
                firstNum=toReturnInt.returnInt();
                secondNum=toReturnInt.returnInt();
                actions.subtract(firstNum, secondNum);
                break;
            case ("%"):
                firstNum=toReturnInt.returnInt();
                secondNum=toReturnInt.returnInt();
                actions.modulusDivision(firstNum, secondNum);
                break;
            case ("/"):
                firstNum=toReturnInt.returnInt();
                secondNum=toReturnInt.returnInt();
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
