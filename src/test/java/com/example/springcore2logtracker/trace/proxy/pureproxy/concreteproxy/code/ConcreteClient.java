package com.example.springcore2logtracker.trace.proxy.pureproxy.concreteproxy.code;

public class ConcreteClient {
    private ConcreteLogic concreteLogic;

    public ConcreteClient(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    public void execute() {
        concreteLogic.operation();
    }
}
