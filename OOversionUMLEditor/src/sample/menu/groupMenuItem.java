package sample.menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.MenuItem;
import sample.manage.DrawCanvas;
import sample.shape.GroupObject;
import sample.mode.* ;
import sample.shape.Shape;

public class groupMenuItem extends MenuItem {
    public groupMenuItem(String text){
        super(text) ;
        clickAction();
    }
    public void clickAction(){
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Canvas temp = modeHandler.getModeHandler().getTheCanvas() ;
                if(((DrawCanvas)temp).getSelectedShape().size()>1){
                    System.out.println("grouping");
                    GroupObject gpOBJ = new GroupObject() ;
                    gpOBJ.AddChildren(((DrawCanvas)temp).getSelectedShape());
                    ((DrawCanvas)temp).AddShape(gpOBJ);
                    ((DrawCanvas)temp).DrawHistory();
                }

            }
        });
    }
}
