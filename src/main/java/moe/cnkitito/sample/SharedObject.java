package moe.cnkitito.sample;

public class SharedObject {
    private volatile int randomNum = 0;

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }
}
