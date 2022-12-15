import java.util.ArrayList;

public abstract class Automat {
    private Integer id;
    private Integer size;
    private Integer price;
    protected ArrayList<Product> nameProduct;

    public Automat(Integer id, Integer size, Integer price, ArrayList<Product> nameProduct) {
        this.id = id;
        this.size = size;
        this.price = price;
        this.nameProduct = nameProduct;
    }
    
    public ArrayList<Product> initProducts(ArrayList<Product> products) {
        nameProduct = products;
        return nameProduct;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void getName(Integer id) {
        for (int i = 0; i < nameProduct.size(); i++) {
           if (nameProduct.get(i).getId() == id) {
            System.out.println(nameProduct.get(i).getName()); 
           }
        }
    }

    public void getName(Integer id, Integer massa) {
        for (int el = 0; el < nameProduct.size(); el++) {
            if (nameProduct.get(el).getId() == id && nameProduct.get(el).getMassa() == massa) {
                System.out.println(nameProduct.get(el).getName()); 
            }
        }
    }
}

