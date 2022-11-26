package com.example.springcore2logtracker.app.v5;

import com.example.springcore2logtracker.trace.callback.TraceCallback;
import com.example.springcore2logtracker.trace.callback.TraceTemplate;
import com.example.springcore2logtracker.trace.logtrace.LogTrace;
import com.example.springcore2logtracker.trace.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceV5 {

    private final OrderRepositoryV5 orderRepository;
    private final TraceTemplate traceTemplate;

    public OrderServiceV5(OrderRepositoryV5 orderRepository, LogTrace trace) {
        this.orderRepository = orderRepository;
        this.traceTemplate = new TraceTemplate(trace);
    }

    public void orderItem(String itemId) {
        traceTemplate.execute("OrderService.orderItem()", () -> {
            orderRepository.save(itemId);
            return null;
        });
    }
}
