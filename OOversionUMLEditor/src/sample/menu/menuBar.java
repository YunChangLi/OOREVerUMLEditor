package sample.menu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class menuBar extends MenuBar {
    public menuBar(double width , double height){
        this.setPrefWidth(width);
        this.setPrefHeight(height);
        this.getMenus().add(new FileMenu("file")) ;
        this.getMenus().add(new EditMenu("edit")) ;


    }
}
