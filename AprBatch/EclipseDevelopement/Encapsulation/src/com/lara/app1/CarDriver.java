package com.lara.app1;


class Car
{
	
	
    public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	private String make;
    private String model;
    private int year;
    
    
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

public class CarDriver
{
	public static void main(String[] args)
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		
		
		Car car = new Car();
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setYear(2020);
        String make = car.getMake();
        String model = car.getModel();
        int year = car.getYear();
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
	}
}
