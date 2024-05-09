package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ahsan Habib
 */
public class DateUtilTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "215100352";
        Assert.assertNotNull("Student ID is ", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Christian Virdo";
        Assert.assertNotNull("Student name is ", studentName);
    }

    @Test
    public void testJune14_2000() {
        DateUtil date = new DateUtil(14, 6, 2000);
        date.increment();
        System.out.println("June14_2000 > " + date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testJune14_1996() {
        DateUtil date = new DateUtil(14, 6, 1996);
        date.increment();
        System.out.println("June14_1996 > " + date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test
    public void testJune14_2023() {
        DateUtil date = new DateUtil(14, 6, 2023);
        date.increment();
        System.out.println("June14_2023 > " + date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testJune29_2000() {
        DateUtil date = new DateUtil(29, 6, 2000);
        date.increment();
        System.out.println("June29_2000 > " + date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testJune29_1996() {
        DateUtil date = new DateUtil(29, 6, 1996);
        date.increment();
        System.out.println("June29_1996 > " + date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test
    public void testJune29_2023() {
        DateUtil date = new DateUtil(29, 6, 2023);
        date.increment();
        System.out.println("June29_2023 > " + date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testJune30_2000() {
        DateUtil date = new DateUtil(30, 6, 2000);
        date.increment();
        System.out.println("June30_2000 > " + date);
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testJune30_1996() {
        DateUtil date = new DateUtil(30, 6, 1996);
        date.increment();
        System.out.println("June30_1996 > " + date);
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test
    public void testJune30_2023() {
        DateUtil date = new DateUtil(30, 6, 2023);
        date.increment();
        System.out.println("June30_2023 > " + date);
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test(expected = RuntimeException.class)
    public void testJune31_2000() {
        //should be invalid
        DateUtil date = new DateUtil(31, 6, 2000);
        System.out.println(date + " is impossible");
    }

    @Test(expected = RuntimeException.class)
    public void testJune31_1996() {
        //should be invalid
        DateUtil date = new DateUtil(31, 6, 1996);
        System.out.println(date + " is impossible");
    }

    @Test(expected = RuntimeException.class)
    public void testJune31_2023() {
        //should be invalid
        DateUtil date = new DateUtil(31, 6, 2023);
        System.out.println(date + " is impossible");
    }

    @Test
    public void testFebruary14_2000() {
        DateUtil date = new DateUtil(14, 2, 2000);
        date.increment();
        System.out.println("February14_2000 > " + date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testFebruary14_1996() {
        DateUtil date = new DateUtil(14, 2, 1996);
        date.increment();
        System.out.println("February14_1996 > " + date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test
    public void testFebruary14_2023() {
        DateUtil date = new DateUtil(14, 2, 2023);
        date.increment();
        System.out.println("February14_2023 > " + date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testFebruary29_2000() {
        DateUtil date = new DateUtil(29, 2, 2000);
        date.increment();
        System.out.println("February29_2000 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testFebruary29_1996() {
        DateUtil date = new DateUtil(29, 2, 1996);
        date.increment();
        System.out.println("February29_1996 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test(expected = RuntimeException.class)
    public void testFebruary29_2023() {
        DateUtil date = new DateUtil(29, 2, 2023);
        System.out.println(date + " is impossible");
    }

    @Test(expected = RuntimeException.class)
    public void testFebruary30_2000() {
        //should be invalid
        DateUtil date = new DateUtil(30, 2, 2000);
        System.out.println(date + " is impossible");
    }

    @Test(expected = RuntimeException.class)
    public void testFebruary30_1996() {
        //should be invalid
        DateUtil date = new DateUtil(30, 2, 1996);
        System.out.println(date + " is impossible");
    }

    @Test(expected = RuntimeException.class)
    public void testFebruary30_2023() {
        //should be invalid
        DateUtil date = new DateUtil(30, 2, 2023);
        System.out.println(date + " is impossible");
    }

    @Test(expected = RuntimeException.class)
    public void testFebruary31_2000() {
        //should be invalid
        DateUtil date = new DateUtil(31, 2, 2000);
        System.out.println(date + " is impossible");
    }

    @Test(expected = RuntimeException.class)
    public void testFebruary31_1996() {
        //should be invalid
        DateUtil date = new DateUtil(31, 2, 1996);
        System.out.println(date + " is impossible");
    }

    @Test(expected = RuntimeException.class)
    public void testFebruary31_2023() {
        //should be invalid
        DateUtil date = new DateUtil(31, 2, 2023);
        System.out.println(date + " is impossible");
    }

    @Test
    public void testMarch14_2000() {
        DateUtil date = new DateUtil(14, 3, 2000);
        date.increment();
        System.out.println("March14_2000 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testMarch14_1996() {
        DateUtil date = new DateUtil(14, 3, 1996);
        date.increment();
        System.out.println("March14_1996 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test
    public void testMarch14_2023() {
        DateUtil date = new DateUtil(14, 3, 2023);
        date.increment();
        System.out.println("March14_2023 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testMarch29_2000() {
        DateUtil date = new DateUtil(29, 3, 2000);
        date.increment();
        System.out.println("March29_2000 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testMarch29_1996() {
        DateUtil date = new DateUtil(29, 3, 1996);
        date.increment();
        System.out.println("March29_1996 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test
    public void testMarch29_2023() {
        DateUtil date = new DateUtil(29, 3, 2023);
        date.increment();
        System.out.println("March29_2023 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testMarch30_2000() {
        DateUtil date = new DateUtil(30, 3, 2000);
        date.increment();
        System.out.println("March30_2000 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testMarch30_1996() {
        DateUtil date = new DateUtil(30, 3, 1996);
        date.increment();
        System.out.println("March30_1996 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test
    public void testMarch30_2023() {
        DateUtil date = new DateUtil(30, 3, 2023);
        date.increment();
        System.out.println("March30_2023 > " + date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testMarch31_2000() {
        DateUtil date = new DateUtil(31, 3, 2000);
        date.increment();
        System.out.println("March31_2000 > " + date);
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testMarch31_1996() {
        DateUtil date = new DateUtil(31, 3, 1996);
        date.increment();
        System.out.println("March31_1996 > " + date);
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test
    public void testMarch31_2023() {
        DateUtil date = new DateUtil(31, 3, 2023);
        date.increment();
        System.out.println("March31_2023 > " + date);
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2023, date.getYear());
    }
}
