package com.learn.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        TaskA taskA = new TaskA();
        TaskB taskB = new TaskB();

        taskA.start();
        taskB.start();

        System.out.println("Finish Line!!");
    }
}

class TaskA extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I :" + i);
        }
    }
}

class TaskB extends Thread{
    public void run() {
        for (int j = 1; j <= 10; j++) {
            System.out.println("J :" + j);
        }
    }
}

