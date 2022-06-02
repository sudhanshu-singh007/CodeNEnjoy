package designPatterns;
//The singleton pattern is a design pattern that restricts the instantiation of a class to one object

//constructor private
//public method of returning instance
//instance type - private static

//type one (eager approach of declaring)
/*
 *In eager initialization, the instance of Singleton Class is created at the time of class loading, 
 *this is the easiest method to create a singleton class but it has a drawback that instance is 
 *created even though client application might not be using it. 
 *
 */
class SingletonEagar {
	  private static SingletonEagar instance = new SingletonEagar(); 
	  
	  private SingletonEagar(){}
	  
	  public static SingletonEagar getInstance() {
	    return instance;
	  }
	}

	class Singleton {
	  private static Singleton instance; 
	  
	  private Singleton(){}
	  
	  public static Singleton getInstance() {
	    if(instance == null) {
	      instance = new Singleton();
	    }
	    
	    return instance;
	  }
	}

//	type two(synchroinzed way)
	
	class SingletonSynchronizedMethod {
	  private static SingletonSynchronizedMethod instance; 
	  
	  private SingletonSynchronizedMethod(){}
	  
	  public static synchronized SingletonSynchronizedMethod getInstance() {
	    if(instance == null) {
	      instance = new SingletonSynchronizedMethod();
	    }
	    return instance;
	  }
	}

	class SingletonSynchronized {
	  private static SingletonSynchronized instance; 
	  
	  private SingletonSynchronized(){}
	  
	  public static SingletonSynchronized getInstance() {
	    if(instance == null) {
	      synchronized (SingletonSynchronized.class) {
	        if(instance == null) {
	          instance = new SingletonSynchronized();
	        }
	      }
	    }
	    return instance;
	  }
	}

	public class sigletonDesignPatternEg {

	  public static void main(String[] args) {
	    SingletonSynchronized instance = SingletonSynchronized.getInstance();
	    
	    System.out.println(instance);
	    
	    SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
	    
	    System.out.println(instance1);
	  }
	}
