package com.example.springcore2logtracker.trace.strategy;

import com.example.springcore2logtracker.trace.strategy.code.strategy.ContextV1;
import com.example.springcore2logtracker.trace.strategy.code.strategy.StrategyLogic1;
import com.example.springcore2logtracker.trace.strategy.code.strategy.StrategyLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV1Test {
    @Test
    public void templateMethodV0() {
        logic1();
        logic2();
    }
    private void logic1() {
        long startTime = System.currentTimeMillis();

        log.info("비즈니스 로직1 실행");

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}",resultTime);
    }
    private void logic2() {
        long startTime = System.currentTimeMillis();

        log.info("비즈니스 로직2 실행");

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}",resultTime);
    }

    @Test
    public void strategy1() {
        StrategyLogic1 strategyLogic1 = new StrategyLogic1();
        ContextV1 cotext1 = new ContextV1(strategyLogic1);
        cotext1.execute();;

        StrategyLogic2 strategyLogic2 = new StrategyLogic2();
        ContextV1 cotext2 = new ContextV1(strategyLogic2);
        cotext2.execute();


    }

}
