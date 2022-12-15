public abstract class Water extends Product {
    
    public Water(String name, Integer id, Integer price, Integer massa) {
        super(name, id, price, massa);
    }

    @Override
    public String toString() {
        return "Строка продукта \"вода\" : ";
    }
}
