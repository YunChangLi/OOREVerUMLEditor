package sample.menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextInputDialog;
import sample.manage.DrawCanvas;
import sample.manage.changeNameAlert;
import sample.mode.modeHandler;
import sample.shape.GroupObject;
import sample.shape.Object;
import sample.shape.Shape;

import java.util.NoSuchElementException;
import java.util.Optional;

public class chnageNameMenuItem extends MenuItem {
    public chnageNameMenuItem(String text){
        super(text) ;
        clickAction();
    }
    public void clickAction(){
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String answer ;
                Canvas temp = modeHandler.getModeHandler().getTheCanvas() ;
                if(((DrawCanvas)temp).getSelectedShape().size() == 1 &&
                        ((DrawCanvas)temp).getSelectedShape().get(0).getClass().getName() != GroupObject.class.getName()){
                    Shape s = ((DrawCanvas)temp).getSelectedShape().get(0) ;
                    TextInputDialog dialog = new changeNameAlert("改變名稱") ;
                    dialog.showAndWait() ;
                    try{
                        answer = dialog.getResult() ;
                        ((Object)s).changeName(answer);

                    }catch(final NoSuchElementException ex){
                        answer = null;
                    }
                }
                ((DrawCanvas) temp).DrawHistory();



            }
        });
    }
}
