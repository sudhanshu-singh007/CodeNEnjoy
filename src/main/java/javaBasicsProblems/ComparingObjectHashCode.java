package javaBasicsProblems;

public class ComparingObjectHashCode {
	
	private String name;
	private int regno;

	public ComparingObjectHashCode(int regno, String name)   
	{  
	this.name = name;  
	this.regno = regno;  
	}  
	
	public static void main(String[] args) {
//creating two instances of the Employee class 

		ComparingObjectHashCode emp1 = new ComparingObjectHashCode(918, "Maria");
		ComparingObjectHashCode emp2 = new ComparingObjectHashCode(918, "Maria");
//invoking hashCode() method  
		int a = emp1.hashCode();
		int b = emp2.hashCode();
		System.out.println("hashcode of emp1 = " + a);
		System.out.println("hashcode of emp2 = " + b);
		System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));
	}
}