import java.util.ArrayList;

public class Calculator extends BaseCalculator {
    public String solve(String expr) {
        ArrayList<String> list = get_list(expr);
        return answer(list);
    }
    public String answer(ArrayList<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        int idx = 0;
        String result = "";

        if(list.contains("*") || list.contains("/")) {
            if((list.indexOf("/") > list.indexOf("*")  || !list.contains("/")) && list.contains("*")) {
                idx = list.indexOf("*");
                result = Operation.multiply(list.get(idx-1), list.get(idx+1));
            } else {
                idx = list.indexOf("/");
                result = Operation.divide(list.get(idx-1), list.get(idx+1));
            }
        } else if(list.contains("+") || list.contains("-")){
            if((list.indexOf("+") > list.indexOf("-")  || !list.contains("+")) && list.contains("-")) {
                idx = list.indexOf("-");
                result = Operation.reduce(list.get(idx-1), list.get(idx+1));
            } else {
                idx = list.indexOf("+");
                result = Operation.add(list.get(idx-1), list.get(idx+1));
            }
        }
        if(!list.contains("*") && !list.contains("+") && !list.contains("-") && !list.contains("/")){
            System.out.println("valid operator couldn't be found.");
        }
        list.set(idx-1, result);
        list.remove(idx+1);
        list.remove(idx);
        return answer(list);
    }
        public ArrayList<String> get_list(String expr){
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
        public static boolean is_opr(char a){
            return a == '+' || a == '-' || a == '/' || a == '*';
        }
}
