//import java.util.Scanner;

//import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the calculator app!!");
        System.out.print("Press 'enter key' to enter:");
        int enterKey=System.in.read();
        Scanner keyboardInput=new Scanner(System.in);
        String exitLoop="y";
        while(exitLoop.equalsIgnoreCase("y")) {
            if (enterKey == 10) {
                Tools getOperation=new Tools();
                String operation=getOperation.whatOperation();
                OperationCore coreObj=new OperationCore();
                coreObj.myCases(operation);
                System.out.print("Do you want to continue?(\"Y\"=yes) :");
                exitLoop=keyboardInput.next();
            }
            else {
                break;
            }
        }
    }
}
