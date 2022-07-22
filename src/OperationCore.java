import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationCore {
    void myCases(String operations){
        Tools toReturnInt=new Tools();
        int firstNum=toReturnInt.returnInt();
        int secondNum=toReturnInt.returnInt();
        Tools actions=new Tools();
        switch (operations) {
            case ("+") -> actions.add(firstNum, secondNum);
            case ("*") -> actions.multiply(firstNum, secondNum);
            case ("-") -> actions.subtract(firstNum, secondNum);
            case ("%") -> actions.modulusDivision(firstNum, secondNum);
            case ("/") -> actions.divide(firstNum, secondNum);
            //default -> System.out.println("something missing here");
            /*default -> {
                System.out.println("You can only enter the operator in the list.");
                Tools getOperation = new Tools();
                String operation = getOperation.whatOperation();
                OperationCore coreObj = new OperationCore();
                coreObj.myCases(operation);
            }*/
        }
    }
}
