package shapes;

public class MyCircle implements IShape {

	public static final double S_DEFAULT_PI = 3.145;
	
	private double radius;
	
	public MyCircle() {
		// TODO Auto-generated constructor stub
	}
	
	public MyCircle(double r) {
		this.radius = r;
	}
	
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return S_DEFAULT_PI * radius * radius;
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return 2  * S_DEFAULT_PI * radius;
	}

}
