package sample.shape;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {
    protected int shapeID = -1 ;
    protected boolean isSelected = false  ;
    public abstract void drawShape(GraphicsContext gc) ;
    public abstract boolean isSelectShape(double x , double y) ;
    public void setSelected(boolean isSelected){
        this.isSelected = isSelected ;
    }
    public port getThePort(double x , double y){
        return null ;
    }
    public boolean getSelected(){
        return this.isSelected ;
    }
    public void setShapeID(int index){
        this.shapeID = index ;
    }
    public int getShapeID(){
        return this.shapeID;
    }
    public abstract void moveTheOBJ(double distX , double distY) ;
}
