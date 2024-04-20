
package pk.cui.sc.fm;

import java.util.ArrayList;

public class PkCuiScFm {

   
    public static void main(String[] args) {
     /*  ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		CricleGeometry cricleGeomerty = new CricleGeometry();
		SquareGeometry squareGeometry = new SquareGeometry();
		TraingleGeometey triangleGeometry =new TraingleGeometey();
                
		shapes.add(cricleGeomerty.createShape());
		shapes.add(squareGeometry.createShape());
		shapes.add(squareGeometry.createShape());
                shapes.add(triangleGeometry.createShape());
		
		for(Shape s:shapes){
			s.draw();
		}

	}*/
     Shape circle = GeometryFactory.getShape("CIRCLE");
        if (circle != null) {
            circle.draw();
        }

        // Get a triangle and draw
        Shape triangle = GeometryFactory.getShape("TRIANGLE");
        if (triangle != null) {
            triangle.draw();
        }

        // Get a square and draw
        Shape square = GeometryFactory.getShape("SQUARE");
        if (square != null) {
            square.draw();
        }
    }
    }
    

