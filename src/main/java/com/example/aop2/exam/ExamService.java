package com.example.aop2.exam;

import org.springframework.stereotype.Service;

import com.example.aop2.annotation.Trace;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExamService {
	private final ExamRepository examRepository;

	@Trace
	public void request(String itemId) {
		examRepository.save(itemId);
	}
}
