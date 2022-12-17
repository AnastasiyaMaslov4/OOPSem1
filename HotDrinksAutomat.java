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
        for (var el : HotProducts) {
            if (el.getId() == id) {
                System.out.println("Напиток: " + el.getName()); 
                break;
            }
        }
        
    }
    

    public void getName(Integer id, Integer massa, Integer temp) {
        for (var el : HotProducts) {
            if (el.getId().equals(id) && el.getMassa().equals(massa) && el.getTemperature().equals(temp)) {
                System.out.println("Напиток: " + el.getName()); 
                break;
            }
        }
    }
    
}
