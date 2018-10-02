package Ex3;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Figure> figures = new ArrayList<Figure>();
		figures.add(new Rectangle(3.0, 4.0));
		figures.add(new Circle(2.0));
		figures.add(new Triangle(2.5, 4.0));
		figures.add(new Rectangle(3.0, 4.0));
		figures.add(new Rectangle(3.0, 4.0));
		figures.add(new Triangle(3.0, 4.0));
		figures.add(new Circle(4.2));
		figures.add(new Circle(1.0));
		for (Figure f : figures) {
			System.out.println(String.format("This is a %s with area = %f", f.name, f.area()));
		}
	}
}
