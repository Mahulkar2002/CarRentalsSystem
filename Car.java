public class Car {
    private String carName;
    private String carModel;
    private int year;
    private boolean Available;

    public Car(String carName,String carModel,int year){
        this.carName=carName;
        this.carModel=carModel;
        this.year=year;
        this.Available=true;
    }

    public String getCarName() {
        return carName;
    }
    public String getCarModel() {
        return carModel;
    }
    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean Available) {
    this.Available=Available;
    }
}
