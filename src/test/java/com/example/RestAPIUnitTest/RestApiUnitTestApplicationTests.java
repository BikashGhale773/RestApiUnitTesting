package com.example.RestAPIUnitTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class RestApiUnitTestApplicationTests {

	 private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	@Disabled
	void testSum(){
		int expectedResult = 25;
		int actualResult = c.sum(10,15);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct(){
		int actualResult = c.product(5,5);
		int expectedResult = 25;
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testCompareNums(){
		Boolean actualResult = c.compareNum(5,5);
		assertThat(actualResult).isTrue();
	}


}
