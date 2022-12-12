package com.example.springcore2logtracker.trace.proxy.pureproxy.proxy;

import com.example.springcore2logtracker.trace.proxy.pureproxy.proxy.code.CacheProxy;
import com.example.springcore2logtracker.trace.proxy.pureproxy.proxy.code.ProxyPatternClient;
import com.example.springcore2logtracker.trace.proxy.pureproxy.proxy.code.RealSubject;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    public void noProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);

        client.execute();
        client.execute();
        client.execute();
    }

    @Test
    public void cacheProxyTest() {
        RealSubject realSubject = new RealSubject();
        CacheProxy cacheProxy = new CacheProxy(realSubject);
        ProxyPatternClient client = new ProxyPatternClient(cacheProxy);

        client.execute();
        client.execute();
        client.execute();
    }
}
