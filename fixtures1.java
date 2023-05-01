

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class fixtures1.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class fixtures1
{
    /**
     * Default constructor for test class fixtures1
     */
    public fixtures1()
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
    public void test3()
    {
        ClockTime clockTim1 = new ClockTime();
        assertEquals(11, clockTim1.getHour());
        clockTim1.setHour(11);
    }
}

