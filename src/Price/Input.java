package Price;

import java.util.Scanner;


public class Input {
    Price price = new Price();
    Price[] priceArray = new Price[price.numbersOfshops];

    public Object input() {
        for (int i = 0; i < price.numbersOfshops; i++) {
            priceArray[i] = new Price();
            System.out.println("Введіть дані продукту №" + (i + 1));
            Scanner prodact = new Scanner(System.in);
            priceArray[i].product = prodact.nextLine();
            Scanner shop = new Scanner(System.in);
            priceArray[i].shop = prodact.nextLine();
            Scanner price = new Scanner(System.in);
            priceArray[i].price = prodact.nextInt();
        }

        for (int i = 0; i < price.numbersOfshops; i++) {
            int resalt = 0;
            String stringForMethod = "";
            for (int k = i; k < price.numbersOfshops - 1; k++) {
                stringForMethod = priceArray[i].shop;
                resalt = priceArray[k].shop.compareTo(priceArray[k + 1].shop);
                if (resalt > 0) {
                    priceArray[k].shop = priceArray[k + 1].shop;
                    priceArray[k + 1].shop = stringForMethod;
                }
            }
        }


        return priceArray;
    }
}
