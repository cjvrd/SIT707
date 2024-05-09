package sit707_week6;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FruitLoopsTest {

    @Test
    public void testFruitCount() {
        //there are 7 fruits in the list
        List<String> listOfFruit = Arrays.asList("Apple", "Pear", "Orange", "Banana", "Pear", "Strawberry", "Grape");
        Assert.assertEquals(7, FruitLoops.countTheFruit(listOfFruit));
    }

    @Test
    public void testFindTheFruitSuccess() {
        List<String> listOfFruit = Arrays.asList("Apple", "Pear", "Orange", "Banana", "Pear", "Strawberry", "Grape");
        String fruitToFind = "Apple";
        Assert.assertEquals("Found The Fruit!", FruitLoops.findTheFruit(fruitToFind, listOfFruit));
    }

    @Test
    public void testFindTheFruitFail() {
        List<String> listOfFruit = Arrays.asList("Apple", "Pear", "Orange", "Banana", "Pear", "Strawberry", "Grape");
        String fruitToFind = "Mango";
        Assert.assertEquals("Fruit Not Found", FruitLoops.findTheFruit(fruitToFind, listOfFruit));
    }
}
