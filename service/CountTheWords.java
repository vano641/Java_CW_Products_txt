package service;

import java.util.LinkedHashSet;

public class CountTheWords {

    public Integer getCount(LinkedHashSet<String> set, String[] inputArray) {
        Integer count = 0;
        for (String i : set) {
            for (String j : inputArray) {
                if (i.equals(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
