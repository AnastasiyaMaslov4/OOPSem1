import java.util.ArrayList;

public class HotDrinksAutomat extends Automat{

    private ArrayList<HotWater> HotProducts;

    public HotDrinksAutomat(Integer id, Integer size, Integer price) {
        super(id, size, price);
    }

    public ArrayList<HotWater> initHotDrinks(ArrayList<HotWater> Products) {
        HotProducts = Products;
        return HotProducts;
    }

    @Override
    public void getName(Integer id) {
        boolean flag = false;
        for (var el : HotProducts) {
            if (el.getId() == id)
                System.out.println("Напиток: " + el.getName()); 
                flag = true;
        }
        if (flag == false) System.out.println("Напиток не найден.");
    }
    

    public void getName(Integer id, Integer massa, Integer temp) {
        boolean flag = false;
        for (var el : HotProducts) {
            if (el.getId() == id && el.getMassa() == massa && el.getTemperature() == temp)
                System.out.println("Напиток: " + el.getName()); 
                flag = true;
        }
        if (flag == false) System.out.println("Напиток не найден.");
    }
    
}
