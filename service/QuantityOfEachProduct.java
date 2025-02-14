package service;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class QuantityOfEachProduct {

    public LinkedHashMap<String, Integer> CountEachProduct(LinkedHashSet<String> set, String[] inputArray){
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        int count = 0;
        for (String i : set) {
            for (String j : inputArray) {
                if (i.equals(j)) {
                    count += 1;
                }
            }
            result.put(i, count);
            count = 0;
        }
        return result;
    }
}
