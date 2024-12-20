import java.util.*;
//vehicle class

class Vehicle{
    String name;
    int model;
    int price;
    public Vehicle(String name, int model, int price){
        this.name=name;
        this.model=model;
        this.price=price;
    }
    @Override
    public String toString() {
        return "Vehicle{name='" + name + "', model=" + model +
                ", price=" + price + "}";
    }
}



//main class 
public class Main{
    //importing arraylist as a database to store values
     static ArrayList<Vehicle> cars = new ArrayList<>();
    //add function
    static void addvehicle(){
        System.out.println("Fill Vehicle Details");
        Scanner myinp = new Scanner(System.in); 
        System.out.println("Enter Vehicle name");
        String name=myinp.nextLine();
        System.out.println("Enter Vehicle model");
        int model=myinp.nextInt();
        System.out.println("Enter Vehicle price");
        int price=myinp.nextInt();
        //creating object of vehicle class with parameter
        Vehicle vehicles=new Vehicle(name, model, price);
        cars.add(vehicles);
         System.out.println("Details added successfully");
    }
     //display function
    static void showvehicle(){
        System.out.println("This is display function");
        if(cars.size()==0){
            System.out.println("its empty");
        }else{
            for(int i=0;i<cars.size();i++){
                System.out.println(cars.get(i));
            }
        }
    }
     //remove function
    static void removevehicle(){
        System.out.println("This is delete function");
        System.out.println("Enter Your Choice==> ");
           System.out.println("Press 1 To delete only selected car data \nPress 2 To delete everything");
           Scanner del = new Scanner(System.in); 
           int delete_choice=del.nextInt();
           switch (delete_choice){
               case 1:
                   System.out.println("Enter car name : ");
                   Scanner delcar=new Scanner(System.in);
                   String car_name=delcar.nextLine();
                   boolean removed = cars.removeIf(Vehicle ->Vehicle.name.equalsIgnoreCase(car_name));
                   if (removed) {
                        System.out.println("Vehicle removed: " + car_name);
                        } else {
                         System.out.println("Vehicle not found: " + car_name);
                     }
                   break;
                case 2:
                   cars.clear();
                   System.out.println("Everything Deleted Successfully");
                   break;
                default:
                   System.out.println("Invalid Number");
                   break;
           }
    }
    public static void main(String args[]){
        System.out.println("Jai Bajrang Bali");
        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Show Vehicles");
            System.out.println("3. Remove Vehicle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            Scanner myinp = new Scanner(System.in); 
            int choice=myinp.nextInt();
            switch(choice){
                case 1:
                    addvehicle();
                    break;
                case 2:
                    showvehicle();
                    break;
                case 3:
                    removevehicle();
                    break;
                case 4:
                   System.out.println("Exiting...");
                   System.exit(0);
                default:
                    System.out.println("Invalid choice, Try again");
            }
        }
    }
}