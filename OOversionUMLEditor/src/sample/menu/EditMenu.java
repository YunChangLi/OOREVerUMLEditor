package sample.menu;

import javafx.scene.control.Menu;

public class EditMenu extends Menu {
    public EditMenu(String text){
        super(text) ;
        this.getItems().add(new chnageNameMenuItem("changeName")) ;
        this.getItems().add(new groupMenuItem("group")) ;
        this.getItems().add(new unGroupMenuItem("ungroup")) ;
    }
}
