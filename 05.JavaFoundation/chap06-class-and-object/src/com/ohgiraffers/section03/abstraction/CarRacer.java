package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car();   //객체 생성구문

    public void startCar(){
        car.startCar();

    }
    public void stepAcclator(){
        car.go();
    }
    public void stepBreak(){
        car.stop();
    }
    public  void turnOff(){
        car.turnOff();
    }
}
