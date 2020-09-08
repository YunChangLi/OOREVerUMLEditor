package sample.button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import sample.manage.Panel;
import sample.mode.*;

public class UMLButton extends Button {
    protected Mode mode ;
    protected Panel p;
    public UMLButton(String text , Panel p){
        super(text) ;
        this.mode = mode ;
        this.p = p ;
        clickButton() ;
    }
    public void clickButton(){
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(mode) ;
                mode.actionPerform(modeHandler.getModeHandler().getTheCanvas());
                p.initColor();
                drawButtonBlack();
            }
        });
    }
    public void drawButtonBlack(){

        this.setTextFill(Color.WHITE);
        this.setStyle("-fx-background-color: #000000");
    }
    public void drawButtonBlue(){
        this.setTextFill(Color.WHITE);
        this.setStyle("-fx-background-color: #2f4655");
    }
}
