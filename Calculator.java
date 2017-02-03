
public class Calculator implements BasicCalculator {
    private int a, b, result, divResult;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

//почему проверку на 1000 и -1000 нельзя сделать в конструкторе?
//зачем в default делать исключение, а не просто sout ?
    public int getResult(String sign) throws MyException {
        if ((a < -1000 || a > 1000) || (b < -1000 || b > 1000)) {
            throw new MyException("ERROR: 1000 < number < -1000");
        } else {
            switch (sign) {
                case "+":
                    result = add(a, b);
                    break;
                case "-":
                    result = sub(a, b);
                    break;
                case "*":
                    result = multi(a, b);
                    break;
                case "/":
                    result = div(a, b);
                    break;
                default:
                    try {
                        throw new MyException(sign);
                    } catch (MyException e) {
                        System.out.println("ERROR: the sign does not right.");
                    }
            }
        }
        return result;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int multi(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        try {
            divResult = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ERROR: division by zero.");
        }
        return divResult;
    }
}
