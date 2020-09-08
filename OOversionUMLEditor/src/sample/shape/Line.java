package sample.shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Line extends Shape{

    protected port pStart ;
    protected port pEnd ;
    public Line(port pStart , port pEnd){
        this.pStart = pStart ;
        this.pEnd = pEnd ;
        this.pStart.addStartLine(this);
    }
    @Override
    public void drawShape(GraphicsContext gc) {

    }

    @Override
    public boolean isSelectShape(double x, double y) {
        return false;
    }

    @Override
    public void moveTheOBJ(double distX, double distY) {

    }

    protected void drawLine(GraphicsContext gc){

        gc.setStroke(Color.BLACK);
        gc.strokeLine(pStart.getCenter().getX() , pStart.getCenter().getY()
                , pEnd.getCenter().getX() , pEnd.getCenter().getY());

    }
    protected void drawLine(GraphicsContext gc , Point2D start , Point2D end){

        gc.setStroke(Color.BLACK);
        gc.strokeLine(start.getX() , start.getY()
                , end.getX() , end.getY());

    }
    public ArrayList<Point2D> drawTriangle(int scalar , GraphicsContext gc){

        Point2D p1 = pStart.getCenter() ;
        Point2D p2 = pEnd.getCenter() ;
        ArrayList<Point2D> threePointForTriangle = new ArrayList<Point2D>() ;
        double distance = p1.distance(p2) ;

        Point2D normalVec = new Point2D((p2.getY()-p1.getY()) , -1*(p2.getX()-p1.getX())) ;

        Point2D unitVec = new Point2D((p2.getX()-p1.getX())/distance , (p2.getY()-p1.getY())/distance) ;

        Point2D p = new Point2D(p2.getX()-unitVec.getX()*10 , p2.getY()-unitVec.getY()*10) ;

        Point2D triangleP1 = new Point2D(p.getX() + normalVec.getX()*0.02 , p.getY()+normalVec.getY()*0.02) ;
        Point2D triangleP2 = new Point2D(p.getX() - normalVec.getX()*0.02 , p.getY()-normalVec.getY()*0.02) ;
        Point2D triangleP3 = new Point2D(p2.getX()-unitVec.getX()*10*scalar , p2.getY()-unitVec.getY()*10*scalar) ;

        threePointForTriangle.add(triangleP1) ;
        threePointForTriangle.add(triangleP2) ;
        threePointForTriangle.add(triangleP3) ;

        gc.setStroke(Color.BLACK);
        gc.strokeLine(p2.getX() , p2.getY() , triangleP1.getX() , triangleP1.getY());
        gc.strokeLine(p2.getX() , p2.getY() , triangleP2.getX() , triangleP2.getY());

        return  threePointForTriangle;
    }
    /*public ArrayList<Point2D> drawTriangle2(int size , GraphicsContext gc){
        Point2D p1 = pStart.getCenter() ;
        Point2D p2 = pEnd.getCenter() ;
        ArrayList<Point2D> pointList = new ArrayList<>() ;

        Point2D coordinateY = new Point2D(0 , -1*size) ;
        Point2D coordinateX = new Point2D(-1*size , 0) ;
        pointList.add(p2.add(coordinateY)) ;
        pointList.add(p2.add(coordinateX)) ;




    }*/

    /*public ArrayList<Point2D> changeTheForm(GraphicsContext gc){
        Point2D p1 = pStart.getCenter() ;
        Point2D p2 = pEnd.getCenter() ;
        ArrayList<Point2D> pointList = new ArrayList<>() ;

        double width = Math.abs(p2.getX() - p1.getX()) ;
        double height = Math.abs(p2.getY() - p1.getY()) ;
        double slope = (p2.getY() - p1.getY())/(p2.getX() - p1.getX()) ;
        System.out.println(slope);
        return pointList ;


    }*/
}
