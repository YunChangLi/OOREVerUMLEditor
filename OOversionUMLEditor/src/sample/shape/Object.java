package sample.shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class Object extends Shape{

    protected int width ;
    protected int height ;
    protected Point2D center ;
    protected Point2D up ;
    protected Point2D down ;
    protected Point2D left ;
    protected Point2D right ;
    protected String name ;

    port[] portlist = new port[4];
    //0:up , 1:down , 2:left , 3:right

    public Object(int width , int height , Point2D center , String name){
        this.width = width ;
        this.height = height ;
        this.center = center ;
        this.name = name ;
        this.up = new Point2D(0 , -height/2) ;
        this.down = new Point2D(0 , height/2) ;
        this.left = new Point2D(-width/2 , 0) ;
        this.right = new Point2D(width/2 , 0) ;
        newport(this);

    }
    @Override
    public void drawShape(GraphicsContext gc) {

    }

    @Override
    public boolean isSelectShape(double x , double y) {
        if(x >= center.getX()-width/2 && x <= center.getX()+width/2){
            if(y >= center.getY()-height/2 && y <= center.getY()+height/2){
                return true ;
            }
            return false ;
        }
        return false ;
    }

    @Override
    public void moveTheOBJ(double distX, double distY) {
        this.center = this.center.add(distX , distY) ;
    }

    protected void newport(Object parent){
        portlist[0] = new port(parent , this.up);
        portlist[1] = new port(parent , this.down);
        portlist[2] = new port(parent , this.left);
        portlist[3] = new port(parent , this.right);

    }
    protected void selectedDraw(GraphicsContext gc){
        for(port p : portlist){
            //System.out.println(center.getX()) ;
            p.drawShape(gc);
        }
    }

    @Override
    public port getThePort(double x , double y){
        Point2D vec = new Point2D(x - center.getX() , y - center.getY()) ;
        Point2D base = new Point2D(1 , 0) ;
        double angle = base.angle(vec) ;
        //System.out.println(angle);
        if(angle >= 0 && angle <= 45){ /**右**/
            //System.out.println("右") ;
            return portlist[3] ;
        }
        else if(angle > 45 && angle <= 135 && y <= center.getY()){/**上**/
            //System.out.println("上") ;
            return portlist[0] ;
        }
        else if(angle > 135 && angle <= 180){/**左**/
            //System.out.println("左") ;
            return portlist[2] ;
        }
        else if(angle > 45 && angle <= 135&& y > center.getY()){/**下**/
            //System.out.println("下") ;
            return portlist[1] ;

        }
        else{return null ;}
    }
    public void changeName(String name){
        this.name = name ;
    }

}
