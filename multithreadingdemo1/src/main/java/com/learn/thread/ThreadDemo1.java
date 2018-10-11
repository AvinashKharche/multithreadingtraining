package com.learn.thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        TaskA1 taskA = new TaskA1();
        TaskB1 taskB = new TaskB1();

        Thread threadA = new Thread(taskA);
        Thread threadB = new Thread(taskB);

        threadA.start();
        threadB.start();

        System.out.println("Finish Line!!");
    }
}

class TaskA1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I :" + i);
        }
    }
}

class TaskB1 implements Runnable {
    public void run() {
        for (int j = 1; j <= 10; j++) {
            System.out.println("J :" + j);
        }
    }
}
