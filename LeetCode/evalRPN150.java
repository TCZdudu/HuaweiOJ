import java.util.*;

public class evalRPN150 {
    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        List<String> sym = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
        Stack<Integer> res = new Stack<>();
        int a, b;
        for (String str : tokens) {
            if (sym.contains(str)) {
                switch (str) {
                    case "+":
                        res.push(res.pop() + res.pop());
                        break;
                    case "-":
                        res.push(Math.negateExact(res.pop() - res.pop()));
                        break;
                    case "*":
                        res.push(res.pop() * res.pop());
                        break;
                    case "/": {
                        a = res.pop();
                        b = res.pop();
                        res.push(b / a);
                        break;
                    }
                    default:
                        break;
                }
            } else {
                res.push(Integer.parseInt(str));
            }
        }
        return res.pop();
    }
}
