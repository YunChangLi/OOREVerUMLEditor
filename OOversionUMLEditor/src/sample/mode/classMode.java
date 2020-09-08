package sample.mode;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import sample.manage.* ;
import sample.shape.RectObject;

public class classMode extends Mode{
    @Override
    public void actionPerform(Canvas canvas) {
        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                Point2D p = new Point2D(mouseEvent.getX() , mouseEvent.getY()) ;
                ((DrawCanvas)canvas).AddShape(new RectObject(100 , 150 , p , "classA"));
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
        System.out.println("class") ;
    }
}
