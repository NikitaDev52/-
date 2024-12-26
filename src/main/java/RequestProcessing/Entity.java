package RequestProcessing;

import java.time.LocalDate;

public class Entity {
    private String title;
    private String date;
    private String sum ;

    public Entity (String product, String date, String value) {
        this.title = product;
        this.date = date;
        this.sum = value;
    }

    public String getDate() {
        return date;
    }

    public String getProduct() {
        return title;
    }

    public String getValue() {
        return sum;
    }
}
