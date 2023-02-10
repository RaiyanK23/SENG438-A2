package org.jfree.data;

import static org.junit.Assert.*; 
import org.junit.*;
import org.jmock.Mockery;
import org.jmock.Expectations;
import org.junit.Test;


public class UtilitiesCumulativePercentTest extends DataUtilities {
	Mockery mockingContext = new Mockery();
    KeyedValues values;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { 
    	values = mockingContext.mock(KeyedValues.class);
    }


    @Test
    public void cumulativePercentageForThreeKeys() {
    	mockingContext.checking(new Expectations() {
            {
                one(values).getKey(0);
                will(returnValue(0));
                one(values).getValue(0);
                will(returnValue(5));
                one(values).getKey(1);
                will(returnValue(1));
                one(values).getValue(1);
                will(returnValue(9));
                one(values).getKey(2);
                will(returnValue(2));
                one(values).getValue(2);
                will(returnValue(2));
            }
        });
         KeyedValues result = DataUtilities.getCumulativePercentages(values);
        assertEquals(result.getValue(0).doubleValue(), 0.3125, .000000001d);
    }
    
    @Test
    public void cumulativePositivePercentageForTwoKeys() {
    	mockingContext.checking(new Expectations() {
            {
            	one(values).getKeys();
                one(values).getKey(0);
                will(returnValue(0));
                one(values).getKey(1);
                will(returnValue(-10));
                one(values).getKey(2);
                will(returnValue(-4));
            }
        });
        KeyedValues result = DataUtilities.getCumulativePercentages(values);
        assertEquals(result.getValue(1).doubleValue(), 1, .000000001d);
    }
    
    @After
    public void tearDown() throws Exception {
    	mockingContext = null;
    	values = null;
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}