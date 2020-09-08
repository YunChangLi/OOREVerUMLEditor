package sample.button;

import javafx.scene.control.Button;
import sample.manage.Panel;
import sample.mode.Mode;
import sample.mode.assocLineMode;

public class assocLineButton extends UMLButton {

    public assocLineButton(String text , Panel p) {
        super(text , p);
        this.mode = new assocLineMode() ;
        this.setLayoutX(47d);
        this.setLayoutY(193d);
        this.setPrefWidth(150d);
        this.setPrefHeight(100d);
    }
}
