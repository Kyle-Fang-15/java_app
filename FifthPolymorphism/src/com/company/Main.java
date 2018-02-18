package com.company;

class Car{
private String name;
private int cylinders;
private int wheels;
private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(boolean engine){
        return "startenginer";
    }

    public String accelerate(){
        return "accelerate";
    }
    public String breakCar(){
        return "breakthe car";
    }
}

class M1 extends Car{
    public M1(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine(boolean engine) {
        return super.startEngine(engine);
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String breakCar() {
        return super.breakCar();
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

    }



}

 class M2 extends Car {
    public M2(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine(boolean engine) {
        return super.startEngine(engine);
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String breakCar() {
        return super.breakCar();
    }
}