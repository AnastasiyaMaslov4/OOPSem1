/**
 * product
 * @param name - Name
 * @param price - Price
 * @param id - ID
 * @param massa - Massa
 */
public abstract class Product {

    private String name;
    private Integer price;
    private Integer id;
    private Integer massa;

    public Product(String name, Integer id, Integer price, Integer massa) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.massa = massa;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMassa() {
        return massa;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMassa(Integer massa) {
        this.massa = massa;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}