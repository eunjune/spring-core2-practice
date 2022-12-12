package com.example.proxy.app.v2;

import com.example.proxy.app.v1.OrderRepositoryV1;

public class OrderRepositoryV2{
    public void save(String itemId) {
        if(itemId.equals("ex")) {
            throw new IllegalArgumentException("예외 발생!");
        }
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
