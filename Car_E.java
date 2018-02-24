package ood;

public enum Car_E {
	BMW(300), Elentra(200), Ford(165);
	private int speed;

	private Car_E(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;

	}

}
