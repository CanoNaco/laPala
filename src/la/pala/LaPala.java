package la.pala;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LaPala extends Application {
    
    int stickPosY = (400 - 50) / 2;
        
    public void start(Stage primaryStage) {
        
                Pane root = new Pane();
                
        Scene ventana = new Scene(root, 600, 400);
        
        primaryStage.setTitle("laPala");
        primaryStage.setScene(ventana);
        primaryStage.show();
        
        Rectangle rectStick = new Rectangle(500, stickPosY, 7, 50);
        rectStick.setFill(Color.BLUEVIOLET);
        root.getChildren().add(rectStick);
    }
    
    
    
}
