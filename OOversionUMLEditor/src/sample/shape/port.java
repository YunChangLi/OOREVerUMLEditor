package sample.shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class port extends Shape{
    public Object parent ;
    private int width = 10 ;
    private int height = 10 ;
    Point2D displace ; //Object center的位移量
    ArrayList<Line> startlines = new ArrayList<>() ;
    public port(Object parent , Point2D displace){
        this.parent = parent ;
        this.displace = displace  ;
    }
    @Override
    public void drawShape(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(parent.center.getX()+displace.getX()-width/2 , parent.center.getY()+displace.getY()-height/2 , width , height);
    }

    @Override
    public boolean isSelectShape(double x, double y) {
        return false;
    }

    @Override
    public void moveTheOBJ(double distX, double distY) {

    }

    public Point2D getCenter(){
        return parent.center.add(displace) ;
    }
    public void  addStartLine(Line line){
        startlines.add(line) ;
        /*for(Line a : startlines){
            System.out.println(a) ;
        }*/
    }

}
