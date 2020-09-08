package sample.manage;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import sample.button.*;
import sample.menu.menuBar;

import java.util.ArrayList;


public class Panel extends AnchorPane {
    private ArrayList<Button> BBB = new ArrayList<>() ;
    public Panel(){
        this.setStyle("-fx-background-color:gray");
        Canvas canvas = new DrawCanvas(964d , 705d) ;
        this.getChildren().add(canvas) ;
        this.getChildren().add(new menuBar(1200 , 34)) ;
        addButton(new selectButton("select" , this));
        addButton(new assocLineButton("association\nLine" , this)) ;
        addButton(new generLineButton("generalization\nLine" , this)) ;
        addButton(new compLineButton("composition\nLine" , this)) ;
        addButton(new classButton("class" , this)) ;
        addButton(new useCaseButton("useCase" , this)) ;
        initColor();

    }
    private void addButton(Button btn){
        this.BBB.add(btn) ;
        this.getChildren().add(btn) ;
    }
    public void initColor(){
        for(Button b : BBB){
            ((UMLButton)b).drawButtonBlue();
        }
    }

}
