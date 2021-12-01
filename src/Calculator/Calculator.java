package Calculator;

import java.util.Scanner;

public class Calculator {
    double firstNumber;
    double secondNumber;

    public Calculator() {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        input();
    }

    public void input() {
        System.out.println("Введіть перше число");
        Scanner input = new Scanner(System.in);
        firstNumber = input.nextDouble();
        System.out.println("Введіть друге число");
        secondNumber = input.nextDouble();
    }

    public class DivExtencion extends ArithmeticException {
        public double cheking(double secondNumber) {
            try {
                if (secondNumber == 0) ;
            } catch (Exception e) {
                System.out.println("Не можна ділити на 0");
                return 0;
            }
            return secondNumber;
        }
    }

    DivExtencion divExtencion = new DivExtencion();


    public double add() {
        return firstNumber + secondNumber;
    }

    public double min() {
        return firstNumber - secondNumber;
    }

    public double mul() {
        return firstNumber * secondNumber;
    }

    public double div() throws DivExtencion {
        if (divExtencion.cheking(secondNumber) == 0) {
            System.out.println("Код: ");
            return -1;
        }
        return firstNumber / secondNumber;
    }
}
