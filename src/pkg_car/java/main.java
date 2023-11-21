// Package declaration for the car class
package pkg_car.java;

// Main class for car program
public class main {

  // Main method
  public static void main(String[] args) {
    // Create a new car object named "Tesla" with model "ModelS", fuel capacity 23 gallons, and MPG 222
    car Tesla = new car("ModelS", 23, 222);

    // Print the model of the car
    System.out.println(Tesla.getModel());

    // Print the fuel capacity of the car
    System.out.println(Tesla.getTankSize());

    // Print the estimated distance the car can travel with a full tank
    System.out.println(Tesla.estimateDistance());
  }
}
