package study;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {

	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@DisplayName("Set size() 메소드 학습 테스트")
	@Test
	void size() {
		//given
		//when
		int actual = numbers.size();

		//then
		assertThat(actual).isEqualTo(3);
	}

	@DisplayName("Set contains() 메소드 학습 테스트")
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	void contains(int num) {
		//given
		//when
		//then
		assertThat(numbers.contains(num)).isTrue();
	}

	@DisplayName("Set contains() 메소드 학습 테스트 ver2")
	@ParameterizedTest
	@CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"})
	void contains2(int num, boolean expected) {
		//given
		//when
		//then
		assertThat(numbers.contains(num)).isEqualTo(expected);
	}

}
