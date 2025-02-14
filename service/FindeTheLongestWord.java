package service;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class FindeTheLongestWord {

    public Map<String, Integer> findWord(LinkedHashSet<String> set){
    
        Integer max = 0;
        String maxword = "";
        Map<String, Integer> result = new HashMap<>();
        for (String i : set) {
            Integer wordlength = i.length();
            if (wordlength > max) {
                max = wordlength;
                maxword = i;
            }
        }
        result.put(maxword, max);

        for (String i : set) {
            Integer wordlength = i.length();
            if (max == wordlength) {
                result.put(i, i.length());
            }
        }
        return result;
    
    }
}
