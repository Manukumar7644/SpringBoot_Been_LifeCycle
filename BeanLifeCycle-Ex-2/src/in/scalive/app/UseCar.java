package in.scalive.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Car;

public class UseCar {
  public static void main(String[] args) {
	AbstractApplicationContext container=new ClassPathXmlApplicationContext("/in/scalive/resources/beanconf.xml");
	container.registerShutdownHook();
	Car car=(Car)container.getBean("car");
	car.drive();
	
}
}
