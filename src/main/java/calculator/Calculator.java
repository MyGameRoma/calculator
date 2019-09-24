package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] args) {
        double a = Double.parseDouble( args[0]);
        String op = args[1];
        double b = Double.parseDouble(args[2]);
        double result;
        switch (op) {
            case "+": result = a + b;
                break;
            case "-": result = a - b;
                break;
            case "*": result = a * b;
                break;
            case "/": result = a / b;
                break;

            default:
                result = 0;

        }


        return "" + result;
    }

}
