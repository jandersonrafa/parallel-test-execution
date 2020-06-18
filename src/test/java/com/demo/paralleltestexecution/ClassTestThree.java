package com.demo.paralleltestexecution;

import org.junit.jupiter.api.Test;

public class ClassTestThree {

    @Test
    public void methodOne() throws InterruptedException {
        sleepAndPrint("methodOne");
    }

    @Test
    public void methodTwo() throws InterruptedException {
        String methodOne = "methodTwo";
        sleepAndPrint(methodOne);
    }

    @Test
    public void methodThree() throws InterruptedException {
        String methodOne = "methodThree";
        sleepAndPrint(methodOne);
    }

    @Test
    public void methodFour() throws InterruptedException {
        String methodOne = "methodFour";
        sleepAndPrint(methodOne);
    }

    @Test
    public void methodFive() throws InterruptedException {
        String methodOne = "methodFive";
        sleepAndPrint(methodOne);
    }

    private void sleepAndPrint(String method) throws InterruptedException {
        System.out.println("Start " + method);
        // Sleep 2 seconds
        Thread.sleep(2000);
        System.out.println("End " +method);
    }

}
