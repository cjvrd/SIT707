package sit707_week6;

import java.util.List;

public class FruitLoops {

    public static int countTheFruit(List<String> listOfFruit) {
        int count = 0;
        for (int i = 0; i < listOfFruit.size(); i++) {
            count ++;
        }
        return count;
    }

    public static String findTheFruit(String fruitToFind, List<String> listOfFruit) {

        for (int i = 0; i < listOfFruit.size(); i++) {
            if (fruitToFind == listOfFruit.get(i)) {
                return "Found The Fruit!";
            }
        }
        return "Fruit Not Found";
    }
}
