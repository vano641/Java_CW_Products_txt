package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

import service.ControllerAct;

public class viewRun {

    ControllerAct controller = new ControllerAct();

    public void run() throws FileNotFoundException{
        String input = "Apple Banana Cherry Banana Durian Apple Grape Kiwi Lemon Mango Orange Orange Kiwi Pear Strawberry Mango Grape Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Pumpkin Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Beet plum Blueberry Mango Tomato  Apple Potato Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear nectarine Banana Durian Apple mushroom Tomato Lemon Mango Pear Cabbage Cabbage Strawberry Raspberries Blueberry fruits Blackberry Cherry Raspberries tangerine Blueberry Mango Apple Pumpkin Lemon Kiwi Pear Blueberry Potato Onion  Blackberry Strawberry Raspberries nectarine plum Cherry Orange Mango Pear watermelon Banana Durian Apple Lemon Mango Pear Strawberry Onion  Cabbage  Raspberries Blueberry melon Blackberry Cherry Raspberries Eggplant Blueberry Mango Apple quince Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Turnip  Pear Strawberry Raspberries Blueberry peach Blackberry Cherry Cabbage Cabbage  peach Raspberries Blueberry Mango Apple Eggplant melon Turnip Tomato Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Cabbage Carrot  Cabbage Carrot mushroom   Cabbage  Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry tangerine Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear mushroom Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry peach Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry nectarine Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Mango Blackberry Strawberry Raspberries Cherry Turnip Orange Mango Tomato Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueavocado persimmon watermelon plum Beet Apple Banana Cherry Banana Durian Apple Grape Kiwi Lemon Mango Orange Orange Kiwi Pear Strawberry Mango Grape Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Pumpkin Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Beet plum Blueberry Mango Tomato pepper  Apple Potato Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear nectarine Banana Durian Apple Tomato Lemon Mango Pear Cabbage Cabbage Strawberry Raspberries Blueberry fruits Blackberry Cherry Raspberries tangerine Blueberry Mango Apple Pumpkin Lemon Kiwi Pear Blueberry Potato Onion  Blackberry Strawberry Raspberries nectarine plum Cherry Orange Mango Pear watermelon Banana Durian Apple Lemon Mango Pear Strawberry Onion  Cabbage  Raspberries Blueberry melon Blackberry Cherry Raspberries Eggplant Blueberry Mango Apple quince Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Turnip  Pear Strawberry Raspberries Blueberry peach Blackberry Cherry Cabbage Cabbage  peach Raspberries Blueberry Mango Apple Eggplant melon Turnip Tomato Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Cabbage Carrot  Cabbage Carrot   Cabbage  Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry tangerine Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry mushroom Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry peach Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry nectarine Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Mango Blackberry Strawberry Raspberries Cherry Turnip Orange Mango Tomato Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueavocado persimmon watermelon plum Beet Apple Banana Cherry Banana Durian Apple Grape Kiwi Lemon Mango Orange Orange Kiwi Pear Strawberry Mango Grape Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Pumpkin Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Beet plum Blueberry Mango Tomato  Apple Potato Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear nectarine Banana Durian Apple Tomato Lemon Mango Pear Cabbage Cabbage Strawberry Raspberries Blueberry fruits Blackberry Cherry Raspberries tangerine Blueberry Mango Apple Pumpkin Lemon Kiwi Pear Blueberry Potato Onion  Blackberry Strawberry Raspberries nectarine plum Cherry Orange Mango Pear watermelon Banana Durian Apple Lemon Mango Pear Strawberry Onion  Cabbage  Raspberries Blueberry melon Blackberry Cherry Raspberries Eggplant Blueberry Mango Apple quince Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Turnip  Pear Strawberry Raspberries Blueberry peach Blackberry Cherry Cabbage Cabbage  peach Raspberries Blueberry Mango Apple Eggplant melon Turnip Tomato Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Cabbage Carrot  Cabbage Carrot   Cabbage  Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry tangerine Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueberry Blackberry peach Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Blackberry Strawberry Raspberries Cherry Orange Mango Pear Banana Durian Apple Lemon Mango Pear Strawberry nectarine Raspberries Blueberry Blackberry Cherry Raspberries Blueberry Mango Apple Lemon Kiwi Pear Blueberry Mango Blackberry Strawberry Raspberries Cherry Turnip Orange Mango Tomato Pear Banana Durian Apple Lemon Mango Pear Strawberry Raspberries Blueavocado persimmon watermelon plum Beet";
/** 
 *  ПРИ СКАНИРОВАНИИ ФАЙЛА ВИДИМО У МЕНЯ СКАНИРУЕТСЯ И ПУСТАЯ СТРОКА КОТОРАЯ СЧИТАЕТСЯ ЗА ОТДЕЛЬНЫЙ ЭЛЕМЕНТ
 *  Я ПРОБОВАЛ ПО ВСЯКОМУ ОТ НЕЕ ИЗБАВИТЬСЯ НО У МЕНЯ НЕ ПОЛУЧИЛОСЬ, ПОЭТОМУ Я ЭТОТ КОД ЗАКОМЕНТИРОВАЛ (ХОТЯ ОН РАБОТАЕТ)
 *  
 *                              ОБЪЯСНИТЕ МНЕ ПОЖАЛУЙСТА ЧТО СДЕЛАНО НЕ ТАК  
 *  
        File file = new File("input.txt");
        Scanner sc = new Scanner(file); 
        sc.useDelimiter("\\Z");  

        String input = sc.next();
        sc.close();
*/
        String[] inputArray = controller.SSplit(input) ;
        LinkedHashSet<String> set = controller.DelNull(inputArray);

        Integer cotwResult;
        Map<String, Integer> ftlwResult;
        LinkedHashMap<String, Integer> qoepResult;

        while (true) {
        String comand = printString("Выберите команду: \n Посчитать количество Слов в Файле - 1 \n Найти самое Длинное слово в Файле - 2 \n Посчитать количество повторений каждого слова - 3 \n");
        
            if (comand.equals("1")) {
                cotwResult = controller.CountWords(set, inputArray);
                System.out.printf("Найдено %d уникальных слов в файле \n", cotwResult);
                
            }
            if (comand.equals("2")) {
                ftlwResult = controller.FWord(set);
                System.out.printf("Найдено самое длинное слово: %s \n", ftlwResult.keySet().toString().replaceAll("^\\[|\\]$", ""));
                
            }
            if (comand.equals("3")) {
                qoepResult = controller.CountProducts(set, inputArray);
                System.out.printf("Подсчет завершен:\n%s \n", qoepResult.toString().replaceAll("^\\{|\\}$", ""));
                
            }
            
            comand = printString("Хотите продолжить? y/n\n");
            if (comand.equals("y")) {
                continue;
            }
            if (comand.equals("n")) {
                break;
            }
            else {
                comand = printString("Ошибочка, продолжить работу? y/n\n");
                    if (comand.equals("y")) {
                        continue;
                    }
                    if (comand.equals("n")) {
                        break;
                    }
                    else {
                        System.out.println("Введены не корректные данные Прогрпмма закрывается");
                        break;
                    }
                }
            }
    }
        
    private String printString(String message) {
            Scanner in = new Scanner(System.in);
            System.out.print(message);
            return in.nextLine();
        }    
}
