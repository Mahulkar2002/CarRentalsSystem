import java.util.Scanner;

import static java.lang.System.exit;

public class Main extends CarRentalSystem{
    public void menu(){

        System.out.println();
        System.out.println("========***WELCOME TO CAR RENTAL SYSTEM***=========");
        System.out.println();
        System.out.println("=============***ENTER THE CHOICE***==============");
        System.out.println();
        System.out.println("1. View Available Cars  ");
        System.out.println("2. Rent Car Available ");
        System.out.println("3. Return Car ");
        System.out.println("4.Exist");
    }
    public static void main(String[] args) {

         Main obj2= new Main();

         obj2.addCar(new Car(" Car Name: Toyota", "Car Model: Camrey", 2022));
         obj2.addCar(new Car(" Car Name: Honda", " Car Model: Civic", 2021));
         obj2.addCar(new Car(" Car Name: Ford", "  Car Model::Mustang", 2023));
         obj2.addCar(new Car(" Car Name: BMW", "Car Model: 3Series", 2024));

         Scanner sc = new Scanner(System.in);
        int choice=100;
        obj2.menu();

        while(choice>0) {

            System.out.println("Enter the choice:");
            choice = sc.nextInt();

            switch (choice){
             case 1:
                 System.out.println("Available cars are:");
                 for( Car car: obj2.cars){
                     System.out.println(car.getCarName()+"   "+car.getCarModel()+"  "+car.getYear());
                 }
                 break;

             case 2:
                 System.out.println("Enter car name to rent");
                 String name=sc.next();
                 System.out.println("Enter car model to rent");
                 String model=sc.next();
                 obj2.rentCar(name,model);
                 System.out.println("Car rented succesfully ");


                 break;
             case 3:
                 System.out.println("Enter the car name to return");
                 String nameOfCar=sc.next();
                 System.out.println("Enter the car name to return");
                 String nameOfModel=sc.next();
                 obj2.renturnCar(nameOfCar,nameOfModel);
                 System.out.println("Car retuned succesfully ");
                 break;

             case 4:
                 exit(0);
                 System.out.println("Thankyou ");
                 break;
         }

        }
    }
}