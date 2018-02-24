package ood;

public class Car extends Car_H implements Car_I, Car_S{
	Car car;
	public Car() {
		super();
	}

	public Car(String type, double price, String model, int year, String name, String tag) {
		super(type, price, model, year, name, tag);
		car = new Car();
		car.setType(type);
	    car.setPrice(price);
		car.setModel(model);
		car.setYear(year);
		car.setName(name);
		car.setTag(tag);

		
	}

	@Override
	public void PrintCar() {
		System.out.println("Type : " + car.getType() + " Price :" + car.getPrice()+ " "
				+ " Model :" + car.getModel() + " Year : " + car.getYear() + " Name :" + car.getName() +
				" Tag :" + car.getTag());
	}

	@Override
	public void go() {
		int speed;
		switch(car.getModel().toLowerCase())
		{
		case "bmw":
			System.out.println("BMW");
		  speed = Car_E.BMW.getSpeed();
		  break;
		case "elentra":
			System.out.println("elentra");
			speed = Car_E.Elentra.getSpeed();
			break;
			default:
				System.out.println("IN HERE ");
				speed = Car_E.Ford.getSpeed();
		}
		System.out.println("SPEED IS " +speed);
		
	}

	@Override
	public void stop() {
		System.out.println("The Car is stopped now");
		
	}
	

	

}
