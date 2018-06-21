import java.util.ArrayList;
import java.util.List;

import shapes.IShape;
import shapes.MyCircle;
import shapes.Rectangle;
import shapes.Square;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Musketeer musk_athoes = new Musketeer("Athoes", 25);
//		Musketeer musk_oithos = new Musketeer("Photos");
//		Musketeer m3 = new Musketeer();
//	
//		List<Musketeer> listOfMusketeers = new ArrayList<>();
//		
//		listOfMusketeers.add(musk_athoes);
//		listOfMusketeers.add(musk_oithos);
//		listOfMusketeers.add(m3);
//		
//		for(Musketeer musk: listOfMusketeers) {
//			System.out.println("Musketeer name :"+ musk.getM_name()+ " Age :"+ musk.getM_age());
//		}
		String shapeType = "";
		
		IShape myCircle = new MyCircle(10);
		IShape myRectangle = new Rectangle(5,10);
		Rectangle mySquare = new Square(5);

		
		System.out.println("myRectangle  "+myRectangle.draw());
		System.out.println("mySquare  "+mySquare.draw());
		System.out.println("myS  "+mySquare.draw());
		
		System.out.println("=================== Processing Circle... ==============================");
		
		System.out.println("Circle Area  :"+ myCircle.getArea());
		System.out.println("Circle Parameter  :"+myCircle.getParameter());
		
		
		System.out.println("==================== Processing Rectangle... =============================");
		
		System.out.println("Rectangle Area  :"+ myRectangle.getArea());
		System.out.println("Rectangle Parameter  :"+myRectangle.getParameter());
		
		System.out.println("==================== Processing Square... =============================");
		
		System.out.println("Square Area  :"+ mySquare.getArea());
		System.out.println("Square Parameter  :"+mySquare.getParameter());
		
		System.out.println("=================================================");
		List<IShape> myShpes = new ArrayList<>();
		
		myShpes.add(myCircle);
		myShpes.add(myRectangle);
		myShpes.add(mySquare);
		
		for(IShape sh: myShpes) {
			
			
			//check weather instance is Circle or Rectangle or Square
			if(sh instanceof MyCircle) {
				shapeType = "Circle";
			}
			else if (sh instanceof Rectangle) {
				if(sh instanceof Square) {
					shapeType = "Square";
				}
				else {
					shapeType = "Rectangle";
				}
				
			}
			else if (sh instanceof Square){
				shapeType = "Square";
			}
			else {
				
			}
			
			System.out.println(shapeType+" Area  :"+ mySquare.getArea());
			System.out.println(shapeType+" Parameter  :"+mySquare.getParameter());
		}
		
	}

}
