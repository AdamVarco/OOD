package ood;
/*
 * I call all my abstract classes as concrete class_H - a reference to C and C++
 */
public abstract class Car_H {

	private String type;
	private double price;
	private String model;
	private int year;
	private String name;
	private String tag;
	
	public Car_H() {
		super();
	}
	
	public Car_H(String type, double price, String model, int year, String name, String tag) {
		super();
		this.type = type;
		this.price = price;
		this.model = model;
		this.year = year;
		this.name = name;
		this.tag = tag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	public abstract void PrintCar();
}
