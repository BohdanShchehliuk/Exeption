package Price;

public class Price {
    String product;
    String shop;
    int price;
    final int numbersOfshops = 2;

    public Price() {
        this.product = product;
        this.shop = shop;
        this.price = price;
    }

    @Override
    public String toString() {
        return product +" " + shop +" "+ price;
    }
}
