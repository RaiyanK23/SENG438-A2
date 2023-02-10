package org.jfree.data.test;

import static org.junit.Assert.*;
import org.junit.*;
import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class ColumnTotalTest {
    // Set-up
    Mockery mockingContext = new Mockery();
    Values2D values;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up...");
        values = mockingContext.mock(Values2D.class);
    }

    // Test Cases

    @Test
    public void calculateColumnTotalForNoRows() {

        mockingContext.checking(new Expectations() {
            {
                one(values).getRowCount();
                will(returnValue(0));
                one(values).getValue(0, 0);
                will(returnValue(7.5));
                one(values).getValue(1, 0);
                will(returnValue(2.5));
            }
        });
        double result = DataUtilities.calculateColumnTotal(values, 0);
        // verify
        assertEquals(result, 0.0, .000000001d);
    }

    @Test(expected = NullPointerException.class)
    public void checkInvalidInput() {

        mockingContext.checking(new Expectations() {
            {
                one(values).getRowCount();
                will(returnValue(0));
                one(values).getValue(0, 0);
                will(returnValue(7.5));
                one(values).getValue(1, 0);
                will(returnValue(2.5));
            }
        });
        values = null;
        double result = DataUtilities.calculateColumnTotal(values, 0);
        assertNull("Should throw a Nullptr exception", values);
    }

    @Test
    public void calculateColumnTotalForTwoValues() {

        mockingContext.checking(new Expectations() {
            {
                one(values).getRowCount();
                will(returnValue(2));
                one(values).getValue(0, 0);
                will(returnValue(7.5));
                one(values).getValue(1, 0);
                will(returnValue(2.5));
            }
        });
        double result = DataUtilities.calculateColumnTotal(values, 0);
        // verify
        assertEquals(result, 10.0, .000000001d);
    }

    // Teardown
    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing down...");
        mockingContext = null;
        values = null;
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

}
