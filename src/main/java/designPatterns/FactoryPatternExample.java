package designPatterns;
/*In Factory pattern, we create object without exposing the creation logic to the client 
and refer to newly created object using a common interface.
*/

//initilizing Vehicle class( parent class)

abstract class Vehicle {
	  public abstract int getWheel();
	  
	  public String toString() {
	    return "Wheel: " + this.getWheel();
	  }
	}

// Creating child clas "car" and inheriting the parent class( vehicle) 

	class Car extends Vehicle {
	  int wheel;
	  
	  Car(int wheel) {
	    this.wheel = wheel;
	  }

	  @Override
	  public int getWheel() {
	    return this.wheel;
	  }
	}

	class Bike extends Vehicle {
	  int wheel;
	  
	  Bike(int wheel) {
	    this.wheel = wheel;
	  }
	  
	  @Override
	  public int getWheel() {
	    return this.wheel;
	  }
	}
	
//factory class for returning object on type
	
	class VehicleFactory {
	  public static Vehicle getInstance(String type, int wheel) {
	    if(type == "car") {
	      return new Car(wheel);
	    } else if(type == "bike") {
	      return new Bike(wheel);
	    }
	    
	    return null;
	  }
	}
	
//main class to invoke object
	
	public class FactoryPatternExample {

	  public static void main(String[] args) {
	    Vehicle car = VehicleFactory.getInstance("car", 4);
	    System.out.println(car);
	    
	    Vehicle bike = VehicleFactory.getInstance("bike", 2);
	    System.out.println(bike);
	  }

	}
