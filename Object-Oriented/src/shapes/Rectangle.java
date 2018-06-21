package shapes;

public class Rectangle implements IShape {

	private double width ;
	private double height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	@Override
	public String draw() {
		return "Iam Rectangle";
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getParameter() {
		return (2 * width) + (2 * height);
	}

}
