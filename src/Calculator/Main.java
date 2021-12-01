package Calculator;

public class Main {
    public static void main(String[] arg) throws ArithmeticException {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add());
        System.out.println(calculator.min());
        System.out.println(calculator.mul());
        System.out.println(calculator.div());
    }
}
