package iloveyouboss;

import org.junit.Assert;
import org.junit.Test;

import sit707.ScoreCollection;

public class ScoreCollectionTest {
    @Test
    public void checkArithmeticMeanOfTwoNumbers() {
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 9);

        int actualResult = collection.arithmeticMean();
        Assert.assertEquals(7, actualResult);
    }
}
