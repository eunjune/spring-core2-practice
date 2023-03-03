package com.example.springcore2logtracker.aop2.exam;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import com.example.aop2.aop.RetryAspect;
import com.example.aop2.aop.TraceAspect;
import com.example.aop2.exam.ExamService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Import({TraceAspect.class, RetryAspect.class})
@SpringBootTest
public class ExamTest {

	@Autowired
	ExamService examService;

	@Test
	void test() {
		for (int i = 0; i < 5; i++) {
			log.info("client request i = {}", i);
			examService.request("data" + i);
		}
	}
}
