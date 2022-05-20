
package goaltest;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;


import java.util.Stack;

public class GoalTest extends Application {
    public static Pane root = new Pane();

    
    @Override
    public void start(Stage primaryStage) {
        Text buttonTxt = new Text("Recursion,Collections FrameWork,MultiThreading..");
        Font font = Font.font("Cooper Black",17);
        buttonTxt.setLayoutX(737);
        buttonTxt.setLayoutY(250);
        buttonTxt.setFont(font);
        Pane buttons = new Pane();

        Button button1 = new Button("JAVA ADVANCED");
        button1.setLayoutY(268);
        button1.setLayoutX(793);
        button1.setMinWidth(210);

        buttons.getChildren().addAll(button1);
        button1.setId("pane1");

        root.setId("pane");
        root.getChildren().addAll(buttons);





        Scene scene = new Scene(root, 1024, 640, Color.rgb(50,50,50));

        scene.getStylesheets().addAll(this.getClass().getResource("background.css").toExternalForm());
        primaryStage.setTitle("Java Learning Path");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setMaximized(true);

        button1.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                button1.setId("pane2");
                root.getChildren().add(buttonTxt);



            }
        });
        button1.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                button1.setId("pane1");
            }
        });




    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
