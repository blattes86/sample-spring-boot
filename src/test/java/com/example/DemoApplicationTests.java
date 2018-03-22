package com.example;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
    @Test
    public void testdivision()
    {
        double res=DemoApplication.diviser(8,2);
        assertEquals(res,4.0,0);
    }
    @Test
    public void testdivisionexecption() throws Exception
    {
		try
		{
			double res=DemoApplication.diviser(null,2);
			assertEquals(res,6.0,0);
			assertTrue( false );
		}
		catch (Exception e)
		{
			assertTrue( true );
		}
    }
    @Test
    public void testdivisionpar0()
    {
        double res=DemoApplication.diviser(12,0);
        assertEquals(res,0.0,0);
    }
    
    @Test
    public void testdivisionnull()
    {
        double res=DemoApplication.diviser(null,30);
    }
}
