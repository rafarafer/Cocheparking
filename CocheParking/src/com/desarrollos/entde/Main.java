package com.desarrollos.entde;

public class Main {
	public static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        car.accelerate();
        car.slowDown();
        car.moveDown();
        car.accelerate();
        g.printGarage();
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

}
