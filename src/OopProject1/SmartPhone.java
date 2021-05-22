package OopProject1;

public class SmartPhone extends AdvancedPhone {
    public void playMusic() {
        System.out.println("Music was played ");
    }

    public void camera() {
        System.out.println("take picture ");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the phone");
    }

    @Override
    public void turnOn() {
        System.out.println("turn on the phone");
    }

    @Override
    public void answer() {
        System.out.println("Hit the Green button");
    }

    @Override
    public void hangUp() {
        System.out.println("hit the red button");
    }

}

