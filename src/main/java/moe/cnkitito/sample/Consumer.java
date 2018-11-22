package moe.cnkitito.sample;

public class Consumer {

    private SharedObject sharedObject;

    public Consumer(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    public void consume(){
        // add logic here
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[consumer "+Thread.currentThread().getName()+"] "+" consume random num : "+sharedObject.getRandomNum());
    }

}
