package service;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class ControllerAct {

    StringSplit SS = new StringSplit();

    DeleteNull DN = new DeleteNull();

    CountTheWords CTW = new CountTheWords();

    FindeTheLongestWord FTLW = new FindeTheLongestWord();

    QuantityOfEachProduct QOEP = new QuantityOfEachProduct();

    public String[] SSplit(String input){
        String[] result = SS.strSplit(input);
        return result;
    }

    public LinkedHashSet<String> DelNull(String[] inputArray){
        LinkedHashSet<String> result = DN.nullDel(inputArray);
        return result;
    }

    public Integer CountWords(LinkedHashSet<String> set, String[] inputArray){
        Integer result = CTW.getCount(set, inputArray);
        return result;
    }

    public Map<String, Integer> FWord(LinkedHashSet<String> set){
        Map<String, Integer> result = FTLW.findWord(set);
        return result;
    }

    public LinkedHashMap<String, Integer> CountProducts(LinkedHashSet<String> set, String[] inputArray){
        LinkedHashMap<String, Integer> result = QOEP.CountEachProduct(set, inputArray);
        return result;
    }


}
