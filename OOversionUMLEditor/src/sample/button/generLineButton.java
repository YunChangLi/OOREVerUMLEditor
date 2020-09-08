package sample.button;

import javafx.scene.control.Button;
import sample.manage.Panel;
import sample.mode.Mode;
import sample.mode.generLineMode;

public class generLineButton extends UMLButton {

    public generLineButton(String text , Panel p) {
        super(text , p);
        this.mode = new generLineMode() ;
        this.setLayoutX(47d);
        this.setLayoutY(313d);
        this.setPrefWidth(150d);
        this.setPrefHeight(100d);
    }
}
