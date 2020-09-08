package sample.button;

import javafx.scene.control.Button;
import sample.manage.Panel;
import sample.mode.Mode;
import sample.mode.selectMode;

public class selectButton extends UMLButton {

    public selectButton(String text , Panel p) {
        super(text , p);
        this.mode = new selectMode() ;
        this.setLayoutX(47d);
        this.setLayoutY(73d);
        this.setPrefWidth(150d);
        this.setPrefHeight(100d);
    }

}
