import java.util.ArrayList;

public abstract class Car {

    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {

        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);

    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getInfo() {

        return "Vin Number : " + getVinNumber() + " make : " + getMake() + " model : " + getModel() + " mileage : " + getMileage();


    }



}
