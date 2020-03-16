package edu.mum.cs.cs425.hackathon.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.mum.cs.cs425.service.IAccountService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NetLiquidityTest {
	@Autowired
	private IAccountService accountService;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		double expected = 484596.21;
		double actual = accountService.getNetLiquidity();
		assertEquals(expected, actual);
	}

}
