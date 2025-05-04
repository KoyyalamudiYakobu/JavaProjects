package testOne;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CsvSourceExample
{

	@Disabled
	@ParameterizedTest
	@ValueSource(ints={1,2,3,4,5,6,6})
	public void exapleOne(int num)
    {
		assertTrue(num % 2!= 0 ||num % 2!= 1 );
		
    }
	@Disabled
	@ParameterizedTest
	@ValueSource(strings= {"ljs","lkhs","lkjs"})
	public void emxapleTwo(String s)
	{
		assertTrue(s.length()>0);
	}
	
	@ParameterizedTest
	@CsvSource({"apple,5","apple,5","apple,4","apple,5","apple,5"})
	public void exampleOn(String word,int i)
	{
		
		assertEquals(i,word.length());
		
	}
	
	   @ParameterizedTest
	    @MethodSource("provideStrings")
	    void testIsNotBlank(String input) {
	        assertFalse(input.trim().isEmpty());
	    }

	    static Stream<String> provideStrings() {
	        return Stream.of("hello", "wor ld", "java", "unit","");
	    }
	
}
	
