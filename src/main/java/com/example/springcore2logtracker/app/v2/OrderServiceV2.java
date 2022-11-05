package com.example.springcore2logtracker.app.v2;

import com.example.springcore2logtracker.trace.TraceId;
import com.example.springcore2logtracker.trace.TraceStatus;
import com.example.springcore2logtracker.trace.hellotrace.HelloTraceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV2 {

    private final OrderRepositoryV2 orderRepository;
    private final HelloTraceV2 trace;

    public void orderItem(TraceId traceId, String itemId) {
        TraceStatus status = null;
        try {
            status = trace.beginSync(traceId,"OrderService.request()");
            orderRepository.save(status.getTraceId(),itemId);
            trace.end(status);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }

        orderRepository.save(status.getTraceId(), itemId);
    }
}
