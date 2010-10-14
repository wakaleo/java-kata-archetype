#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class WhenDoingMaths 
{
    @Test
    public void addingAToBShouldProduceTheSumOfAAndB() {
    	int a = 1;
    	int b = 2;
    	int expectedSum = 3;
    	
    	Calculator calculator = new Calculator();
    	int actualSum = calculator.add(a,b);
    	
    	assertThat(actualSum, is(expectedSum));
    }
}
