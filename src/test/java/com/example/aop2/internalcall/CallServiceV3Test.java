package com.example.aop2.internalcall;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CallServiceV3Test {

	@Autowired
	CallServiceV3 callServiceV3;

	@Test
	void external() {
		callServiceV3.external();
	}
}