package sit707_tasks;

import java.util.Random;

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
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// January min boundary area: min+1
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january1ShouldIncrementToJanuary2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2, date.getDay());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// January max boundary area: min-1
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january1ShouldDecrementToDecember31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	//test cases from DECREMENT table (1a-13a)
	
	@Test
	public void test1A() {
		// decrement from 31/5/1994
		DateUtil date = new DateUtil(1, 6, 1994);
		System.out.println("June1ShouldDecrementToMay31");
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(5, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
    public void test2A() {
        // decrement from 2/6/1994
        DateUtil date = new DateUtil(2, 6, 1994);
        System.out.println("June2ShouldDecrementToJune1");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test3A() {
        // decrement from 15/6/1994
        DateUtil date = new DateUtil(15, 6, 1994);
        System.out.println("June15ShouldDecrementToJune14");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test4A() {
        // decrement from 30/6/1994
        DateUtil date = new DateUtil(30, 6, 1994);
        System.out.println("June30ShouldDecrementToJune29");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test(expected = RuntimeException.class)
    public void test5A() {
        // 31/6/1994 should be invalid
        DateUtil date = new DateUtil(31, 6, 1994);
        System.out.println("June31ShouldBeInvalid");
        System.out.println(date);
    }

    @Test
    public void test6A() {
        // decrement from 15/1/1994
        DateUtil date = new DateUtil(15, 1, 1994);
        System.out.println("Jan15ShouldDecrementToJan14");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test7A() {
        // decrement from 15/2/1994
        DateUtil date = new DateUtil(15, 2, 1994);
        System.out.println("Feb15ShouldDecrementToFeb14");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test8A() {
        // decrement from 15/11/1994
        DateUtil date = new DateUtil(15, 11, 1994);
        System.out.println("Nov15ShouldDecrementToNov14");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test9A() {
        // decrement from 15/12/1994
        DateUtil date = new DateUtil(15, 12, 1994);
        System.out.println("Dec15ShouldDecrementToDec14");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test10A() {
        // decrement from 15/6/1700
        DateUtil date = new DateUtil(15, 6, 1700);
        System.out.println("Jun15ShouldDecrementToJun14");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1700, date.getYear());
    }

    @Test
    public void test11A() {
        // decrement from 15/6/1701
        DateUtil date = new DateUtil(15, 6, 1701);
        System.out.println("Jun15ShouldDecrementToJun14");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1701, date.getYear());
    }

    @Test
    public void test12A() {
        // decrement from 15/6/2023
        DateUtil date = new DateUtil(15, 6, 2023);
        System.out.println("Jun15ShouldDecrementToJun14");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void test13A() {
        // decrement from 15/6/2024
        DateUtil date = new DateUtil(15, 6, 2024);
        System.out.println("Jun15ShouldDecrementToJun14");
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    //test cases from increment table (1b-13b)
    @Test
    public void test1B() {
        // increment from 1/6/1994
        DateUtil date = new DateUtil(1, 6, 1994);
        System.out.println("June1ShouldIncrementToJune2");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test2B() {
        // increment from 2/6/1994
        DateUtil date = new DateUtil(2, 6, 1994);
        System.out.println("June2ShouldIncrementToJune3");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test3B() {
        // increment from 15/6/1994
        DateUtil date = new DateUtil(15, 6, 1994);
        System.out.println("June15ShouldIncrementToJune16");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test4B() {
        // increment from 30/6/1994
        DateUtil date = new DateUtil(30, 6, 1994);
        System.out.println("June30ShouldIncrementToJuly1");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test(expected = RuntimeException.class)
    public void test5B() {
        // 31/6/1994 should be invalid
        DateUtil date = new DateUtil(31, 6, 1994);
        System.out.println("June31ShouldBeInvalid");
        System.out.println(date);
    }

    @Test
    public void test6B() {
        // increment from 15/1/1994
        DateUtil date = new DateUtil(15, 1, 1994);
        System.out.println("Jan15ShouldIncrementToJan16");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test7B() {
        // increment from 15/2/1994
        DateUtil date = new DateUtil(15, 2, 1994);
        System.out.println("Feb15ShouldIncrementToFeb16");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test8B() {
        // increment from 15/11/1994
        DateUtil date = new DateUtil(15, 11, 1994);
        System.out.println("Nov15ShouldIncrementToNov16");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test9B() {
        // increment from 15/12/1994
        DateUtil date = new DateUtil(15, 12, 1994);
        System.out.println("Dec15ShouldIncrementToDec16");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test10B() {
        // increment from 15/6/1700
        DateUtil date = new DateUtil(15, 6, 1700);
        System.out.println("Jun15ShouldIncrementToJun16");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1700, date.getYear());
    }

    @Test
    public void test11B() {
        // increment from 15/6/1701
        DateUtil date = new DateUtil(15, 6, 1701);
        System.out.println("Jun15ShouldIncrementToJun16");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1701, date.getYear());
    }

    @Test
    public void test12B() {
        // increment from 15/6/2023
        DateUtil date = new DateUtil(15, 6, 2023);
        System.out.println("Jun15ShouldIncrementToJun16");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void test13B() {
        // increment from 15/6/2024
        DateUtil date = new DateUtil(15, 6, 2024);
        System.out.println("Jun15ShouldIncrementToJun16");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    //february leap year condition test case
    @Test
    public void testFebLeapYear() {
        //increment to feb 29 in leap year
        DateUtil date = new DateUtil(28, 2, 2024);
        System.out.println("Feb28ShouldIncrementToFeb29InLeapYear");
        date.increment();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test(expected = RuntimeException.class)
    public void testFebNotLeapYear() {
        // feb 29 should be invalid in leap year
        DateUtil date = new DateUtil(29, 2, 2023);
        System.out.println("Feb29ShouldBeInvalidInLeapYear");
        System.out.println(date);
    }
}

