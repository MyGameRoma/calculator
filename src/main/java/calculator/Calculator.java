package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] args) {
        String a = args[0];
        String op = args[1];
        String b = args [2];



        var result = calc(args[0], args[1], args[2]);

            if (args.length == 5) {
                String op2 = args [3];
                String c = args [4];
                result = calc(Double.toString(result), op2, args[4]);
            }

        return Double.toString(result);
    }


    double calc(String stra, String op, String strb) {
        double a = Double.parseDouble(stra);
        double b = Double.parseDouble(strb);
        double result;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;

            default:
                result = 0;


        }
        return result;
    }
}
