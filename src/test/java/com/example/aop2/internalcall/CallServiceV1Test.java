package com.example.aop2.internalcall;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import com.example.aop2.internalcall.aop.CallLogAspect;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Import(CallLogAspect.class)
@SpringBootTest
class CallServiceV1Test {

	@Autowired
	CallServiceV1 callServiceV1;

	@Test
	void external() {
		callServiceV1.external();
	}
}