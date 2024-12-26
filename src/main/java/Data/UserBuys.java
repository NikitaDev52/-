package Data;

import ProccesingWithData.ProccesingWithData;
import RequestProcessing.Entity;

import java.util.HashMap;
import java.util.Map;

public class UserBuys {
    private Map<String, Integer> buys = new HashMap<>();
    private Categories categories;

    public UserBuys (String fileName) {
        categories = new Categories(fileName);
    }


    public void addData(Entity entity) {
        String category = categories.getCategory(entity.getProduct());
        int value = Integer.parseInt(entity.getValue());

        buys.merge(category, value, Integer::sum);
    }
    public Map<String, Integer> getMap() {
        return buys;
    }
}
