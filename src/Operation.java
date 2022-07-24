public class Operation extends BaseOperation {
    public static int addition(int x, int y) {return x + y;}
    public static int reduction(int x , int y) {return x - y;}
    public static int product(int x, int y) {return x * y;}
    public static String reduce(String a, String b) {
        if(Operation.is_int(a) && Operation.is_int(b)) {
            int x = Integer.parseInt(a), y = Integer.parseInt(b);
            return Integer.toString(reduction(x, y));
        }
        if(Operation.is_float(a) && Operation.is_float(b)) {
            double x = Double.parseDouble(a), y = Double.parseDouble(b);
            return Double.toString(reduction(x, y));
        }
        return "only int and float numbers are accepted";
    }
    public static String add(String a, String b) {
        if(Operation.is_int(a) && Operation.is_int(b)) {
            int x = Integer.parseInt(a), y = Integer.parseInt(b);
            return Integer.toString(addition(x, y));
        }
        if(Operation.is_float(a) && Operation.is_float(b)) {
            double x = Double.parseDouble(a), y = Double.parseDouble(b);
            return Double.toString(addition(x, y));
        }
        return "only int and float numbers are accepted";
    }
    public static String multiply(String a, String b) {
        if(Operation.is_int(a) && Operation.is_int(b)) {
            int x = Integer.parseInt(a), y = Integer.parseInt(b);
            return Integer.toString(product(x, y));
        }if(Operation.is_float(a) && Operation.is_float(b)) {
            double x = Double.parseDouble(a), y = Double.parseDouble(b);
            return Double.toString(product(x, y));
        }
        return "only int and float numbers are accepted";

    }
    public static String divide(String a, String b) {
        if(Operation.is_int(a) && Operation.is_int(b)) {
            double x = Double.parseDouble(a), y = Double.parseDouble(b);
            return Double.toString(division(x, y));
        }if(Operation.is_float(a) && Operation.is_float(b)) {
            double x = Double.parseDouble(a), y = Double.parseDouble(b);
            return Double.toString(division(x, y));
        }
        return "only int and float numbers are accepted";
    }
    public static boolean is_int(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException NFex) {
            return false;
        }
        return true;
    }
    public static boolean is_float(String number){
        try{
            Float.parseFloat(number);
        }catch (NumberFormatException NFExF){
            return false;
        }
        return true;
    }
}
