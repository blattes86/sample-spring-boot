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
    public void testdivision2()
    {
        double res=DemoApplication.diviser(12,2);
        assertEquals(res,6.0,0);
    }
    @Test
    public void testdivision3()
    {
        double res=DemoApplication.diviser(12,0);
        assertEquals(res,0.0,0);
    }
    @Ignore
    @Test
    public void testdivision4()
    {
        double res=DemoApplication.diviser(12,30);
        assertEquals(res,18.0,0);
    }
}
