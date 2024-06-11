package ex13interface;

import ex13interface.figure.Circle;
import ex13interface.figure.IDrawable;
import ex13interface.figure.IFigure;
import ex13interface.figure.Rectangle;
import ex13interface.figure.Triangle;

public class E05FigureDrawableMain {

	public static void main(String[] args) {
		
		IFigure figure = new Circle(30);
		figure.area("원");
		((Circle)figure).draw("원2");
		System.out.println("");
		
		IFigure fig1 = new Rectangle(100, 90);
		fig1.area("사각형");
		((Rectangle)fig1).draw("사각형2");
		System.out.println("");
		
		IDrawable draw = new Triangle(100, 90);
		draw.draw("삼각형");
		((Triangle)draw).area("삼각형2");
		System.out.println("");
		
		Circle circle = new Circle(40);
		circle.area("원");
		circle.draw("원2");
	}

}
