package sample.button;

import javafx.scene.control.Button;
import sample.manage.Panel;
import sample.mode.Mode;
import sample.mode.classMode;

public class classButton extends UMLButton {

    public classButton(String text , Panel p){
        super(text , p) ;
        this.mode = new classMode() ;
        this.setLayoutX(47d);
        this.setLayoutY(553d);
        this.setPrefWidth(150d);
        this.setPrefHeight(100d);

    }
}
