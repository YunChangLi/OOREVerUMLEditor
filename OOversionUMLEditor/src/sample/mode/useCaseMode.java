package sample.mode;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import sample.manage.DrawCanvas;
import sample.shape.EllipseObject;
import sample.shape.RectObject;

public class useCaseMode extends Mode{
    @Override
    public void actionPerform(Canvas canvas) {
        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Point2D p = new Point2D(mouseEvent.getX() , mouseEvent.getY()) ;
                ((DrawCanvas)canvas).AddShape(new EllipseObject(150 , 100 , p , "useCaseA"));
                ((DrawCanvas)canvas).DrawHistory();
            }
        });
        canvas.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });
        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });
        System.out.println("use");
    }
}
