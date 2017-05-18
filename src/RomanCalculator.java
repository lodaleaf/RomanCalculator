
public class RomanCalculator {
	/**
	 * Calculate Roman numerals
	 * 
	 * @param expression
	 * @return result of Roman numerals
	 */
	public String calculate(String expression) {
		// extract operators
		String[] romanNumbers = expression.split("\\+");
		int result = 0;
		for (int i = 0; i < romanNumbers.length; i++) {
			result += this.valueOf(romanNumbers[i].trim());
		}
		return this.getRomanNumber(result);
	}

	/**
	 * Get value of Roman number
	 * 
	 * @param romanNumber
	 * @return
	 */
	private int valueOf(String romanNumber) {
		int value = 0;
		if (romanNumber.length() == 1) {
			return this.getSymbolValue(romanNumber.charAt(0));
		}
		for (int i = 0; i < romanNumber.length() - 1; i++) {
			int symbolValue = this.getSymbolValue(romanNumber.charAt(i));
			int nextSymbolValue = this.getSymbolValue(romanNumber.charAt(i + 1));
			if (symbolValue >= nextSymbolValue) {
				value += symbolValue;
			} else {
				value -= symbolValue;
			}

			// add the last symbol
			if (i == romanNumber.length() - 2) {
				value += nextSymbolValue;
			}
		}
		return value;
	}

	/**
	 * @param symbol
	 * @return value of Roman number symbol
	 */
	private int getSymbolValue(char symbol) {
		switch (symbol) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	/**
	 * Return Roman number from int
	 * 
	 * @param value
	 * @return
	 */
	private String getRomanNumber(int value) {
		String result = "";
		while (value > 0) {
			if (value >= 1000) {
				result += "M";
				value -= 1000;
			} else if (value >= 900 || (value < 500 && value >= 400)) {
				result += "C";
				value += 100;
			} else if (value >= 500) {
				result += "D";
				value -= 500;
			} else if (value >= 300) {
				result += "C";
				value -= 100;
			} else if (value >= 100) {
				result += "C";
				value -= 100;
			} else if (value >= 90 || (value < 50 && value >= 40)) {
				result += "X";
				value += 10;
			} else if (value >= 50) {
				result += "L";
				value -= 50;
			} else if (value >= 30) {
				result += "X";
				value -= 10;
			} else if (value >= 10) {
				result += "X";
				value -= 10;
			} else if (value >= 9 || (value < 5 && value >= 4)) {
				result += "I";
				value += 1;
			} else if (value >= 5) {
				result += "V";
				value -= 5;
			} else if (value <= 3) {
				result += "I";
				value -= 1;
			}
		}
		return result;
	}
}
