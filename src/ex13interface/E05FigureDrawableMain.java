package ex13interface;

import ex13interface.figure.Circle;
import ex13interface.figure.IDrawable;
import ex13interface.figure.IFigure;
import ex13interface.figure.Rectangle;
import ex13interface.figure.Triangle;

public class E05FigureDrawableMain {

	public static void main(String[] args) {

		// 부모인터페이스의 참조변수로 자식객체를 참조하는 이질화 형태
		/*
		 둘 다 오버라이딩 된 건 맞으나 'IFigure figure = new Circle(30)'를 통해서
		 figure가 부모인 IFigure타입으로 선언되었기 때문에 area메소드는 바로 호출할 수 있으나
		 또 다른 부모인 IDrawable의 draw메소드는 바로 호출 할 수가 없다.
		 이를 해결하기 위해 figure를 자식클래스인 Circle로 다운캐스팅하여야만 메소드를 호출할 수 있다.
		 */
		IFigure figure = new Circle(30);
		figure.area("원"); // 오버라이딩 되었으므로 별도의 형변환 없이 즉시 호출 가능
		((Circle)figure).draw("나도 원"); // 자식 객체에 접근하기 위해 다운캐스팅 후 메소드 호출 가능
		
		IFigure fig1 = new Rectangle(100, 90);
		fig1.area("사각형");
		((Rectangle)fig1).draw("사각형");
		
		IDrawable draw = new Triangle(100,90);
		draw.draw("삼각형");
		((Triangle)draw).draw("삼각형");
		
		/*
		 자식인 Circle 참조변수가 동일 객체를 참조하는 동질화 형태로
		 오버라이딩 되어 있으므로 위와 같이 강제 형변환을 할 필요 없이 접근 가능
		 */
		Circle circle = new Circle(40);
		circle.area("원");
		circle.draw("나도 원");
	}

}
