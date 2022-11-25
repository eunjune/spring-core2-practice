package com.example.springcore2logtracker;

import com.example.springcore2logtracker.trace.logtrace.LogTrace;
import com.example.springcore2logtracker.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }

}
