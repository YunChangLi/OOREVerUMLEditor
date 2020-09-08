package sample.button;
import javafx.scene.control.Button ;
import sample.manage.Panel;
import sample.mode.Mode;
import sample.mode.useCaseMode;

public class useCaseButton extends UMLButton {

    public useCaseButton(String text , Panel p){
        super(text , p) ;
        this.mode = new useCaseMode() ;
        this.setLayoutX(47d);
        this.setLayoutY(673d);
        this.setPrefWidth(150d);
        this.setPrefHeight(100d);

    }
}
