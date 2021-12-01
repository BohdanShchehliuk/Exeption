package Price;

import java.util.Arrays;

public class Main {
    public static void main (String [] arg) {
        Input input = new Input();
        input.input();
        System.out.println(Arrays.toString(input.priceArray));
    }
}
