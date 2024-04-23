import java.util.ArrayList;
import java.util.List;


    class CarRentalSystem {
        List<Car> cars;

        CarRentalSystem() {
            cars = new ArrayList<>();
        }

        public List<Car> getCars() {
            return cars;
        }
        //logic to add Cars
        public void addCar(Car car) {
            cars.add(car);
        }
        //getAvailableCars
        public  List<Car> getAvailable() {
            List<Car> availableCars = new ArrayList<>();
            for(Car car:cars) {
                if (car.isAvailable()) {
                    availableCars.add(car);
                }
            }
            return availableCars;
        }

        //Rent a Car - car is available when isAvailable is true
        public void rentCar(String carName, String carModel) {
            for (Car car : cars) {
                if (car.getCarName().equalsIgnoreCase(carName) && car.getCarModel().equalsIgnoreCase(carModel) && car.isAvailable()) {
                    car.setAvailable(false);
                    break;
                } else if (!car.getCarName().equals(carName) ||  (!car.getCarModel().equalsIgnoreCase(carModel) )||(!car.isAvailable())){
                    System.out.println("Enter the correct details");
                    break;
                }
            }
        }

        //return a car
        public void renturnCar(String carName, String carModel){
            for(Car car:cars){
                if (car.getCarName().equalsIgnoreCase(carName) && car.getCarModel().equalsIgnoreCase(carModel) && !car.isAvailable()){
                    car.setAvailable(true);
                    break;
                }
                else if (!car.getCarName().equals(carName) ||  (!car.getCarModel().equalsIgnoreCase(carModel) ) && (car.isAvailable())){
                    System.out.println("Car not returned");
                    break;
                }
                }
                }



        public static void main(String[] args) {

            CarRentalSystem obj1 = new CarRentalSystem();

        }

    }

