import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		RomanCalculator calculator = new RomanCalculator();
		assertEquals("XXII", calculator.calculate("XX+II"));
		assertEquals("IV", calculator.calculate("II+II"));
		assertEquals("LXXIV", calculator.calculate("XIV+LX"));
		assertEquals("X", calculator.calculate("V+V"));
		assertEquals("MMMDCCCLXXXVIII", calculator.calculate("MMM+DCCCLXXXVIII")); // 3888
		assertEquals("LX", calculator.calculate("XXXXXX")); // 60
		assertEquals("MCMX", calculator.calculate("MDCCCCX")); // 1910
		assertEquals("MMMCMXCIX", calculator.calculate("MMMCMXCIX")); // 3999
		assertEquals("XLIV", calculator.calculate("XXXX+IIII")); // 44
		assertEquals("XVI", calculator.calculate("X+VI")); // 16
		assertEquals("XCIX", calculator.calculate("X+VI+LXXXIII")); // 99
		assertEquals("CMXCIX", calculator.calculate("X+VI+LXXXIII+CM")); // 999
		assertEquals("MIV", calculator.calculate("M+IV")); // 1004
	}

}
