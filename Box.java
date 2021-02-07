/* Student Name:Jake Coombes
 * Date:10/23/18
 * Lab 6:
 * 		a class that takes 4 parameters of 
 * 		a box and then calculates the area.
 */

public class Box {
	
	//private class attributes
	private double width;
	private double length;
	private double height;
	private String label;
	private double volume;
	
	//private constructors
	private Box()
	{	
		//By having a private constructor, outside users can not create an instance
		//with a default constructor :-D
	}
	
	public Box(double w, double l, double h,String name)
	{
		//Fill in code to copy w, l, h, name to width, length, height, label respectively
	
		width = w;
		length = l;
		height = h;
		label = name; 
	}
	
	public Box(Box cloneMe)
	{	//Copy the attributes of cloneMe to this classes instance
		if(cloneMe == null) return;
		
		this.length = cloneMe.length;
		this.width = cloneMe.width;
		this.height = cloneMe.height;
		this.label = cloneMe.label + " clone";	
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public String getLabel() {
		return label;
	}
	
	public double getVolume() {
		return (length * width * height);
	}

}