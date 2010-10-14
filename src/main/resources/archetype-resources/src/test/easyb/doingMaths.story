#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

scenario "When adding numbers",{
	given "two numbers",{
		a = 1
		b = 2
	}	
	and "a calculator", {
		calculator = new Calculator()
	}
	when "I add those numbers using the Calculator", {
		sum = calculator.add(a,b)
	}	
	then "the result should be the sum of the two numbers", {
		sum.shouldBe a + b
	}
}
