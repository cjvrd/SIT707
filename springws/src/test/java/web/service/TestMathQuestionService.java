package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

	@Test
	public void testTrueAdd() {
		Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
	}

	@Test
	public void testTrueSubtraction() {
		Assert.assertEquals(MathQuestionService.q2Subtraction("2", "1"), 1, 0);
	}

	@Test
	public void testTrueMultiplication() {
		Assert.assertEquals(MathQuestionService.q3Multiplication("2", "3"), 6, 0);
	}

	@Test
	public void testAddNumber1Empty() {
		Assert.assertNull(MathQuestionService.q1Addition("", "2"));
	}

	@Test
	public void testAddNumber2Empty() {
		Assert.assertNull(MathQuestionService.q1Addition("2", ""));
	}

	@Test
	public void testAddBothNumbersEmpty() {
		Assert.assertNull(MathQuestionService.q1Addition("", "2"));
	}

	@Test
	public void testSubtractNumber1Empty() {
		Assert.assertNull(MathQuestionService.q2Subtraction("", "2"));
	}

	@Test
	public void testSubtractNumber2Empty() {
		Assert.assertNull(MathQuestionService.q2Subtraction("2", ""));
	}

	@Test
	public void testSubtractBothNumbersEmpty() {
		Assert.assertNull(MathQuestionService.q2Subtraction("", "2"));
	}

	@Test
	public void testMultiplyNumber1Empty() {
		Assert.assertNull(MathQuestionService.q3Multiplication("", "2"));
	}

	@Test
	public void testMultiplyNumber2Empty() {
		Assert.assertNull(MathQuestionService.q3Multiplication("2", ""));
	}

	@Test
	public void testMultiplyBothNumbersEmpty() {
		Assert.assertNull(MathQuestionService.q3Multiplication("", "2"));
	}

	@Test
    public void testAddNumber1Letter() {
        Assert.assertNull(MathQuestionService.q1Addition("a", "2"));
    }

    @Test
    public void testAddNumber2Letter() {
        Assert.assertNull(MathQuestionService.q1Addition("2", "b"));
    }

    @Test
    public void testAddBothNumbersLetter() {
        Assert.assertNull(MathQuestionService.q1Addition("a", "b"));
    }

    @Test
    public void testSubtractNumber1Letter() {
        Assert.assertNull(MathQuestionService.q2Subtraction("a", "2"));
    }

    @Test
    public void testSubtractNumber2Letter() {
        Assert.assertNull(MathQuestionService.q2Subtraction("2", "b"));
    }

    @Test
    public void testSubtractBothNumbersLetter() {
        Assert.assertNull(MathQuestionService.q2Subtraction("a", "b"));
    }

    @Test
    public void testMultiplyNumber1Letter() {
        Assert.assertNull(MathQuestionService.q3Multiplication("a", "2"));
    }

    @Test
    public void testMultiplyNumber2Letter() {
        Assert.assertNull(MathQuestionService.q3Multiplication("2", "b"));
    }

    @Test
    public void testMultiplyBothNumbersLetter() {
        Assert.assertNull(MathQuestionService.q3Multiplication("a", "b"));
    }
}
