package com.example.springcore2logtracker.trace.proxy.pureproxy.concreteproxy;

import com.example.springcore2logtracker.trace.proxy.pureproxy.concreteproxy.code.ConcreteClient;
import com.example.springcore2logtracker.trace.proxy.pureproxy.concreteproxy.code.ConcreteLogic;
import com.example.springcore2logtracker.trace.proxy.pureproxy.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {
    @Test
    public void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient concreteClient = new ConcreteClient(concreteLogic);

        concreteClient.execute();
    }

    @Test
    public void addProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        TimeProxy timeProxy = new TimeProxy(concreteLogic);
        ConcreteClient client = new ConcreteClient(timeProxy);
        client.execute();

    }
}
