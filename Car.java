package ood;

public class Car extends Car_H implements Car_I, Car_S{
	public Car() {
		super();
	}

	public Car(String type, double price, String model, int year, String name, String tag) {
		super(type, price, model, year, name, tag);
   }

	@Override
	public void PrintCar() {
		System.out.println("Type : " + this.getType() + " Price :" + this.getPrice()+ " "
				+ " Model :" + this.getModel() + " Year : " + this.getYear() + " Name :" + this.getName() +
				" Tag :" + this.getTag());
	}

	@Override
	public void go() {
		int speed;
		switch(this.getModel().toLowerCase())
		{
		case "bmw":
		  speed = Car_E.BMW.getSpeed();
		  break;
		case "elentra":
			speed = Car_E.Elentra.getSpeed();
			break;
			default:
				speed = Car_E.Ford.getSpeed();
		}
		System.out.println("SPEED IS " +speed);
		
	}

	@Override
	public void stop() {
		System.out.println("The Car is stopped now");
		
	}
}
