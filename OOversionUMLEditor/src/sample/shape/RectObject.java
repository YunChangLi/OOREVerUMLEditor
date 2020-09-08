package sample.shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RectObject extends Object{

    public RectObject(int width , int height , Point2D center , String name){
        super(width , height , center , name) ;

    }
    @Override
    public void drawShape(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRect(center.getX()-width/2 , center.getY()-height/2 , width , height);
        gc.setStroke(Color.BLACK);
        gc.strokeRect(center.getX()-width/2 , center.getY()-height/2 , width , height);
        gc.strokeText(this.name , center.getX()-width/4 , center.getY());
        if(isSelected){

            selectedDraw(gc);
        }
    }
}
