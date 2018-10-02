package Ex3;

class Circle extends Figure
{
	private double r;

	Circle(double r) {
		this.r = r;
		this.name = "Circle";
	}

	@Override
	double area()
	{
		return Math.PI * Math.pow(r, 2);
	}
}
