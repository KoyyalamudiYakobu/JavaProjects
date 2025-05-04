package testOne;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.Calculator;

public class TestCalculations 
{
	
	static Calculator s=null;
	
	


	@BeforeAll
	public static void createObject()
	{
	  s=new Calculator();
		
	}
	
	@Test
	@DisplayName("Test addition of two numbers")
	public void testAdd()
	{
		
		int result=s.add(3, 2);
		boolean j=false;
		if(result==4)
		{
			j=true;
		}
		System.out.println(s);
		//assertEquals(4,result);
		assertFalse(j);
		
	}
	
	
	@Disabled
	@Test
	public void testsubtraction()
	{
		 int result=s.subtraction(2, 5);
		System.out.println(s);
		assertEquals(-3,result);
	}

	//@Test
	public void testmultiply()
	{
		int i=2;
		int j=3;
		
		int result=i*j;
		
		assertEquals(6,result);
	}
	
}
