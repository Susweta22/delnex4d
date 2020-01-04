package assignment2;

public class CarDetail {
	String carName;
	String carColour;
	String brandName;
	int noOfCar;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColour() {
		return carColour;
	}
	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getNoOfCar() {
		return noOfCar;
	}
	public void setNoOfCar(int noOfCar) {
		this.noOfCar = noOfCar;
	}
	public CarDetail(String brandName,String carColour, String carName, int noOfCar) {
		super();
	this.brandName = brandName;
	this.carColour= carColour;
	this.carName = carName;
	this.noOfCar=noOfCar;	}
	@Override
	public String toString() {
		return "CarDetail [carName=" + carName + ", carColour=" + carColour + ", brandName=" + brandName + ", noOfCar="
				+ noOfCar + "]";
	}
	
	

}
