import org.junit.Test;
import org.junit.Assert;
import sit707.AddConcatClass;

public class AddConcatTest {
    private AddConcatClass a = new AddConcatClass();

    //add tests
    @Test
    public void testAdd0to0() {
        Assert.assertEquals(0, a.add(0, 0));
    }

    @Test
    public void testAdd0toNon0() {
        Assert.assertEquals(2, a.add(0, 2));
    }

    @Test
    public void testAddNon0to0() {
        Assert.assertEquals(2, a.add(2, 0));
    }

    @Test
    public void testAddNegativeTo0() {
        Assert.assertEquals(-2, a.add(-2, 0));
    }

    @Test
    public void testAdd0toNegative() {
        Assert.assertEquals(-2, a.add(0, -2));
    }

    @Test //big number is out of range for int, so it fails
    public void testAddBigToNormal() {
        Assert.assertEquals(10000000002, a.add(10000000000, 2));
    }

    @Test //add function cannot handle decimals, so it fails
    public void testAddDecimalToInt() {
        Assert.assertEquals(4.1, a.add(2.1, 2));
    }

    //concat tests
    @Test
    public void testConcatSingleChars() {
        Assert.assertEquals("00", a.concat("0", "0"));
    }

    @Test
    public void testConcatSingleAndEmpty() {
        Assert.assertEquals("0", a.concat("0", ""));
    }

    @Test //test fails as actual result is "null0" which must be a weird java thing
    public void testNullAndSingle() {
        Assert.assertEquals("0", a.concat(null, "0"));
    }

    @Test //test fails as actual result is "nullnull"
    public void testNullAndNull() {
        Assert.assertEquals(null, a.concat(null, null));
    }
}