package Ex3;

class Triangle extends Figure
{
	private double w, h;

	Triangle(double w, double h) {
		this.w = w;
		this.h = h;
		this.name = "Triangle";
	}

	@Override
	double area()
	{
		return 0.5 * w * h;
	}
}
