public class Operation extends BaseOperation {
    public static int addition(int x, int y) {return x + y;}
    public static int reduction(int x , int y) {return x - y;}
    public static int product(int x, int y) {return x * y;}
    public static String reduce(String a, String b) {
        if(Operation.is_int(a) && Operation.is_int(b)) {
            int x = Integer.parseInt(a), y = Integer.parseInt(b);
            return Integer.toString(reduction(x, y));
        }
        double x = Double.parseDouble(a), y = Double.parseDouble(b);
        return Double.toString(reduction(x, y));
    }
    public static String add(String a, String b) {
        if(Operation.is_int(a) && Operation.is_int(b)) {
            int x = Integer.parseInt(a), y = Integer.parseInt(b);
            return Integer.toString(addition(x, y));
        }
        double x = Double.parseDouble(a), y = Double.parseDouble(b);
        return Double.toString(addition(x, y));
    }
    public static String multiply(String a, String b) {
        if(Operation.is_int(a) && Operation.is_int(b)) {
            int x = Integer.parseInt(a), y = Integer.parseInt(b);
            return Integer.toString(product(x, y));
        }
        double x = Double.parseDouble(a), y = Double.parseDouble(b);
        return Double.toString(product(x, y));

    }
    public static String divide(String a, String b) {
        return Double.toString(division(
                Double.parseDouble(a),
                Double.parseDouble(b)
        ));
    }
    public static boolean is_int(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException NFex) {
            return false;
        }
        return true;
    }
}
