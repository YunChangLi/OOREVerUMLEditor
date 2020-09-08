package sample.shape;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public class GroupObject extends Shape{
    private ArrayList<Shape> children = new ArrayList<>() ;
    double width ;
    double height ;


    public GroupObject(){

    }
    @Override
    public void drawShape(GraphicsContext gc) {

    }

    @Override
    public boolean isSelectShape(double x, double y) {
        for(Shape s : children){
            if(s.isSelectShape(x , y)){return true ;}

        }
        return false ;
    }

    @Override
    public void moveTheOBJ(double distX, double distY) {
        for(Shape s : children){
            s.moveTheOBJ(distX , distY);
        }
    }

    @Override
    public void setSelected(boolean isSelected) {
        super.setSelected(isSelected);
        for (Shape s : children){
            s.setSelected(isSelected);
        }
    }
    @Override
    public port getThePort(double x , double y){
        /*for (Shape s : children){
            if(s.getThePort(x , y)!=null){
                return s.getThePort(x , y) ;
            }
        }*/
        return null ;
    }
    public void AddChild(Shape shape){
        children.add(shape) ;
    }
    public void AddChildren(ArrayList<Shape> shapes){

        children.addAll(shapes) ;
        for(Shape s : children){
            System.out.println(s +"and" +  s.getShapeID());
        }

    }
    public ArrayList<Shape> destoryGroup(){
        return children ;
    }
}
