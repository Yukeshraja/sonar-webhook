package com.unit.Testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.unit.controller.BaseController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingApplicationTests {

	@Test
	public void testCalculate() {
	
		BaseController controller = new BaseController();
		
		assertEquals("25", controller.calculate(5));
		
	}
	@Test
	public void testCalculateZero() {
	
		BaseController controller = new BaseController();
		
		assertEquals("Invalid value given in input", controller.calculate(0));
		
	}

}
