public class HotWater extends Water{

    private Integer temperature;

    public HotWater(String name, Integer id, Integer price, Integer massa, Integer temp) {
        super(name, id, price, massa);
        this.temperature = temp;
    }

    public Integer getTemperature() {
        return temperature;
    }
   
}
