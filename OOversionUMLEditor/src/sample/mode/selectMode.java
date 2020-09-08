package sample.mode;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import sample.manage.DrawCanvas;
import sample.shape.GroupObject;
import sample.shape.Object;
import sample.shape.Shape;

public class selectMode extends Mode{

    private Point2D start ;
    private Point2D end ;

    @Override
    public void actionPerform(Canvas canvas) {
        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                start = new Point2D(mouseEvent.getX() , mouseEvent.getY()) ;
                ((DrawCanvas)canvas).initTheSelect();
            }
        });
        canvas.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                end = new Point2D(mouseEvent.getX() , mouseEvent.getY()) ;
                if(start.getX() == end.getX() && start.getY() == end.getY() ){ //press one position

                    if(((DrawCanvas)canvas).isInsideShape(end.getX() , end.getY())){
                        ((DrawCanvas)canvas).getInsideShape(end.getX() , end.getY()).setSelected(true);

                    }

                }
                else{ //Drag the mouse


                    if(((DrawCanvas)canvas).isInsideShape(start.getX() , start.getY())){ //move the shape
                        Shape temp = ((DrawCanvas)canvas).getInsideShape(start.getX() , start.getY());
                        temp.setSelected(true);
                        temp.moveTheOBJ(end.getX()-start.getX() , end.getY()-start.getY());

                    }
                    else{ //select multi-shape
                        for(double x = start.getX() ; x <= end.getX() ; x ++){
                            for(double y = start.getY() ; y <= end.getY() ; y ++){
                                if(((DrawCanvas)canvas).isInsideShape(x , y)){
                                    ((DrawCanvas)canvas).getInsideShape(x , y).setSelected(true);
                                    //System.out.println(((DrawCanvas)canvas).getInsideShape(x , y));
                                }

                            }
                        }
                    }

                }
                ((DrawCanvas)canvas).DrawHistory();

            }
        });
        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });
        System.out.println("sele") ;
    }
}
