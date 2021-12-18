package com.home.program.demo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Demo1Test {

	Demo1 demo1 = new Demo1();

	@Test
	public void min() {

		assertEquals(10, Demo1.min());

	}

}
