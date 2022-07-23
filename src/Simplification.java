import java.util.ArrayList;
import java.util.Scanner;

public class Simplification {
    public static double solve() {
        System.out.print("enter the expression(eg, 2*5+6-3):");
        Scanner expInput = new Scanner(System.in);
        String expr = expInput.next();
        ArrayList<String> list = get_list(expr);
        double ans = answer(list);
        System.out.println(ans);
        return ans;
    }

    public static double answer(ArrayList<String> list) {
        int idx = 0;
        double result = 0;
        /*if (list.contains("-")) {
            idx = list.indexOf("-");
            result = Double.parseDouble(list.get(idx - 1)) - Double.parseDouble(list.get(idx + 1));
        }
        if (list.contains("+")) {
            idx = list.indexOf("+");
            result = Double.parseDouble(list.get(idx - 1)) + Double.parseDouble(list.get(idx + 1));
        }
        */

        if (list.contains("*")) {
            idx = list.indexOf("*");
            result = Double.parseDouble(list.get(idx - 1)) * Double.parseDouble(list.get(idx + 1));
        }
        if (list.contains("/")) {
            idx = list.indexOf("/");
            result = Double.parseDouble(list.get(idx - 1)) / Double.parseDouble(list.get(idx + 1));
        }
        if (!list.contains("/") && !list.contains("*")) {
            for (int loop = 0; loop < list.size(); loop++) {
                switch (list.get(loop)) {
                    case "-":
                        result = Double.parseDouble(list.get(loop - 1)) - Double.parseDouble(list.get(loop + 1));
                        list.set(loop-1, Double.toString(result));
                        list.remove(loop+1);
                        list.remove(loop);
                        return answer(list);
                    case "+":
                        result = Double.parseDouble(list.get(loop - 1)) + Double.parseDouble(list.get(loop + 1));
                        list.set(loop-1, Double.toString(result));
                        list.remove(loop+1);
                        list.remove(loop);
                        return answer(list);
                }
            }

            if (list.size() == 1) {
                return Double.parseDouble(list.get(0));
            }
        }
        //System.out.println(list);
        list.set(idx-1, Double.toString(result));
        list.remove(idx+1);
        list.remove(idx);
        return answer(list);
    }

        public static ArrayList<String> get_list (String expr){
            String buff;
            ArrayList<String> list = new ArrayList<>();
            int idx = 0;
            for (int i = 0; i < expr.length(); i++) {
                if (is_opr(expr.charAt(i))) {
                    buff = expr.substring(idx, i);
                    list.add(buff.trim());
                    list.add(expr.substring(i, i + 1));
                    idx = i + 1;
                } else if (i == expr.length() - 1) {
                    buff = expr.substring(idx);
                    list.add(buff.trim());
                }
            }
            return list;
        }

        public static boolean is_opr( char a){
            return a == '+' || a == '-' || a == '/' || a == '*';
        }

}