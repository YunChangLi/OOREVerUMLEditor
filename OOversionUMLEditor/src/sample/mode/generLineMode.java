package sample.mode;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import sample.manage.DrawCanvas;
import sample.shape.assocLine;
import sample.shape.generLine;
import sample.shape.port;

public class generLineMode extends Mode{
    Point2D start ;
    Point2D end ;
    @Override
    public void actionPerform(Canvas canvas) {
        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                start = new Point2D(mouseEvent.getX() , mouseEvent.getY()) ;
            }
        });
        canvas.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                end = new Point2D(mouseEvent.getX() , mouseEvent.getY()) ;
                port sPort = ((DrawCanvas)canvas).getThePort(start.getX() , start.getY()) ;
                port ePort = ((DrawCanvas)canvas).getThePort(end.getX() , end.getY()) ;

                /*System.out.println(sPort);
                System.out.println(ePort);*/

                if(sPort != null && ePort != null){
                    ((DrawCanvas)canvas).AddShape(new generLine(sPort , ePort));
                }
                ((DrawCanvas)canvas).DrawHistory();
            }
        });
        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });
        System.out.println("gener") ;

    }
}
