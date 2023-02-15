package Annotations01;

public class Car {
    private String modelName;
    private double mileage;

    public Car(String modelName, double mileage){
        this.modelName = modelName;
        this.mileage = mileage;
    }
    @Deprecated
    public void printCarDetails(){
        System.out.println("Model name: " + modelName + " - Mileage: " + mileage);
    }

    public void getCarDetails(){
        System.out.println("Model name: " + modelName);
        System.out.println("Mileage: " + mileage);
    }
}
