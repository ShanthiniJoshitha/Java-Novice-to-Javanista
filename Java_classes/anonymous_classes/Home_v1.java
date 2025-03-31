package anonymous_classes;

public class Home_v1 {

    private String type;
    private String city;
    private int areaSqFt;

    public Home_v1(String type, String city, int areaSqFt) {
        this.type = type;
        this.city = city;
        this.areaSqFt = areaSqFt;
    }

    public String getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public int getAreaSqFt() {
        return areaSqFt;
    }

    @Override
    public String toString() {
        return String.format("\nType: %s, city: %s, area: %d", type, city, areaSqFt);
    }
}
