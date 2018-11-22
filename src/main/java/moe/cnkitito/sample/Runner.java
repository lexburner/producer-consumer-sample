package moe.cnkitito.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    private final static int CONSUMER_NUM = 64;
    private final static int LOOP_TIMES = 100;

    public static void main(String[] args) {

        SharedObject sharedObject = new SharedObject();

        Producer producer = new Producer(sharedObject);
        Consumer consumer = new Consumer(sharedObject);

        ExecutorService producerThread = Executors.newSingleThreadExecutor();
        ExecutorService consumerThreadPool = Executors.newFixedThreadPool(CONSUMER_NUM);

        producerThread.execute(() -> {
            for (int i = 0; i < LOOP_TIMES; i++) {
                producer.produce();
            }
        });
        consumerThreadPool.execute(() -> {
            for (int i = 0; i < LOOP_TIMES; i++) {
                consumer.consume();
            }
        });

    }
}
