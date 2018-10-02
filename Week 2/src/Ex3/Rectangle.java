package Ex3;

class Rectangle extends Figure
{
	private double w, h;

	Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
		this.name = "Rectangle";
	}

	@Override
	double area()
	{
		return w * h;
	}
}
