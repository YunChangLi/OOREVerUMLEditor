package sample.manage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import sample.shape.Object;
import sample.shape.Shape;
import java.util.ArrayList;
import sample.mode.* ;
import sample.shape.*;

public class DrawCanvas extends Canvas {
    private GraphicsContext gc ;
    private ArrayList<Shape> shapeList = new ArrayList<Shape>() ;
    private ArrayList<GroupObject> groupList = new ArrayList<>() ;
    public DrawCanvas(double width, double height){

        super(width , height);
        this.setLayoutX(208d);
        this.setLayoutY(72d);
        gc = this.getGraphicsContext2D() ;
        drawBackGround();
        modeHandler.getModeHandler().setTheCanvas(this);

    }
    public void drawBackGround(){
        gc.setFill(Color.WHITE);
        gc.fillRect(0 , 0 , this.getWidth() , this.getHeight());

    }
    public void AddShape(Shape temp){

        shapeList.add(temp) ;
        temp.setShapeID(shapeList.size()-1);
    }

    public void DrawHistory(){ //repaint
        drawBackGround();

        for(Shape shape : shapeList){
            shape.drawShape(gc);
        }
    }
    public boolean isInsideShape(double x , double y){
        for(int i = shapeList.size()-1 ; i >=0 ; i --){

            if(shapeList.get(i).isSelectShape(x,y)){
                return true ;
            }
        }
        return false ;
    }
    public Shape getInsideShape(double x , double y){
        for(int i = shapeList.size()-1 ; i >=0 ; i --){

            if(shapeList.get(i).isSelectShape(x,y)){
                return shapeList.get(i) ;
            }
        }
        return null ;
    }
    public port getThePort(double x , double y){
        if(isInsideShape(x , y)){
            Shape temp = getInsideShape(x , y) ;
            return temp.getThePort(x , y) ;
        }
        return null ;
    }
    public void initTheSelect(){
        for(Shape shape : shapeList){
            shape.setSelected(false);
        }
    }
    public ArrayList<Shape> getSelectedShape(){
        ArrayList<Shape> temp =  new ArrayList<>() ;
        for (Shape s : shapeList){
            if(s.getSelected()){
                temp.add(s) ;
            }
        }
        return temp ;
    }
    public void unGrouping(){

        int index = -1;
        for(int i = shapeList.size()-1 ; i >= 0 ; i--){
            System.out.println(shapeList.getClass().getName()) ;
            System.out.println(GroupObject.class.getName()) ;
            if(shapeList.get(i).getClass().getName() == GroupObject.class.getName()){
                index = i ;
                break ;
            }
        }
        if(index >=0){destoryTheShapeElement(index);}
    }
    public void destoryTheShapeElement(int index){
        shapeList.remove(index) ;
    }

}
