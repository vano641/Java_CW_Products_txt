package service;

import java.util.LinkedHashSet;

public class DeleteNull {

    public LinkedHashSet<String> nullDel(String[] inputArray){
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].isEmpty()) {
                i++;
            }
            else {
                result.add(inputArray[i]);
            }
        }
        return result;
    }
}
