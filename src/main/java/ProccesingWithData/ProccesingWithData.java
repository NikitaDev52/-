package ProccesingWithData;

import Data.UserBuys;

import java.util.Comparator;
import java.util.Map;

public class ProccesingWithData {
    private UserBuys userBuys;

    public ProccesingWithData(UserBuys userBuys) {
        this.userBuys = userBuys;
    }

    public String getMaxCategory() {
        String maxCategory = userBuys.getMap().entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        Integer maxSum = userBuys.getMap().entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getValue).orElse(null);
        return String.format("{\"maxCategory\":{\"category\":\"%s\",\"sum\":%d}}", maxCategory, maxSum);
    }
}
