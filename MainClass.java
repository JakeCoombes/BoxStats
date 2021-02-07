/* Student Name:Jake Coombes
 * Date:10/23/18
 * Lab 6:
 * 		use the box class to create 4 boxes. after that print 
 * 		out all of the boxes info and calculated volume.
 */

public class MainClass {

	public static void main(String[] args) 
	{	//Do not change any code in this class!
		//create instances of the Box class and enter variables
		Box b1 = new Box(7,8,9, "Box 1");
		Box b2 = new Box(7,7,7, "Box 2");
		Box b3 = new Box(b1);
		Box b4 = new Box(b2);
		
		//print out box 1 info
		System.out.println("Box " + b1.getLabel() + " Stats:");
		System.out.println("Width = " + b1.getWidth());
		System.out.println("Length = " + b1.getLength());
		System.out.println("Height = " + b1.getHeight());
		System.out.println("Volume = " + b1.getVolume());
		
		//print out box 2 info
		System.out.println("Box " + b2.getLabel() + " Stats:");
		System.out.println("Width = " + b2.getWidth());
		System.out.println("Length = " + b2.getLength());
		System.out.println("Height = " + b2.getHeight());
		System.out.println("Volume = " + b2.getVolume());
		
		//print out box 3 info
		System.out.println("Box " + b3.getLabel() + " Stats:");
		System.out.println("Width = " + b3.getWidth());
		System.out.println("Length = " + b3.getLength());
		System.out.println("Height = " + b3.getHeight());
		System.out.println("Volume = " + b3.getVolume());
		
		//print out box 4 info
		System.out.println("Box " + b4.getLabel() + " Stats:");
		System.out.println("Width = " + b4.getWidth());
		System.out.println("Length = " + b4.getLength());
		System.out.println("Height = " + b4.getHeight());
		System.out.println("Volume = " + b4.getVolume());

	}

}