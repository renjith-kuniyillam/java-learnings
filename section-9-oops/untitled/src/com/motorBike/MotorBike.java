package com.motorBike;

public class MotorBike {
    private int speed;

    public MotorBike(int speed) {
        this.speed = speed;
    }

    public MotorBike() {
        this(5);
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        }
        System.out.println("Speed: " + speed);
       
    }

    public void increaseSpeed(int howMuch) {
        this.setSpeed(this.speed+ howMuch);
    }

    public void start() {
        System.out.println("MotorBike::Start");
    }

    public void stop() {
        System.out.println("MotorBike::Stopping");
    }
}
