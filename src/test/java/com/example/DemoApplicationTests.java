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
    public void testdivision() throws Exception
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
			assertTrue( false );
		}
		catch (Exception e)
		{
			assertTrue( true );
		}
    }
    
    @Test
    public void testdivisionexecptionwithaletter() throws Exception
    {
		try
		{
			double res=DemoApplication.diviser(6,1);
			assertTrue( false );
		}
		catch (Exception e)
		{
			assertTrue( true );
		}
    }
    
    @Test
    public void testdivisionpar0() throws Exception
    {
        double res=DemoApplication.diviser(12,0);
        assertEquals(res,0.0,0);
    }
    
    @Ignore
    @Test
    public void testdivisionnull() throws Exception
    {
        double res=DemoApplication.diviser(null,30);
    }
    
    @Test 
    public void testaddition()
    {
        Integer res=DemoApplication.addition(6,30);
        assertEquals(res,(Integer)36);
    }
    
    @Test
    public void testsoustraction()
    {
        Integer res=DemoApplication.soustraire(3,2);
        assertEquals(res,(Integer)1);
    }
}
