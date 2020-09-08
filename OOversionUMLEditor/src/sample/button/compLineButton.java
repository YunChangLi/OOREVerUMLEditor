package sample.button;

import javafx.scene.control.Button;
import sample.manage.Panel;
import sample.mode.Mode;
import sample.mode.compLineMode;

public class compLineButton extends UMLButton {

    public compLineButton(String text , Panel p) {
        super(text , p);
        this.mode = new compLineMode() ;
        this.setLayoutX(47d);
        this.setLayoutY(433d);
        this.setPrefWidth(150d);
        this.setPrefHeight(100d);
    }
}
