import java.util.ArrayList;

public class HotDrinksAutomat extends Automat{

    public HotDrinksAutomat(Integer id, Integer size, Integer price, ArrayList<Product> nameProduct) {
        super(id, size, price, nameProduct);
    }

    @Override
    public void getName(Integer id, Integer massa, Integer temp) {
        for (int el = 0; el < nameProduct.size(); el++) {
            if (nameProduct.get(el).getId() == id && nameProduct.get(el).getMassa() == massa && nameProduct.get(el).getTemperature() == temp) {
                System.out.println(nameProduct.get(el).getName()); 
            }
        }
    }
    
}
