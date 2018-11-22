package moe.cnkitito.sample;

import java.util.Random;

public class Producer {
    private Random random = new Random();
    private SharedObject sharedObject;

    public Producer(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    public void produce(){
        // add logic here
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sharedObject.setRandomNum(random.nextInt(100));
        System.out.println("[producer "+Thread.currentThread().getName()+"] "+" produce random num : "+sharedObject.getRandomNum());
    }

}
