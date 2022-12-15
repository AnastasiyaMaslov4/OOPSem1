import java.util.ArrayList;
import java.util.Arrays;

public class Sem1 {
    public static void main(String[] args) {
        
        Product coffe = new HotWater("Cappuchino", 111, 150, 300, 80);
        Product coffe1 = new HotWater("Americano", 112, 120, 400, 90);
        Product tea = new HotWater("Black tea", 113, 100, 300, 100);

        ArrayList<Product> hotProducts= new ArrayList<>(Arrays.asList(coffe, coffe1, tea));

        Automat hotDrinksAutomat = new HotDrinksAutomat(1, 10, 10000, null);
        hotDrinksAutomat.initProducts(hotProducts);
        hotDrinksAutomat.
    }
}
