package stringcalculator;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void testStringCalculator() {
		//given
		StringCalculator stringCalculator = new StringCalculator();
		String input = "2 + 3 * 4 / 2";

		//when
		Integer actual = stringCalculator.calculateString(input);

		//then
		assertThat(actual).isEqualTo(10);
	}

}