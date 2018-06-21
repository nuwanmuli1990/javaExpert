package shapes;

public class Square extends Rectangle {

	private double oneSide;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	public Square(double side) {
		
		super(side, side);
		this.oneSide = side;
	}
	
//	@Override
//	public String draw() {
////		return "Iam Square";
//		return super.draw();
//	}
//	
//	@Override
//	public double getArea() {
//		return oneSide * oneSide;
//	}
//	
//	@Override
//	public double getParameter() {
//		return 4*oneSide;
//	}
}
