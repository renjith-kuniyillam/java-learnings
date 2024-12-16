package Oops.Fan;

public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
        swithOn();
    }



    public String toString() {
        return String.format("Fan [make=%s, radius=%f, color=%s, isOn=%b, speed=%d]", make, radius, color, isOn, speed);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    public void swithOn() {
        isOn = true;
        setSpeed((byte) 5);
    }

    public void switchOff() {
        isOn = false;
        setSpeed((byte) 0);
    }
}
