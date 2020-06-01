
public class Car {
	int tire;
	double engine;
	double carBreak;
	String brand;
	
	public Car() {}
	
	public Car(int tire) {
		this.tire = tire;
	}
	
	
	@Override
	public String toString() {
		return "Car [tire=" + tire + ", engine=" + engine + ", carBreak=" + carBreak + ", brand=" + brand + "]";
	}
	
}
