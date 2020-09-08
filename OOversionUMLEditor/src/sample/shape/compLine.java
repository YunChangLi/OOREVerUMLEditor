package sample.shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class compLine extends Line{

    public compLine(port pStart , port pEnd){
        super(pStart , pEnd);
    }
    @Override
    public void drawShape(GraphicsContext gc) {
        ArrayList<Point2D> temp = drawTriangle(2 , gc) ;
        drawLine(gc);
        drawLine(gc , temp.get(2) , temp.get(0));
        drawLine(gc , temp.get(1) , temp.get(2));

    }
}
