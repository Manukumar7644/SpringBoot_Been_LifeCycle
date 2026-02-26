package in.scalive.beans;

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
    public void startCar() {
    	System.out.println("Car started....");
    }
    public void drive() {
    	System.out.println("Car is getting driven...");
    }
    public void stopCar() {
    	System.out.println("Car stopped....");
    }
}
