import java.util.Scanner;
/**
 * 
 */

/**
 * @author Jacky
 *
 */
public class Paint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int COVERAGE = 350; //paint covers 350 sq ft/gal
		double length = 7;
		System.out.println("Length of door is " + length);
		double width = 5;
		System.out.println("Width of door is " + width);
		double height = 10;
		System.out.println("Height of door is " + height);
		double totalSqFt = 2 * (height * length *  height * width);
		System.out.println("Total square foot of the door is " + totalSqFt);
		double paintNeeded = totalSqFt;
		System.out.println("Amount of paint needed is " + totalSqFt);
		//declare integers length, width, and height;
		//declare double totalSqFt;
		//declare double paintNeeded;
		//declare and initialize Scanner object
		//Prompt for and read in the length of the room
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the room: ");
		length = scan.nextInt();
		
		System.out.println("Please enter the width of the room: ");
		width = scan.nextInt();
		
		System.out.println("Please enter the height of the room: ");
		height = scan.nextInt();
		//Prompt for and read in the width of the room
		//Prompt for and read in the height of the room
		//Compute the total square feet to be painted--think
		//about the dimensions of each wall
		//Compute the amount of paint needed
		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.
		double totalSqFt1 = 2 * (height * length *  height * width);
		System.out.println("Total square foot of the door is " + totalSqFt1);
		double paintNeeded1 = totalSqFt1;
		System.out.println("Amount of paint needed is " + paintNeeded1);
		
		double gallons = paintNeeded1 / 350;
		System.out.println("Amount of paint needed is " + paintNeeded1 + ",The gallons of paint needed is " + gallons);
		
		double windows = 15;
		double doors = 20;
		
		System.out.println("Please enter the number of windows: ");
		windows = scan.nextInt();
		
		System.out.println("Please enter the number of doors: ");
		doors = scan.nextInt();
		
		double numwindows = windows * 15;
		System.out.println("The windows make up " + numwindows + "SqFt");
		double numdoors = doors * 20;
		System.out.println("The doors make up " + numdoors + "SqFt");
		double totalSqFt2 = (2 * (height * length *  height * width)) - (numwindows + numdoors);
		System.out.println("The total amount of SqFt in the room is " + totalSqFt2);
	}

}
