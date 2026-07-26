package com.orange.Pipeline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PipelineApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void MathSumTest() {
		double num1 = 10;
		double num2 = 20;
		double sum = Math.sum(num1, num2);
		assertEquals(30, sum);
	}

}
