package com.example.springcore2logtracker.trace.logtrace;

import com.example.springcore2logtracker.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);
    void end(TraceStatus status);
    void exception(TraceStatus status, Exception e);
}
