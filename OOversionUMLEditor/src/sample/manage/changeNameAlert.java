package sample.manage;
import javafx.scene.control.TextInputDialog;

public class changeNameAlert extends TextInputDialog {
    public changeNameAlert(String title){
        this.setTitle(title);
        this.setHeaderText("請找更改名稱");
        this.setContentText("選擇的物件名稱要改成什麼?");

    }
}
