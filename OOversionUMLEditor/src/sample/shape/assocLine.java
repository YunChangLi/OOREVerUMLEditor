package sample.shape;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class assocLine extends Line{

    public assocLine(port pStart , port pEnd){
        super(pStart , pEnd) ;

    }

    @Override
    public void drawShape(GraphicsContext gc) {
        drawLine(gc);
        drawTriangle(1 , gc) ;

    }
}
