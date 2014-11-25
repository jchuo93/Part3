import java.util.Scanner;
/**
 * 
 */
//************************************************************
//Circle.java
//
//Print the area of a circle with two different radii
//************************************************************
/**
 * @author Jacky
 *
 */
public class Circle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	final double PI = 3.14159;
	
int radius1 = 10;

double area1 = PI * radius1 * radius1;

System.out.println("The area of a circle with radius " + radius1 +
" is " + area1);

double radius2 = 20;

double area2 = PI * radius2 * radius2;

System.out.println("The area of a circle with radius " + radius2 +
" is " + area2);	

double circumference1 = 2 * (PI * radius1);
System.out.println("This is the circumference of a circle " + circumference1);

double circumference2 = 2 * (PI * radius2);
System.out.println("This is the circumference of a circle " + circumference2);
	
double growth1 = area2 / area1;
System.out.println("This is the difference in area " + growth1);

double growth2 = circumference2 / circumference1;
System.out.println("This is the difference in circumference " + growth2);
	
Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a value for radius: ");
	radius1 = scan.nextInt();

double area3 = PI * radius1 * radius1;
System.out.println("The area of a circle with radius " + radius1 + " is " + area3);

double area4 = PI * (radius1 * 2) * (radius1 * 2);
System.out.println("The area of a circle with double the radius " + radius1 + " is " + area4);
	}

}


