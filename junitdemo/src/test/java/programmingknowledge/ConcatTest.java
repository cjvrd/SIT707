package programmingknowledge;

import org.junit.Assert;
import org.junit.Test;

import sit707.MyJUnitClass;

public class ConcatTest {
    @Test
    public void test() {
        MyJUnitClass junit = new MyJUnitClass();
        String result = junit.concat("poo", "bum");
        Assert.assertEquals("poobum", result);
    }
}
