

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class clockTimeTest2.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class clockTimeTest2
{
    /**
     * Default constructor for test class clockTimeTest2
     */
    public clockTimeTest2()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test2()
    {
        ClockTime clockTim1 = new ClockTime();
        ClockTime clockTim2 = new ClockTime();
        assertEquals(0, clockTim1.getHour());
        assertEquals(0, clockTim2.getHour());
    }
}

