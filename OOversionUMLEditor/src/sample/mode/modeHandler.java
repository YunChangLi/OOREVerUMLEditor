package sample.mode;

import javafx.scene.canvas.Canvas;

public class modeHandler {
    private Mode mode ;
    private Canvas canvas;
    private static modeHandler currentMode ;
    public static modeHandler getModeHandler(){
        if(currentMode == null){
            currentMode = new modeHandler() ;
        }
        return currentMode ;
    }
    public Mode getTheMode(){
        return mode ;
    }
    public void setTheMode(Mode mode){
        this.mode = mode ;
    }
    public void setTheCanvas(Canvas canvas){
        this.canvas = canvas ;
    }
    public Canvas getTheCanvas(){
        return canvas ;
    }
}
