package sample.menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.MenuItem;
import sample.manage.DrawCanvas;
import sample.mode.modeHandler;
import sample.shape.GroupObject;

public class unGroupMenuItem extends MenuItem {
    public unGroupMenuItem(String text){
        super(text) ;
        clickAction();
    }
    public void clickAction(){
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Canvas temp = modeHandler.getModeHandler().getTheCanvas() ;
                ((DrawCanvas)temp).unGrouping();
                ((DrawCanvas)temp).DrawHistory();
            }
        });
    }
}
