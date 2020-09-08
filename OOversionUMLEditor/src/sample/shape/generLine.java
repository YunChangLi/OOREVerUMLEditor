package sample.shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class generLine extends Line{
    public generLine(port pStart , port pEnd){
        super(pStart , pEnd);

    }

    @Override
    public void drawShape(GraphicsContext gc) {
        ArrayList<Point2D> temp = drawTriangle(1 , gc) ;
        drawLine(gc);
        drawLine(gc , temp.get(1) , temp.get(0));

    }
}
