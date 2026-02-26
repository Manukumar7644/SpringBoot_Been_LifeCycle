package in.scalive.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car {
    private String brand;
    public Car() {
    	System.out.println("Car bean created...");
    }
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("setter called...");
		this.brand = brand;
	}
    
    public void drive() {
    	System.out.println("Car is getting driven...");
    }
    @PostConstruct
	public void startCar() {
		System.out.println("Car has started...");
	}
    @PostConstruct
	public void applyGears() {
		System.out.println("Gear applied...");
	}
    @PostConstruct
	public void acclerate() {
		System.out.println("Car is acclerating..");
	}
    @PreDestroy
    public void stopCar() {
    	System.out.println("Car has stopped...");
    }
}
