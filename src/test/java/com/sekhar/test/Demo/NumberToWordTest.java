package com.sekhar.test.Demo;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class NumberToWordTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NumberToWordTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NumberToWordTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testConvert() {
    	NumberToWord obj = new NumberToWord();
    	Assert.assertEquals("fifty six million nine hundred forty five thousand seven hundred eighty one",obj.convert(56945781));
    }
    
    public void testConvert1() {
    	NumberToWord obj = new NumberToWord();
    	Assert.assertEquals("fifteen",obj.convert(15));
    }
    
}
