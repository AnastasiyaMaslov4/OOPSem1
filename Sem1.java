import java.util.ArrayList;

public class Sem1 {
    public static void main(String[] args) {
        
        HotWater coffe = new HotWater("Cappuchino", 111, 150, 300, 80);
        HotWater coffe1 = new HotWater("Americano", 112, 120, 400, 90);
        HotWater tea = new HotWater("Black tea", 113, 100, 300, 100);
        HotWater tea2 = new HotWater("Green tea", 114, 120, 300, 90);

        ArrayList<HotWater> hotProducts= new ArrayList<>();
    
        hotProducts.add(0, coffe);
        hotProducts.add(1, coffe1);
        hotProducts.add(2, tea);
        hotProducts.add(3, tea2);

        for (var el : hotProducts) {
            System.out.println(el.getName());
        }

        HotDrinksAutomat hdAutomat = new HotDrinksAutomat(100, 100, 10000);
        hdAutomat.initHotDrinks(hotProducts);
        hdAutomat.getName(111);

        hdAutomat.getName(112, 400, 90);
        hdAutomat.getName(0, 0, 0);
        
    }
}
