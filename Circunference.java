/*Write a Java program to print the area and perimeter of a circle. The radius should come from the user.
Please enter a radius: 7.5 
The results for Perimeter and Area 
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/
import java.util.Scanner;

public class Circunference {
	   public static void main(String[] args) {
		   
		   Scanner in = new Scanner(System.in);

		   double radius, diameter, perimeter, area;
		   
	        System.out.println("Write the radius of a circunference: ");
	        radius = in.nextDouble();
	        
			   diameter = 2 * radius;
			   perimeter = 2*Math.PI*radius; 
			   area = Math.PI*Math.pow(radius, 2);
			     
	        System.out.println("The diameter of the circunference is: \n"+diameter);
	         		
	        System.out.println("The perimeter of the circle is: \n"+perimeter);
	        
	        
	        System.out.println("El area of the circunference is: \n"+area);

	        
		   
	   }
	

}
