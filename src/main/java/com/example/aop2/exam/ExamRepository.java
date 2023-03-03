package com.example.aop2.exam;

import org.springframework.stereotype.Repository;

import com.example.aop2.annotation.Retry;
import com.example.aop2.annotation.Trace;

@Repository
public class ExamRepository {
	private static int seq = 0;

	@Trace
	@Retry(value = 4)
	public String save(String itemId) {
		seq++;
		if(seq % 5 == 0) {
			throw new IllegalStateException("예외 발생");
		}
		return "ok";
	}
}
