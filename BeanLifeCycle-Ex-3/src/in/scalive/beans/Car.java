package in.scalive.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean,DisposableBean{
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
    
	@Override
	public void destroy() throws Exception {
		System.out.println("Car stopped....");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Car started....");
		
	}
}
